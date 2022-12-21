package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store>{
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
