package org.example.service.factory.impl;

import org.example.model.FourWheeler;
import org.example.model.Vehicle;
import org.example.service.factory.VehicleFactory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
