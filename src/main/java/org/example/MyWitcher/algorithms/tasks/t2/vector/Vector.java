package org.example.MyWitcher.algorithms.tasks.t2.vector;

/**
 * Создайте класс, который описывает вектор (в трёхмерном пространстве).
 *
 * У него должны быть:
 *
 * Конструктор с параметрами в виде списка координат x, y, z
 * метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
 *      sqrt{x^2 + y^2 + z^2}
 *
 * метод, вычисляющий скалярное произведение:
 *      x_1x_2 + y_1y_2 + z_1z_2
 *
 * метод, вычисляющий векторное произведение с другим вектором:
 *      (y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)
 *
 * метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
 *      frac{(a,b)}{|a| \cdot |b|}
 *
 * методы для суммы и разности:
 *      (x_1 + x_2, y_1 + y_2, z_1 + z_2)
 *      (x_1 - x_2, y_1 - y_2, z_1 - z_2)
 *
 * Статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * */
public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длина вектора. Корень из суммы квадратов
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // метод, вычисляющий скалярное произведение
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector) {
        return new Vector(
          y * vector.z - z * vector.y,
          z * vector.x - x * vector.z,
          x * vector.y - y * vector.x
        );
    }
    // Косинус между двумя векторами
    public double cos(Vector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    public Vector add(Vector vector) {
        return new Vector(
          x + vector.x,
          y + vector.y,
          z + vector.z
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
          x - vector.x,
          y - vector.y,
          z - vector.z
        );
    }

    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
