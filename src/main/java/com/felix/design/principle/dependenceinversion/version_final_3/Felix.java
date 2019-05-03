package com.felix.design.principle.dependenceinversion.version_final_3;

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
