package com.felix.design.pattern.creational.factorymethod.version_final;

/**
 * Created by felix
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
