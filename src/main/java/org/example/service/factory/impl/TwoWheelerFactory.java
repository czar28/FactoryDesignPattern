package org.example.service.factory.impl;

import org.example.model.TwoWheeler;
import org.example.model.Vehicle;
import org.example.service.factory.VehicleFactory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
