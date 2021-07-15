package com.github.pawelwilkosz.oodesignpatterns.observer.iothub;

import com.github.pawelwilkosz.oodesignpatterns.observer.iotdevices.IObservable;

public interface ISubjective {
    void register(IObservable observer);
    void unregister(IObservable observer);
    void cloudToDevice(String twin);
}
