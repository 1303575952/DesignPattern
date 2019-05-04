package com.felix.design.pattern.creational.abstractfactory.version_final;

/**
 * Created by felix
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
