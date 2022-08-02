package org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons.Button;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons.MacOSButton;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes.Checkbox;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
