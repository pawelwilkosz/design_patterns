package com.github.pawelwilkosz.bestpractices.constructors.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Person implements Serializable {
    private static final Person INSTANCE = new Person();
    private int id;

    private Person(){

    }

    // For serialization - to be sure that new instance will not be created
    private Object readResolve() throws ObjectStreamException{
        return INSTANCE;
    }

    public static Person getInstance(){
        return INSTANCE;
    }

    public static void withId(int id){
        INSTANCE.id = id;
    }

    public int getId(){
        return id;
    }
}