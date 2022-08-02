package org.example.MyWitcher.pattern.creational.factory.ex1.bad;

public class Program {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeCode();

        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCode();
    }
}
