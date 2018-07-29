package ru.bellintegrator.practice.Org.dao;

import org.springframework.stereotype.Repository;
import ru.bellintegrator.practice.Org.model.Org;

import java.util.Arrays;
import java.util.List;

/**
 * {@inheritDoc}
 */

@Repository
public class OrgDaoImpl implements OrgDao {
    private List<Org> list_org = Arrays.asList(
            new Org(1L, "Test", "OOO Test", 123456789, 987654321, "NN", 3215468),
            new Org(2L, "Test2", "OOO Test2", 456789123, 321987654, "NN2", 658962));

    @Override
    public List<Org> getAllOrg() {
        return list_org;
    }

    @Override
    public void save(Org org) {
        list_org.add(org); // здесь надо прописать код для сохранения новой организации в БД
    }

    @Override
    public Org loadByName(String Name) {
        Org org1 = null;
        for (int i = 0; i < list_org.size(); i++) {
            if (list_org.get(i).getName().equals(Name)) {
                org1 = list_org.get(i);
            }
        }
        return org1;
    }
}
