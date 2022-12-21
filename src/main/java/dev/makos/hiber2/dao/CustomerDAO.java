package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer>{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
