package com.felix.design.pattern.structural.adapter.version_classadapter_final;

/**
 * Created by lifei
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
