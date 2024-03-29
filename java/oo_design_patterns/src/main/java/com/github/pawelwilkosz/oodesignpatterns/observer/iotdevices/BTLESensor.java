package com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices;

public class BTLESensor implements IObservable {
    @Override
    public void actualizeData(String twin) {
        System.out.println("BTLE Sensor actualized settings: " + twin);
    }
}
