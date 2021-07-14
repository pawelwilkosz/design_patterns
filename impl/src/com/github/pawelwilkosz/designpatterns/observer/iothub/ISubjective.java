package pl.pwilkosz.designpatterns.observer.iothub;

import pl.pwilkosz.designpatterns.observer.iotdevices.IObservable;

public interface ISubjective {
    void register(IObservable observer);
    void unregister(IObservable observer);
    void cloudToDevice(String twin);
}
