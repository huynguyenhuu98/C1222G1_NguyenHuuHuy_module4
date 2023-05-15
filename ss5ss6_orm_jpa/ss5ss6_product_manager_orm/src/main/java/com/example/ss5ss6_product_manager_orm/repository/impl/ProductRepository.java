package com.example.ss5ss6_product_manager_orm.repository.impl;

import com.example.ss5ss6_product_manager_orm.config.ConnectionUtil;
import com.example.ss5ss6_product_manager_orm.model.Product;
import com.example.ss5ss6_product_manager_orm.repository.IProductRepository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> getAll() {
        Session session = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            return session.createQuery("FROM Product",Product.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product findById(int id) {
        Session session = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            return session.createQuery("FROM Product where id = :id",Product.class).setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(String.valueOf(id), product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(int id) {
        Session session ;
        Transaction transaction ;
        try {
            Product product = findById(id);
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(product);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findByName(String name) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        String query = " FROM Product where nameProduct like concat('%',:name,'%')";
        return session.createQuery(query, Product.class).setParameter("name", name).getResultList();


    }
}
