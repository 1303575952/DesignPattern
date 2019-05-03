package com.felix.design.principle.dependenceinversion.version_final_1;

/**
 * Created by felix
 */
public class Test {

    public static void main(String[] args) {
        Felix felix = new Felix();
        felix.studyImoocCourse(new JavaCourse());
        felix.studyImoocCourse(new FECourse());
        felix.studyImoocCourse(new PythonCourse());
    }

}