package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

    @Test
    public void add(){
        Adder adder = new Adder();
        Assert.assertEquals(3, adder.add(1,2));
        Assert.assertEquals(4, adder.add(2,2));
        Assert.assertEquals(3, adder.add(1,2));
        Assert.assertEquals(3, adder.add(1,2));
    }
}
