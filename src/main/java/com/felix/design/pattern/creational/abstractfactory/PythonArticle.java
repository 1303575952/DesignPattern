package com.felix.design.pattern.creational.abstractfactory;

/**
 * Created by felix
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
