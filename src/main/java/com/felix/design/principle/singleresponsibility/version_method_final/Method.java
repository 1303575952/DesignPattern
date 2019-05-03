package com.felix.design.principle.singleresponsibility.version_method_final;

/**
 * Created by felix
 */
public class Method {
    //更新名字和地址
    private void updateUserInfo(String userName, String address) {
        userName = "felix";
        address = "beijing";
    }

    //更新多个参数
    private void updateUserInfo(String userName, String... properties) {
        userName = "felix";
//        address = "beijing";
    }

    //只更新名字
    private void updateUsername(String userName) {
        userName = "felix";
    }

    //只更新地址
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
