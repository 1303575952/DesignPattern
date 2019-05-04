package com.felix.design.pattern.creational.abstractfactory.version_final;

/**
 * Created by felix
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
