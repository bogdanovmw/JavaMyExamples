package org.example.MyWitcher.pattern.creational.factory.ex3.buttons;

public class WindowsButtons implements Buttons {
    @Override
    public void render() {
        System.out.println("WindowsButton render");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton onClick");
    }
}
