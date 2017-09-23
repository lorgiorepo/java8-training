package com.lorgiolabs.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lorgiotrinidad on 23-09-17.
 */
public class MainLambdaExpression {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");


        /*
            In prior versions of java

            Collections.sort(names, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return b.compareTo(a);
                }
            });
        */

        // Java 8
        Collections.sort(names, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        // Java 8 shorter
        Collections.sort(names, (o1, o2) -> {
           return o1.compareTo(o2);
        });

        // Java 8 more shorter
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));

        System.out.println(names);
    }
}
