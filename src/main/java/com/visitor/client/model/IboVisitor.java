package com.visitor.client.model;

import com.visitor.model.Barbershop;
import com.visitor.model.Store;
import com.visitor.model.Taxy;

import java.math.BigDecimal;

public class IboVisitor extends AbstractVisitor {

    public IboVisitor(String name) {
        super(name);
        setMoney(BigDecimal.valueOf(300));
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
        setMoney(getMoney().subtract(BigDecimal.valueOf(10)));
        taxy.toStringAfter(this);
    }

    @Override
    public void visit(Store store) {
        store.toStringBefore(this);
        setMoney(getMoney().subtract(BigDecimal.valueOf(200)));
        store.toStringAfter(this);
    }
}
