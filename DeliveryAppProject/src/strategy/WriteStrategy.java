package strategy;

import data.Entity;

@FunctionalInterface
public interface WriteStrategy<T extends Entity> {

    String toText(T entity);

}