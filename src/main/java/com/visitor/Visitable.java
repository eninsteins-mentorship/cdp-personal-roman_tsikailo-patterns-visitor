package com.visitor;

import com.visitor.client.model.Visitor;
import org.apache.logging.log4j.LogManager;

public interface Visitable {
    void accept(Visitor vistor);

    default void toStringBefore(Visitor visitor) {
        LogManager.getLogger().info(String.format("%s before visiting [%s]", visitor,
                this.getClass().getSimpleName()));
    }

    default void toStringAfter(Visitor visitor) {
        LogManager.getLogger().info(String.format("%s after visiting [%s]\n", visitor,
                this.getClass().getSimpleName()));
    }
}
