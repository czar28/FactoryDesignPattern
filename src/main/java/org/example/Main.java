package org.example;

import org.example.model.Client;
import org.example.service.factory.VehicleFactory;
import org.example.service.factory.impl.FourWheelerFactory;
import org.example.service.factory.impl.TwoWheelerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehicleFactory twoWheelerVehicleFactory = new TwoWheelerFactory();
        VehicleFactory fourWheelerVehicleFactory = new FourWheelerFactory();

        Client twoWheelerClient = new Client(twoWheelerVehicleFactory);
        twoWheelerClient.getVehicle().printVehicle();

        Client fourWheelerClient = new Client(fourWheelerVehicleFactory);
        fourWheelerClient.getVehicle().printVehicle();
    }
}