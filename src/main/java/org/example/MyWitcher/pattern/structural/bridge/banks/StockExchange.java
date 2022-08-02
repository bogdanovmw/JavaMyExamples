package org.example.MyWitcher.pattern.structural.bridge.banks;

import org.example.MyWitcher.pattern.structural.bridge.dev.Developer;
import org.example.MyWitcher.pattern.structural.bridge.banks.Program;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange ...");
        developer.writeCode();
    }
}
