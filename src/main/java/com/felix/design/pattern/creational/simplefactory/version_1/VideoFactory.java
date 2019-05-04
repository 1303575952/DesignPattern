package com.felix.design.pattern.creational.simplefactory.version_1;

/**
 * Created by felix
 */
public class VideoFactory {
    /**
     * 当需要增加video时，需要更改工厂代码
     *
     * @param type
     * @return
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
