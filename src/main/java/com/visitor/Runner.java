package com.visitor;

import com.visitor.client.model.BossVisitor;
import com.visitor.client.model.CustomerVisitor;
import com.visitor.client.model.IboVisitor;
import com.visitor.client.model.Visitor;
import com.visitor.model.Barbershop;
import com.visitor.model.Store;
import com.visitor.model.Taxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    private static List<Visitor> visitors;
    private static List<Visitable> visitablePlaces;

    static {
        visitablePlaces = new ArrayList<>(Arrays.asList(new Barbershop(), new Store(), new Taxy()));
        visitors = new ArrayList<>(Arrays.asList(new BossVisitor("Bobby"), new CustomerVisitor("Tommy"),
                new IboVisitor("Iomy")));
    }

    public static void main(String[] args) {
        visitors.forEach(visitor -> visitablePlaces.forEach(place -> place.accept(visitor)));
    }
}
