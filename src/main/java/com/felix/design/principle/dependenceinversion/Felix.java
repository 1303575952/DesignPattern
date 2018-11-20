package com.felix.design.principle.dependenceinversion;

/**
 * Created by felix
 */
public class Felix {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
