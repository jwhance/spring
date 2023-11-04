package com.example.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.spring.entity.RequestSystemId;
import com.example.spring.util.HibernateUtil;

// https://dzone.com/articles/hibernate-5-java-configuration-example

public class RequestSystemIdDao {
    public void saveRequestSystemId(RequestSystemId requestSystemId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(requestSystemId);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<RequestSystemId> getRequestSystemIds() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Rqst_sys", RequestSystemId.class).list();
        }
    }
}
