package com.felix.design.principle.demeter.version_init;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }

}
