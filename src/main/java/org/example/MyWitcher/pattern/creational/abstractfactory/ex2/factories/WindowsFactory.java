package org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons.Button;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons.WindowsButton;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes.Checkbox;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
