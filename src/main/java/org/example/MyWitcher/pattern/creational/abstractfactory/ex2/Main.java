package org.example.MyWitcher.pattern.creational.abstractfactory.ex2;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories.GUIFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories.MacOSFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories.WindowsFactory;

import java.util.Locale;

public class Main {
    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
