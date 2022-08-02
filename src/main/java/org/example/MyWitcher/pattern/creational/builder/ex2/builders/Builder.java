package org.example.MyWitcher.pattern.creational.builder.ex2.builders;

import org.example.MyWitcher.pattern.creational.builder.ex2.cars.CarType;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Engine;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.GPSNavigation;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.Transmission;
import org.example.MyWitcher.pattern.creational.builder.ex2.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigation(GPSNavigation gpsNavigation);
}
