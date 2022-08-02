package org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Вы создали WindowsButton.");
    }
}
