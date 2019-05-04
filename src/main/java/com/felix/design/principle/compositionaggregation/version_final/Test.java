package com.felix.design.principle.compositionaggregation.version_final;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
