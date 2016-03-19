package com.prasanna.immutabletest;

/**
 * Created by prasniths on 19/03/16.
 */
public class ImmutableTest {
    // TODO TO explore http://pcollections.org/

    public static void main(String[] args) {


        ImmutableFooBarValue bar = ImmutableFooBarValue.builder()
                .foo(2)
                .bar("bar")
                .addBuz(1, 2, 3)
                .addCrux(1l, 2l).build();

        System.out.println(bar);

    }
}
