package com.felix.design.principle.compositionaggregation;

/**
 * Created by felix
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
