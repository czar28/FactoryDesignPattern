package org.example.model;

import org.example.service.factory.VehicleFactory;

public class Client {

    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
