package org.example.MyWitcher.java.core.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        String path = "src/main/resources/config.properties";
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(path)){
            properties.load(fileInputStream);

            String host = properties.getProperty("db.host");
            String login = properties.getProperty("db.login");
            String password = properties.getProperty("db.password");

            System.out.println(host);
            System.out.println(login);
            System.out.println(password);
        } catch (IOException e) {
            System.out.println("Файл свойств не найден!");
        }
    }
}