package data;

import java.util.UUID;

public abstract class Entity {

    UUID id;

    public Entity(UUID id) {
        this.id = id;
    }

    public Entity() {
        this(UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }

}