package com.lorgiolabs.java8.interfaces;

/**
 * Created by lorgiotrinidad on 23-09-17.
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
