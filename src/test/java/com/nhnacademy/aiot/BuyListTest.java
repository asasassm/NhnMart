package com.nhnacademy.aiot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.core.net.SyslogOutputStream;

public class BuyListTest {
    static BuyList buyList = new BuyList();
    static Logger logger = LoggerFactory.getLogger("BuyListTest");

    @Test
    void addBuyListTest() {
        buyList.addBuyList(new Item("안녕", 20));
        buyList.addBuyList(new Item("", 20));

    }

    @Test
    void deleteBuyListTest() {
        buyList.addBuyList(new Item("Hi", 2));
        buyList.addBuyList(new Item("qqq", 0));
        List<Item> items = buyList.getItems();
        for (Item i : items) {
            logger.info(i.toString());
        }
        buyList.deleteBuyList("Hi");
        for (Item i2 : items) {
            logger.info(i2.toString());
        }
    }

}
