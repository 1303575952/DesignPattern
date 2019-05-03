package com.felix.design.principle.dependenceinversion.version_final_3;

/**
 * Created by felix
 */
public class Test {

    public static void main(String[] args) {
        Felix felix = new Felix();
        felix.setiCourse(new JavaCourse());
        felix.studyImoocCourse();

        felix.setiCourse(new FECourse());
        felix.studyImoocCourse();
    }
}