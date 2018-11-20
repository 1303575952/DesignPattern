package com.felix.design.principle.dependenceinversion;

/**
 * Created by felix
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("felix在学习Python课程");
    }
}
