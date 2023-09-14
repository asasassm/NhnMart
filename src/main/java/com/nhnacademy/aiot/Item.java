package com.nhnacademy.aiot;

public class Item {
    private final String name;
    private final int amount;

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "name : " + name + " , " + "amount" + amount;
    }

}
