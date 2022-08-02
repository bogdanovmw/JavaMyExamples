package org.example.MyWitcher.pattern.creational.factory.ex1.good;

import org.example.MyWitcher.pattern.creational.factory.ex1.good.factory.CppDeveloperFactory;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.factory.DeveloperFactory;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.factory.JavaDeveloperFactory;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.factory.PhpDeveloperFactory;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.Developer;

public class Program {
    public static void main(String[] args) {
//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        DeveloperFactory developerFactory = new PhpDeveloperFactory();

        DeveloperFactory f1 = new JavaDeveloperFactory();
        Developer d = f1.createDeveloper();
        d.writeCode();

//        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
//        Developer developer = developerFactory.createDeveloper();
//        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is not found!");
        }
    }
}
