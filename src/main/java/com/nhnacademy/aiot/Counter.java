package com.nhnacademy.aiot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    Logger logger = LoggerFactory.getLogger("Counter Logger");
    // TODO 로그 출력을 이용해서 물건을 계산하는 과정을 출력해보세요.

    // TODO 11 바구니 안에 있는 물건들을 모두 확인하고 그 가격들의 합을 계산하여 반환하는 메서드를 작성하세요.
    public void printPay(int price, long amout) {
        logger.info("총 금액 : " + price + " , " + "결제 후 금액 : " + (amout - price));
    }
}
