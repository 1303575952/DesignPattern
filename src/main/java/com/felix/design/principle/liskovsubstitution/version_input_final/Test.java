package com.felix.design.principle.liskovsubstitution.version_input_final;

import java.util.HashMap;

/**
 * Created by lifei
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
