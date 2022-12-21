package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.Rental;
import org.hibernate.SessionFactory;

public class RentalDAO extends GenericDAO<Rental>{
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}
