package com.felix.design.pattern.creational.factorymethod.version_final;

/**
 * Created by felix
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
