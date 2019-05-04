package com.felix.design.principle.compositionaggregation.version_init;

/**
 * Created by felix
 */
public class ProductDao extends DBConnection{

    public void addProduct() {
        String conn = super.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
