package ru.bellintegrator.practice.Org.dao;

import ru.bellintegrator.practice.Org.model.Org;

import java.util.List;

/**
 * DAO для работы с Person
 */
public interface OrgDao {
    List<Org> getAllOrg();

    void save (Org org);

    Org loadByName(String Name);

}
