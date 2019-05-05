package com.felix.design.pattern.structural.adapter.version_classadapter_final;

/**
 * Created by lifei
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
