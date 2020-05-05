package pl.pwilkosz.designpatterns.observer.iotdevices;

public interface IObservable {
    void actualizeData(String twin);
}
