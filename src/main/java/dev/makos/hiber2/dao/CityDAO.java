package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.City;
import org.hibernate.SessionFactory;

public class CityDAO extends GenericDAO<City>{
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
}
