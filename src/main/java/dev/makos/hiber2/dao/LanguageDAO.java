package dev.makos.hiber2.dao;

import dev.makos.hiber2.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDAO<Language>{
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
