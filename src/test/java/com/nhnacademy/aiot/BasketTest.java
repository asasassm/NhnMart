package com.nhnacademy.aiot;

import org.junit.jupiter.api.Test;

public class BasketTest {
    static Basket<Food> basket = new Basket<>();

    @Test
    void addTest() {
        basket.add(new Food("null", 444));
    }

    @Test
    void basketPrintTest() {
        basket.printBasket();
    }

    @Test
    void deleteFoodsTest() {
        basket.deleteFoods("d");
    }

    @Test
    void deleteFoodsTest2() {
        basket.add(new Food("새우깡", 1200));
        basket.deleteFoods("새우깡");
    }

}
