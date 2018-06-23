package com.designpattern.singletonpattern;

/**
 * @author perja
 *
 */
public class EagerInitializedSingleton {

    /**
     * In eager initialization, the instance of Singleton Class is created at the time of class loading
     *
     * This design pattern is usually used for Database connections.
     * Also this method doesn’t provide any options for exception handling.
     */
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    // initialize the state of the class
    private EagerInitializedSingleton(){}

    /**
     * Is the stat
     * @return the instance
     */
    public final static EagerInitializedSingleton getInstance(){
        return instance;
    }


}
