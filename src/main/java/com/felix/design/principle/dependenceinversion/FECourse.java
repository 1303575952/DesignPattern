package com.felix.design.principle.dependenceinversion;

/**
 * Created by felix
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("felix在学习FE课程");
    }

}
