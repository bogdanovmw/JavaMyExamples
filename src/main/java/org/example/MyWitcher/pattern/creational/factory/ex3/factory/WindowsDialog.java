package org.example.MyWitcher.pattern.creational.factory.ex3.factory;

import org.example.MyWitcher.pattern.creational.factory.ex3.buttons.Buttons;
import org.example.MyWitcher.pattern.creational.factory.ex3.buttons.WindowsButtons;

public class WindowsDialog extends Dialog {
    @Override
    public Buttons createButtons() {
        return new WindowsButtons();
    }
}
