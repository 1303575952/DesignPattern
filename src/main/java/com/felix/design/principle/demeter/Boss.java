package com.felix.design.principle.demeter;


/**
 * Created by felix
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }

}
