package com.spinningnoodle.examples.springdi;

/**
 * Created by Freddy on 5/26/2015.
 */
public interface ConnectionPool {
    String leasConnection();
    String getConnectionName();
}
