package org.example.MyWitcher.pattern.creational.factory.ex3.buttons;

public class HtmlButton implements Buttons {
    @Override
    public void render() {
        System.out.println("HtmlButton render");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("HtmlButton onClick");
    }
}
