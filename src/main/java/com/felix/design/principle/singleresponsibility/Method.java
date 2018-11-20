package com.felix.design.principle.singleresponsibility;

/**
 * Created by felix
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "felix";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "felix";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "felix";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }

        userName = "felix";
        address = "beijing";
    }


}
