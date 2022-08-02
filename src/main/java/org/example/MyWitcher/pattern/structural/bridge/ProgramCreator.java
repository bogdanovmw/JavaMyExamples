package org.example.MyWitcher.pattern.structural.bridge;

import org.example.MyWitcher.pattern.structural.bridge.banks.BankSystem;
import org.example.MyWitcher.pattern.structural.bridge.banks.StockExchange;
import org.example.MyWitcher.pattern.structural.bridge.dev.CppDeveloper;
import org.example.MyWitcher.pattern.structural.bridge.dev.JavaDeveloper;
import org.example.MyWitcher.pattern.structural.bridge.banks.Program;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
//                new BankSystem(new JavaDeveloper()),
                new BankSystem(new CppDeveloper()),
//                new StockExchange(new CppDeveloper())
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }
    }
}
