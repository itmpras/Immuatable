package com.prasanna.immutabletest;


import java.util.List;
import java.util.Set;

import org.immutables.value.Value;

@Value.Immutable
public abstract class FooBarValue {

    @Value.Parameter
    public abstract int foo();

    @Value.Parameter
    public abstract String bar();

    @Value.Parameter
    public abstract List<Integer> buz();

    @Value.Parameter
    public abstract Set<Long> crux();
}