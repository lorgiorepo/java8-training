package com.lorgiolabs.java8.lambda;

/**
 * Created by lorgiotrinidad on 23-09-17.
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}
