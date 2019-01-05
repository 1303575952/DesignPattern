package com.felix.design.pattern.creational.abstractfactory;

/**
 * Created by felix
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
