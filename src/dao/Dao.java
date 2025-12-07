package dao;

import java.util.List;

import bean.Identifiable;
//seulement les classes qui heritent l'interface Identifiable
public interface Dao<T extends Identifiable> {
    void create(T obj);
    T update(T obj);
    boolean delete(int id);
    T findById(int id);
    List<T> findAll();
}