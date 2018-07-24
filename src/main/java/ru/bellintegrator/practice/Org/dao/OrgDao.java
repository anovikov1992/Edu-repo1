package ru.bellintegrator.practice.Org.dao;

import ru.bellintegrator.practice.Org.model.Org;



import java.util.List;
/**
 * DAO для работы с Person
 */
public interface OrgDao {
    /**
     * Получить все объекты Person
     *
     * @return
     */
    List<Org> all();

    /**
     * Получить Person по идентификатору
     *
     * @param id
     * @return
     */
    Org loadById(Long id);

    /**
     * Получить Person по имени
     *
     * @param Name
     * @return
     */
    Org loadByName(String Name);

    /**
     * Сохранить Person
     *
     * @param org
     */
    void save(Org org);
}
