package com.spinningnoodle.examples.springdi;

/**
 * Created by Freddy on 5/26/2015.
 */
public class AdvancedConnectionPool implements ConnectionPool {
    @Override
    public String leasConnection() {
        return null;
    }

    @Override
    public String getConnectionName() {
        return "Advanced";
    }
}
