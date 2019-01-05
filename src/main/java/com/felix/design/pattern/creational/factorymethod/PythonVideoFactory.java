package com.felix.design.pattern.creational.factorymethod;

/**
 * Created by felix
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
