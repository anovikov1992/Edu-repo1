package ru.bellintegrator.practice.Org.service;


import ru.bellintegrator.practice.Org.view.OrgView;

import java.util.List;

public interface OrgService {
    /**
     * Добавить новую организацию в БД
     *
     * @param org
     */
    void add(OrgView org);

    /**
     * Получить список людей
     *
     * @return {@Organization}
     */
    List<OrgView> organizations();
}



