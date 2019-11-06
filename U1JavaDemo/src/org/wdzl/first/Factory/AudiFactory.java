package org.wdzl.first.Factory;

public class AudiFactory implements CarFactory {
    @Override
    public Car createcar() {

        return  new Audi() ;
    }
}
