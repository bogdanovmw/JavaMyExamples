package org.example.MyWitcher.pattern.creational.builder.ex2;

import org.example.MyWitcher.pattern.creational.builder.ex2.builders.Builder;
import org.example.MyWitcher.pattern.creational.builder.ex2.cars.CarType;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Engine;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.GPSNavigation;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Transmission;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigation(new GPSNavigation());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigation(new GPSNavigation());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigation(new GPSNavigation());
    }
}
