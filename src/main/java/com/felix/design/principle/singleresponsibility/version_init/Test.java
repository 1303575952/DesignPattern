package com.felix.design.principle.singleresponsibility.version_init;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        //鸵鸟用翅膀飞是不合适的
        bird.mainMoveMode("鸵鸟");
    }
}
