package org.example.MyWitcher.pattern.creational.builder.ex2.builders;

import org.example.MyWitcher.pattern.creational.builder.ex2.cars.CarType;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Engine;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.GPSNavigation;
import org.example.MyWitcher.pattern.creational.builder.ex2.cars.Manual;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Transmission;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigation gpsNavigation;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigation(GPSNavigation gpsNavigation) {
        this.gpsNavigation = gpsNavigation;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigation);
    }
}
