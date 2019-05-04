package com.felix.design.principle.liskovsubstitution.version_output_final;

import java.util.HashMap;

/**
 * Created by lifei
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
