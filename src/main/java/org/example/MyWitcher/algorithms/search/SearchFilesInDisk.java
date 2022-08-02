package org.example.MyWitcher.algorithms.search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFilesInDisk {
    // Поиск картинок во всех папках и подпапках на диске D через рекурсию
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFiles(new File("D:\\"), fileList);
        fileList.forEach(System.out::println);
    }

    private static void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()){
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null){
                for (File file : directoryFiles) {
                    if (file.isDirectory()){
                        searchFiles(file, fileList); // Вызывает сам себя
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")){ // ищем jpg
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
