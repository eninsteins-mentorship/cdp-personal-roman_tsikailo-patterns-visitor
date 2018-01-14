package com.visitor.client.model;


import com.visitor.model.Barbershop;
import com.visitor.model.Store;
import com.visitor.model.Taxy;

import java.math.BigDecimal;

public class BossVisitor extends AbstractVisitor {

    public BossVisitor(String name) {
        super(name);
        setMoney(BigDecimal.valueOf(500));
    }

    @Override
    public void visit(Barbershop barbershop) {
        barbershop.toStringBefore(this);
        setMoney(getMoney().add(BigDecimal.valueOf(50)));
        barbershop.toStringAfter(this);
    }

    @Override
    public void visit(Taxy taxy) {
        taxy.toStringBefore(this);
        setMoney(getMoney().add(BigDecimal.valueOf(100)));
        taxy.toStringAfter(this);
    }

    @Override
    public void visit(Store store) {
        store.toStringBefore(this);
        setMoney(getMoney().add(BigDecimal.valueOf(200)));
        store.toStringAfter(this);
    }
}
