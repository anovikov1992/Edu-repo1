package ru.bellintegrator.practice.Org.service;


import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.Org.model.Org;
import ru.bellintegrator.practice.Org.view.OrgView;

import java.util.List;
import java.util.stream.Stream;

public interface OrgService {
    List getAllOrg();

    void add(OrgView view) ;

    Org loadByName(String Name);
}



