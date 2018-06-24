package com.designpattern.creational.singletonpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    // serialVersionUID is a unique identifier for Serializable classes.
    // This is used during the deserialization of an object, to ensure that a loaded class
    // is compatible with the serialized object. If no matching class is found, an InvalidClassException is thrown.
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

}