package org.example.MyWitcher.pattern.creational.singleton.ex1;

public class ProgramRunner {
    public static void main(String[] args) {
        // HashCode одинаковые
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("First log!");
        ProgramLogger.getProgramLogger().addLogInfo("Second log!");
        ProgramLogger.getProgramLogger().addLogInfo("Third log!");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
