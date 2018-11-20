package com.felix.design.principle.dependenceinversion;

/**
 * Created by felix
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Felix felix = new felix();
//        felix.studyJavaCourse();
//        felix.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        felix felix = new felix();
//        felix.studyImoocCourse(new JavaCourse());
//        felix.studyImoocCourse(new FECourse());
//        felix.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Felix felix = new felix(new JavaCourse());
//        felix.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Felix felix = new Felix();
        felix.setiCourse(new JavaCourse());
        felix.studyImoocCourse();

        felix.setiCourse(new FECourse());
        felix.studyImoocCourse();

    }
}