package com.felix.design.principle.openclose.version_init;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
        System.out.println("课程ID:" + course.getId() + " 课程名称:" + course.getName() + " 课程折后价格:" + course.getPrice() + "元");

    }
}
