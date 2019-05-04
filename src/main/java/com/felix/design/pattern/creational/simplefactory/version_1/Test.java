package com.felix.design.pattern.creational.simplefactory.version_1;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();
    }

}
