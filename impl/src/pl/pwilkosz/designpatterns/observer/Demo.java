package pl.pwilkosz.designpatterns.observer;

import pl.pwilkosz.designpatterns.observer.iotdevices.BTLESensor;
import pl.pwilkosz.designpatterns.observer.iotdevices.IObservable;
import pl.pwilkosz.designpatterns.observer.iotdevices.TemperatureSensor;
import pl.pwilkosz.designpatterns.observer.iothub.ISubjective;
import pl.pwilkosz.designpatterns.observer.iothub.IoTHub;

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
