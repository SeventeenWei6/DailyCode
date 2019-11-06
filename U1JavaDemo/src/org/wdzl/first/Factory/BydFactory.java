package org.wdzl.first.Factory;

public class BydFactory implements CarFactory {
    @Override
    public Car createcar() {
        return new Byd();
    }
}
