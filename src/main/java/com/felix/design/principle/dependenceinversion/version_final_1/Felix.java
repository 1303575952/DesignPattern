package com.felix.design.principle.dependenceinversion.version_final_1;

/**
 * Created by felix
 */
public class Felix {
    private ICourse iCourse;

    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
