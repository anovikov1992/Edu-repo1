package ru.bellintegrator.practice.Org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.Org.dao.OrgDao;
import ru.bellintegrator.practice.Org.dao.OrgDaoImpl;
import ru.bellintegrator.practice.Org.model.Org;
import ru.bellintegrator.practice.Org.view.OrgView;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgDao orgDao;

    @Override
    public List getAllOrg() {
        return orgDao.getAllOrg();
    }

    @Override
    public void add(OrgView view) {
        Org org = new Org(view.id, view.Name, view.FullName, view.inn, view.kpp, view.Adress, view.phone);
        orgDao.save(org);

    }

    @Override
    public Org loadByName(String Name) {
        return orgDao.loadByName(Name);
    }
}
