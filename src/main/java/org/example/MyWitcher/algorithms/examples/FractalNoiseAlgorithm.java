package org.example.MyWitcher.algorithms.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;

// Алгоритм генерации фрактального шума.
public class FractalNoiseAlgorithm {
    private static final int IMAGE_WIDTH = 1920;
    private static final int IMAGE_HEIGHT = 1080;


    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB);

        FractalNoise fractalNoise = new FractalNoise(512,
                new Random(image.getWidth(), 100000), 9);

        int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
        int pixelIndex = 0;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int value = 0xff & (int)(fractalNoise.getValue(j, i) * 255);
                pixels[pixelIndex++] = 0xff000000 | value << 16 | value << 8 | value;
            }
        }
        showImageWindow(image, IMAGE_WIDTH, IMAGE_HEIGHT);
    }

    static void showImageWindow(Image image, int width, int height) {
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel picLabel = new JLabel(new ImageIcon(image));

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(picLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static class FractalNoise {
        int baseScale;
        Random random;
        ArrayList<Noise> octaves = new ArrayList<>();

        public FractalNoise(int baseScale, Random random, int octavesCount) {
            this.baseScale = baseScale;
            this.random = random;

            int scale = baseScale;
            for (int i = 0; i < octavesCount; i++) {
                octaves.add(new Noise(scale, random));
                scale = scale / 2;
            }
        }

        public float getValue(int x, int y) {
            float sum = 0;
            float fraction = 0.5f;

            for (Noise noise : octaves){
                sum += noise.getValue(x, y) * fraction;
                fraction *= 0.5;
            }

            return sum;
        }
    }

    static class Noise {
        int scale;
        Random random;

        public Noise(int scale, Random random) {
            this.scale = scale;
            this.random = random;
        }

        public float getValue(int x, int y){
            int xGrid = x / scale;
            int yGrid = y / scale;
            int xGridNext = xGrid + 1;
            int yGridNext = yGrid + 1;

            int xStart = xGrid * scale;
            int xEnd = xGridNext * scale;
            int yStart = yGrid * scale;
            int yEnd = yGridNext * scale;

            float value12 = random.getRandomValue(xGrid, yGrid);
            float value22 = random.getRandomValue(xGridNext, yGrid);
            float value21 = random.getRandomValue(xGridNext, yGridNext);
            float value11 = random.getRandomValue(xGrid, yGridNext);

            float S = ((xEnd - xStart) * (yEnd - yStart));
            float w12 = ((float) (xEnd - x) * (yEnd - y)) / S;
            float w22 = ((float) (x - xStart) * (yEnd - y)) / S;
            float w21 = ((float) (x - xStart) * (y - yStart)) / S;
            float w11 = ((float) (xEnd - x) * (y - yStart)) / S;

            return value11 * w11 + value12 * w12 + value21 * w21 + value22 * w22;
        }
    }

    static class Random {
        int[] table;
        int lineWidth;

        public Random(int lineWidth, int size) {
            table = new int[size];
            for (int i = 0; i < size; i++) {
                table[i] = Math.random() >= 0.5 ? 1 : 0;
            }
            this.lineWidth = lineWidth;
        }

        public int getRandomValue(int x, int y) {
            return table[(x + y * lineWidth) % table.length];
        }
    }
}


