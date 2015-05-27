package com.spinningnoodle.examples.springdi;

/**
 * Created by Freddy on 5/26/2015.
 */
public class SimpleExample {
    ConnectionPool connectionPool;

    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public SimpleExample () {

    }
    public void processExample() {
        System.out.println(connectionPool.getConnectionName());
    }
}
