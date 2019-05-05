package com.felix.design.pattern.structural.adapter.version_final;

/**
 * Created by lifei
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
