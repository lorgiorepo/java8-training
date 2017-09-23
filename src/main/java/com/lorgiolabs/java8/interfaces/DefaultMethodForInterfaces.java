package com.lorgiolabs.java8.interfaces;

/**
 * Created by lorgiotrinidad on 23-09-17.
 */
public class DefaultMethodForInterfaces implements Formula {

    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }
}
