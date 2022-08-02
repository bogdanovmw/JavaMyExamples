package org.example.MyWitcher.pattern.creational.builder.ex2;

import org.example.MyWitcher.pattern.creational.builder.ex2.builders.CarBuilder;
import org.example.MyWitcher.pattern.creational.builder.ex2.builders.CarManualBuilder;
import org.example.MyWitcher.pattern.creational.builder.ex2.cars.Car;
import org.example.MyWitcher.pattern.creational.builder.ex2.cars.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();

//        CarManualBuilder manualBuilder = new CarManualBuilder();
//        director.constructSportsCar(manualBuilder);
//        Manual result = manualBuilder.getResult();
//        System.out.println(result.print());
    }
}
