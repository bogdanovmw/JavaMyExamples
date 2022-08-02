package org.example.MyWitcher.pattern.structural.bridge.banks;

import org.example.MyWitcher.pattern.structural.bridge.dev.Developer;
import org.example.MyWitcher.pattern.structural.bridge.banks.Program;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system ...");
        developer.writeCode();
    }
}
