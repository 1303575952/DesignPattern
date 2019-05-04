package com.felix.design.pattern.creational.factorymethod.version_final;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        Video video2 = videoFactory2.getVideo();
        Video video3 = videoFactory3.getVideo();
        video.produce();
        video2.produce();
        video3.produce();
    }

}
