package ru.sapteh.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.Dao.Dao;
import ru.sapteh.models.Client;

import java.util.List;

public class ClientDaoImpl implements Dao<Client, Integer> {
    private final SessionFactory factory;

    public ClientDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    public List<Client> readByAll() {
        try (Session session = factory.openSession()){
            Query<Client> query = session.createQuery("FROM client");
            return query.list();
        }
    }

    public void update(Client client) {
        try (Session session = factory.openSession()){

        }
    }

    public void create(Client client) {

    }

    public void delete(Client client) {

    }
}
