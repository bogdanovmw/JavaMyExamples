package org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Вы создали WindowsCheckbox.");
    }
}