package com.visitor.client.model;

import java.math.BigDecimal;

public abstract class AbstractVisitor implements Visitor {
    private BigDecimal money;
    private String name;

    AbstractVisitor(String name) {
        this.money = BigDecimal.valueOf(100);
        this.name = name;
    }

    BigDecimal getMoney() {
        return money;
    }

    void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%s{money=%s, name='%s'}", this.getClass().getSimpleName(), money, name);
    }
}
