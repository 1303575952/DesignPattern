package com.felix.design.principle.openclose.version_1;

/**
 * Created by felix
 */
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    //需要计算打折后价格
    public Double getPrice() {
        return this.price * 0.8;
    }

}
