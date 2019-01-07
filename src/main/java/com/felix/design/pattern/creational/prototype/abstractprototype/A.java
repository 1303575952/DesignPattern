package com.felix.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by felix
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
