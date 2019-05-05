package com.felix.design.pattern.structural.adapter.version_objectadapter_final;

/**
 * Created by lifei
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
