package com.designpattern.creational.abstractfactorypattern;

public class TestFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        PCFactory pcFactory = new PCFactory("2 GB","500 GB","2.4 GHz");
        ServerFactory serverFactory = new ServerFactory("16 GB","1 TB","2.9 GHz");

        Computer pc = ComputerFactory.getComputer(pcFactory);
        Computer server = ComputerFactory.getComputer(serverFactory);

        System.out.println("AbstractFactory PC Config: "+pc);
        System.out.println("AbstractFactory Server Config: "+server);
    }
}
