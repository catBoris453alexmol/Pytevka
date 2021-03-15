package ru.sapteh.Dao;

import java.util.List;

public interface Dao<Entity, Key> {
    List<Entity> readByAll();
    void update (Entity entity);
    void create(Entity entity);
    void delete(Entity entity);
}
