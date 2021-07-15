package com.github.pawelwilkosz.oodesignpatterns.observer;


import com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices.BTLESensor;
import com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices.IObservable;
import com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices.TemperatureSensor;
import com.github.pawelwilkosz.oodesignpatterns.observer.iothub.ISubjective;
import com.github.pawelwilkosz.oodesignpatterns.observer.iothub.IoTHub;

public class Demo {
    public static void main(String[] argc){
        ISubjective iotHub = new IoTHub();

        IObservable temperatureSensor = new TemperatureSensor();
        IObservable btleSensor = new BTLESensor();

        iotHub.register(temperatureSensor);
        iotHub.register(btleSensor);

        iotHub.cloudToDevice("{ \"version:\" \"1.0\" }");

        iotHub.unregister(btleSensor);
        iotHub.cloudToDevice("{ \"version:\" \"2.0\" }");
    }
}