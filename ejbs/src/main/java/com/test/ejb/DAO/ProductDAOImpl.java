package com.test.ejb.DAO;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Pavel_Arlovich on 5/29/2017.
 */
@Singleton
public class ProductDAOImpl implements ProductDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public long create(ProductEntity entity) {
        entityManager.persist(entity);
        entityManager.detach(entity);
        return entity.getId();
    }
}
