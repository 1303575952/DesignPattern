package com.felix.design.principle.dependenceinversion.version_final_2;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        Felix felix = new Felix(new JavaCourse());
        felix.studyImoocCourse();
    }
}