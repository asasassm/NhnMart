package com.nhnacademy.aiot;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NhnMartShell {

    static final Logger logger = LoggerFactory.getLogger("MartShell Logger");
    static Customer dongmin;
    static BuyList buyList;

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        dongmin = new Customer(buyList);

        // 장바구니를 챙긴다.
        dongmin.bring(mart.provideBasket());

        // 식품을 담는다.
        dongmin.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        dongmin.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner sc = new Scanner(System.in);

        BuyList buyList = new BuyList();
        String name;
        int count;
        while (true) {
            logger.info("음식을 담으세요 : 양파 계란 파 사과 / 종료 시 종료 입력");
            name = sc.next();
            if (name.equals("종료")) {
                break;
            }
            logger.info("갯수를 입력하세요");
            count = sc.nextInt();
            buyList.addBuyList(new Item(name, count));

        }

        return buyList;
    }
}
