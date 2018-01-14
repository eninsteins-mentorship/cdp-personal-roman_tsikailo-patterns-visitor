package com.visitor.model;

import com.visitor.Visitable;
import com.visitor.client.model.Visitor;

public class Taxy implements Visitable {
    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
