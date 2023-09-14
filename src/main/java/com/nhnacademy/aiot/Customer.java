package com.nhnacademy.aiot;

import org.slf4j.LoggerFactory;

public class Customer {
    org.slf4j.Logger logger = LoggerFactory.getLogger("Customer Logger");
    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;
    private int total = 0;
    // 고객이 소유한 금액
    private long amount = 10000;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO 09 구매 목록을 토대로 매대의 물건을 장바구니에 담는 메서드를 작성하세요.
    public void pickFoods(FoodStand foodStand) {

        for (int i = 0; i < this.buyList.getSize(); i++) {
            basket.add(foodStand.getFood(buyList.getItems(i).getName()));
        }
        logger.info("장바구니 목록");
        for (int i = 0; i < basket.BasketSize(); i++) {
            // 여기서 갯수를 곱해줘야함
            total += (basket.getBasketFood(i).getPrice() * buyList.getItems(i).getAmount());
            if (total > amount) {
                throw new IllegalArgumentException("가지고 있는 금액보다 많은 금액을 담았습니다.");
            }
            System.out.println(basket.getBasketFood(i));

        }

    }

    // TODO 10 장바구니 안에 있는 물건들의 가격을 계산하기 위해 장바구니를 넘기고 값을 치루는 메서드를 작성하세요.
    public void payTox(Counter counter) {
        counter.printPay(total, amount);
    }

    public long getAmount() {
        return amount;
    }

    public int getTotal() {
        return total;
    }
}
