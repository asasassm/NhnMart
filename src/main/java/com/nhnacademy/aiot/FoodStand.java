package com.nhnacademy.aiot;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand<E extends Food> {
    static Logger logger = LoggerFactory.getLogger("FoodStand");
    private final List<Food> foods;
    private int count;

    public FoodStand() {
        foods = new ArrayList<>();
        // maxCount = size;
        // TODO Auto-generated constructor stub
    }

    public void addFoods(String name, int price) {
        foods.add(new Food(name, price));
    }

    public void add(Food food) {
        foods.add(food);
    }

    public void deleteFoods(String name) {
        int index = -1;
        if (checkName(name)) {
            for (int i = 0; i < foods.size(); i++) {
                if (foods.get(i).getFoodName().equals(name)) {
                    index = i;
                }
            }
            foods.remove(index);
        } else {
            logger.info(name + "은 존재 하지 않습니다.");
        }

    }

    public void printFoods() {
        for (Food f : foods) {
            System.out.println(f);
        }
    }

    public Food getFood(String name) {
        int index = -1;
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getFoodName().equals(name)) {
                index = i;
            }
        }
        logger.info("존재하지 않음");
        return foods.get(index);
    }

    public boolean checkName(String name) {

        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getFoodName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return foods.size();
    }

}
