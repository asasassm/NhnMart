package com.nhnacademy.aiot;

import java.util.List;
import org.junit.jupiter.api.Test;
import com.nhnacademy.aiot.Food;
import com.nhnacademy.aiot.FoodStand;
import com.nhnacademy.aiot.MyLogger;

public class FoodStandTest {
    static FoodStand<Food> ex = new FoodStand<Food>();

    @Test
    void addFoodTest() {
        MyLogger.getLogger().info("새우");
        ex.addFoods("새우", 1200);
    }

    @Test
    void printFoods() {
        ex.printFoods();
    }

    @Test
    void getFoodTest() {
        ex.addFoods("새우", 1200);
        ex.getFood("ㅇㅇ");
        System.out.println(ex.getFood("dd"));
    }

    // public static void main(String[] args) {
    // addFoodTest("신라면", 1200);
    // printFoods();
    // }
}

