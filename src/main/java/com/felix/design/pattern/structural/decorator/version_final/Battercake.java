package com.felix.design.pattern.structural.decorator.version_final;

/**
 * Created by lifei
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
