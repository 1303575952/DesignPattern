package com.felix.design.principle.singleresponsibility;

/**
 * Created by felix
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
