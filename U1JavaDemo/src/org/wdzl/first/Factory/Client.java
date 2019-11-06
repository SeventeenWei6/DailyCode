package org.wdzl.first.Factory;

public class Client {
    public static void main(String[] args) {
        Car car1 = new AudiFactory().createcar();
        car1.run();

    }
}
