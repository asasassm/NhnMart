package com.nhnacademy.aiot;


import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

    private static final Logger logger = Logger.getLogger("logger mesage");

    public static void main(String[] args) {}

    public static Logger getLogger() {
        logger.setLevel(Level.INFO);
        return logger;
    }

}
