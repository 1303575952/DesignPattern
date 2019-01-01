package com.felix.design.principle.compositionaggregation;

/**
 * Created by felix
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
