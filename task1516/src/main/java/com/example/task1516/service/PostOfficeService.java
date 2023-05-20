package com.example.task1516.service;

import com.example.task1516.entity.Departure;
import com.example.task1516.entity.PostOffice;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.hibernate.query.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostOfficeService {
    @Autowired
    public final SessionFactory sessionFactory; //private
    private Session session;

    private CriteriaBuilder builder;
    private CriteriaQuery<PostOffice> criteriaQuery;
    private Root<PostOffice> root;

    public PostOfficeService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @PostConstruct
    public void init() {
        this.session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        criteriaQuery = builder.createQuery(PostOffice.class);
        root = criteriaQuery.from(PostOffice.class);
    }

    @PreDestroy
    public void close() {
        this.session.close();
    }

    public List<PostOffice> getByName() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        Query<PostOffice> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    public List<PostOffice> getByCity() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("cityName")));
        Query<PostOffice> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }
    public void addPostOffice(PostOffice po, int id) {
        session.beginTransaction();
        Departure departure = session.get(Departure.class, id);
        PostOffice pos = po;
        pos.setDeparture(departure);
        session.persist(pos);
        session.getTransaction().commit();
    }

    public List<PostOffice> getAllUniversities() {
        return session.createQuery("select p from PostOffice p", PostOffice.class).getResultList();
    }

    public void deletePostOffice(int id) {
        session.beginTransaction();
        try {
            PostOffice pos = session.get(PostOffice.class, id);
            session.remove(pos);
        } catch (Exception e) {
            e.getCause();
        }
        session.getTransaction().commit();
    }
}