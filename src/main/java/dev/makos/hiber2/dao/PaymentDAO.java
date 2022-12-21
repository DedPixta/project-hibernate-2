package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment>{
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
