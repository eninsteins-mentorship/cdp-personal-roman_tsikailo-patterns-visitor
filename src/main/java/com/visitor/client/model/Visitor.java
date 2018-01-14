package com.visitor.client.model;

import com.visitor.model.Barbershop;
import com.visitor.model.Store;
import com.visitor.model.Taxy;

public interface Visitor {
    void visit(Barbershop barbershop);

    void visit(Taxy taxy);

    void visit(Store store);
}
