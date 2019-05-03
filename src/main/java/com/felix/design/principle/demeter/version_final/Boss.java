package com.felix.design.principle.demeter.version_final;


/**
 * Created by felix
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }

}
