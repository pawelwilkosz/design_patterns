package com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices;

public class TemperatureSensor implements IObservable {
    @Override
    public void actualizeData(String twin) {
        System.out.println("Temperature Sensor actualized settings: " + twin);
    }
}