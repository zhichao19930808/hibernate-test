package xin.zcglory.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionUtil {
    private static Configuration configuration;
    private static SessionFactory sessionFactory;
    private static Session session;
    static {
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();

    }

    public static Session getSession() {
        if (session == null || !session.isOpen()) {
            configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
        }
        return session;
    }

    public static void close() {
        if (session != null) {
            if (session.isOpen()) {
                session.close();
                sessionFactory.close();
            }
        }
    }
}
