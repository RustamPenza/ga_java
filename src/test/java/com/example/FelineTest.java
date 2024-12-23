package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

public class FelineTest {

    private Feline feline;

    @Before
    public void prepare() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> foodPredator = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(foodPredator, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnFeline() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentsReturnOne() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgumentsReturnArgument() {
        Assert.assertEquals(5, feline.getKittens(5));
    }
}