package org.example.MyWitcher.pattern.creational.abstractfactory.ex2.factories;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.buttons.Button;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex2.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
