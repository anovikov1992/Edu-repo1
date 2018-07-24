package ru.bellintegrator.practice.Org.dao;

import org.springframework.beans.factory.annotation.Autowired;
import ru.bellintegrator.practice.Org.dao.OrgDao;
import ru.bellintegrator.practice.Org.model.Org;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.util.List;
/**
 * {@inheritDoc}
 */
public class OrgDaoImpl implements OrgDao {

    private final EntityManager em2;
    @Autowired
    public OrgDaoImpl(EntityManager em2) {
        this.em2 = em2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Org> all() {
        TypedQuery<Org> query = em2.createQuery("SELECT o FROM Org o", Org.class);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Org loadById(Long id)  {
        return em2.find(Org.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Org loadByName(String name) {
        CriteriaQuery<Org> criteria = buildCriteria(name);
        TypedQuery<Org> query = em2.createQuery(criteria);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Org person) {
        em2.persist(person);
    }

    private CriteriaQuery<Org> buildCriteria(String name) {
        CriteriaBuilder builder = em2.getCriteriaBuilder();
        CriteriaQuery<Org> criteria = builder.createQuery(Org.class);

        Root<Org> org = criteria.from(Org.class);
        criteria.where(builder.equal(org.get("name"), name));

        return criteria;
    }
}
