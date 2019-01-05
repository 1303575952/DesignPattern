package com.felix.design.pattern.creational.factorymethod;

/**
 * Created by felix
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
