package com.felix.design.pattern.structural.adapter.version_objectadapter_final;

/**
 * Created by lifei
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
