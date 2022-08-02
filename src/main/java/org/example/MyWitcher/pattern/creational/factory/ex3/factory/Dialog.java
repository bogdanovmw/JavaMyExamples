package org.example.MyWitcher.pattern.creational.factory.ex3.factory;

import org.example.MyWitcher.pattern.creational.factory.ex3.buttons.Buttons;

public abstract class Dialog {
    public void render() {
        Buttons okButton = createButtons();
        okButton.render();
    }

    public abstract Buttons createButtons();
}
