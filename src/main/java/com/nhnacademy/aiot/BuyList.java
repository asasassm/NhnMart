package com.nhnacademy.aiot;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyList {
    static Logger logger = LoggerFactory.getLogger("BuyList");

    private final List<Item> items;

    public BuyList() {
        items = new ArrayList<>();
    }

    public void addBuyList(Item item) {
        if (item.getName().equals(null) || item.getName().equals("")) {
            logger.info("이름을 입력 세요");
        }
        items.add(item);
    }

    public void deleteBuyList(String name) {
        int index = -1;
        if (checkName(name)) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getName().equals(name)) {
                    index = i;
                }
            }
            items.remove(index);
        } else {
            logger.info(name + "은 존재 하지 않습니다.");
        }
    }

    public boolean checkName(String name) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Item> getItems() {
        if (items.isEmpty()) {
            logger.info("아이템 목록이 비어 있습니다.");
        }
        return items;
    }

    public Item getItems(int index) {
        if (items.isEmpty()) {
            logger.info("목록이 비어있음");
        }
        return items.get(index);
    }

    public int getSize() {
        return items.size();
    }

}
