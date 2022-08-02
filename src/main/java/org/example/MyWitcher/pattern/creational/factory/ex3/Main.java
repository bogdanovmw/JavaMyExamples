package org.example.MyWitcher.pattern.creational.factory.ex3;

import org.example.MyWitcher.pattern.creational.factory.ex3.factory.Dialog;
import org.example.MyWitcher.pattern.creational.factory.ex3.factory.HtmlDialog;
import org.example.MyWitcher.pattern.creational.factory.ex3.factory.WindowsDialog;

public class Main {
    public static void main(String[] args) {
//        Dialog dialog = configure("windows");
//        dialog.render();

        Dialog d1 = new WindowsDialog();
        d1.render();
    }

    static Dialog configure(String str) {
        Dialog dialog = null;
        if (str.equals("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
        return dialog;
    }
}
