package com.google.tests.utility;

import java.util.concurrent.TimeUnit;

public class utils {
    public static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
