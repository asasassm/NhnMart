package com.nhnacademy.aiot;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Basket<E extends Food> {
    static Logger logger = LoggerFactory.getLogger("Basket");
    private final List<Food> foodBasket;

    public Basket() {
        foodBasket = new ArrayList<>();
    }

    public void add(Food food) {
        if (food.getFoodName().equals(null)) {
            logger.info("상품 이름을 입력 하세요");
        }
        foodBasket.add(food);
    }

    public void printBasket() {
        if (foodBasket.isEmpty()) {
            logger.info("바구니가 비어있습니다.");
        } else {
            for (Food f : foodBasket) {
                System.out.println(f);
            }
        }
    }

    public void deleteFoods(String name) {
        int index = -1;
        if (checkName(name)) {
            for (int i = 0; i < foodBasket.size(); i++) {
                if (foodBasket.get(i).getFoodName().equals(name)) {
                    index = i;
                }
            }
            foodBasket.remove(index);
        } else {
            logger.info(name + "은 존재 하지 않습니다.");
        }
    }

    public boolean checkName(String name) {
        for (int i = 0; i < foodBasket.size(); i++) {
            if (foodBasket.get(i).getFoodName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Food> getFoodBasket() {
        return foodBasket;
    }

    public Food getBasketFood(int index) {
        return foodBasket.get(index);
    }

    public int BasketSize() {
        return foodBasket.size();
    }
}
