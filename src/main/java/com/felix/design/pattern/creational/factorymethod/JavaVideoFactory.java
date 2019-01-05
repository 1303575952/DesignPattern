package com.felix.design.pattern.creational.factorymethod;

/**
 * Created by felix
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
