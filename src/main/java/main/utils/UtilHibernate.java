package main.utils;

import org.eclipse.jetty.websocket.common.SessionFactory;
import org.springframework.context.annotation.Configuration;

public class UtilHibernate {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
