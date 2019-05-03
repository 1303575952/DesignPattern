package com.felix.design.principle.demeter.version_init;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix
 */
public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("在线课程的数量是：" + courseList.size());
    }

}
