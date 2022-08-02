package org.example.MyWitcher.pattern.creational.builder.ex2.cars;

import org.example.MyWitcher.pattern.creational.builder.ex2.components.Engine;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.GPSNavigation;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Transmission;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigation gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigation gpsNavigation) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigation;
    }

    public double getFuel() {
        return fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigation getGpsNavigator() {
        return gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
