package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnOne() throws Exception {
        lion = new Lion(feline, "Самка");
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        List<String> lionFood = List.of("Животные", "Птицы", "Рыба");
        lion = new Lion(feline, "Самец");
        Mockito.when(lion.getFood()).thenReturn(lionFood);
        assertEquals(lionFood, lion.getFood());
    }

    @Test
    public void lionHasWrongSexReturnError() {
        try {
            lion = new Lion(feline, "Бесполый");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }

    }
}