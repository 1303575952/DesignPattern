package com.felix.design.pattern.creational.simplefactory.version_final;

/**
 * Created by felix
 */
public class VideoFactory {
    /**
     * 当需要增加video时，无需更改工厂代码
     *
     * @param c
     * @return
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
