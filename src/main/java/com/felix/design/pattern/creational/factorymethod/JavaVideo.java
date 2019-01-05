package com.felix.design.pattern.creational.factorymethod;

/**
 * Created by felix
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
