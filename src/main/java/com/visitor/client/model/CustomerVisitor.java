package com.visitor.client.model;

import com.visitor.model.Barbershop;
import com.visitor.model.Store;
import com.visitor.model.Taxy;

import java.math.BigDecimal;

public class CustomerVisitor extends AbstractVisitor {

    public CustomerVisitor(String name) {
        super(name);
        setMoney(BigDecimal.valueOf(100));
    }

    @Override
    public void visit(Barbershop barbershop) {
        barbershop.toStringBefore(this);
        setMoney(getMoney().subtract(BigDecimal.valueOf(15)));
        barbershop.toStringAfter(this);
    }

    @Override
    public void visit(Taxy taxy) {
        taxy.toStringBefore(this);
        setMoney(getMoney().subtract(BigDecimal.valueOf(20)));
        taxy.toStringAfter(this);
    }

    @Override
    public void visit(Store store) {
        store.toStringBefore(this);
        setMoney(getMoney().subtract(BigDecimal.valueOf(50)));
        store.toStringAfter(this);
    }
}
