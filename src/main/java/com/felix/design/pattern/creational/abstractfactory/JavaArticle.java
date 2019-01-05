package com.felix.design.pattern.creational.abstractfactory;

/**
 * Created by felix
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
