package strategy;

import data.Entity;

@FunctionalInterface
public interface ReadStrategy<T extends Entity> {

    T fromText(String string);

}
