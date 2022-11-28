package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[]args) {

        try {
            int result = 1000/0;
        } catch (Exception e) {
            logger.error("Error occurred!");
        }

        logger.info("Program finished!");
    }
}