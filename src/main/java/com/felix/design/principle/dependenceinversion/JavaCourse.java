package com.felix.design.principle.dependenceinversion;

/**
 * Created by felix
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("felix在学习Java课程");
    }
}
