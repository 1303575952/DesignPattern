package com.felix.design.principle.dependenceinversion.version_final_2;

/**
 * Created by felix
 */
public class Felix {

    ICourse iCourse;

    public Felix(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
