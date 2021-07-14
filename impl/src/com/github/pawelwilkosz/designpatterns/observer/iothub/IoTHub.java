package pl.pwilkosz.designpatterns.observer.iothub;

import pl.pwilkosz.designpatterns.observer.iotdevices.IObservable;

import java.util.ArrayList;

public class IoTHub implements ISubjective {

    private ArrayList<IObservable> iotDevices;
    private String twin;

    public IoTHub(){
        iotDevices = new ArrayList<IObservable>();
    }

    @Override
    public void register(IObservable observer) {
        iotDevices.add(observer);
    }

    @Override
    public void unregister(IObservable observer) {
        iotDevices.remove(observer);
    }

    @Override
    public void cloudToDevice(String twin) {
        this.twin = twin;

        for(IObservable obs : iotDevices){
            obs.actualizeData(twin);
        }
    }
}
