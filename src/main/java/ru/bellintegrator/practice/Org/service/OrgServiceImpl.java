package ru.bellintegrator.practice.Org.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.Org.dao.OrgDao;
import ru.bellintegrator.practice.Org.model.Org;
import ru.bellintegrator.practice.Org.view.OrgView;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final OrgDao dao;

    @Autowired
    public OrgServiceImpl(OrgDao dao) {
        this.dao = dao;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void add(OrgView view) {
        Org organization = new Org(view.Name, view.FullName);
        dao.save(organization);
    }

    @Override
    public List<OrgView> organizations() {
        return null;
    }
}
