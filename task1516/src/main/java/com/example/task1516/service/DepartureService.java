package com.example.task1516.service;

import com.example.task1516.entity.Departure;
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
public class DepartureService {

    @Autowired
    private final SessionFactory sessionFactory;
    private Session session;
    private CriteriaBuilder builder;
    private CriteriaQuery<Departure> criteriaQuery;
    private Root<Departure> root;

    public DepartureService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @PostConstruct
    void init() {
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        criteriaQuery = builder.createQuery(Departure.class);
        root = criteriaQuery.from(Departure.class);
    }
    @PreDestroy
    void close() {
        this.session.close();
    }
    public List<Departure> getDepartures() {
        return session.createQuery("select s from Departure s", Departure.class).getResultList();
    }
    public List<Departure> getByType() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("type")));
        Query<Departure> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }


    public List<Departure> getByDate() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("departureDate")));
        Query<Departure> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    public Departure getDepartureByID(int id) {
        session.beginTransaction();
        Departure dp;
        try {
            dp = session.get(Departure.class, id);
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
        session.getTransaction().commit();
        return dp;
    }

    public void addDeparture(Departure d) {
        session.beginTransaction();
        session.persist(d);
        session.getTransaction().commit();
    }

    public void deleteDeparture(int id) throws Exception {
        session.beginTransaction();
        try {
            Departure dp = session.get(Departure.class, id);
            session.remove(dp);
        }
        catch (Exception e) {
            throw new Exception();
        }
        session.getTransaction().commit();
    }
}
