package com.model.dao.connection;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ConnectionFactory {

    public static final String PERSISTENCE_UNIT = "chart_matrizesPU";
    public static EntityManager em = null;

    public static EntityManager getEntityManager() {
        Map props = new HashMap();
        File f = new File("C:/props.properties");
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(f));
        } catch (Exception e) {
        }
        props.put("javax.persistence.jdbc.driver", "org.firebirdsql.jdbc.FBDriver");
        props.put("javax.persistence.jdbc.url", p.getProperty("url"));
        props.put("javax.persistence.jdbc.user", "SYSDBA");
        props.put("javax.persistence.jdbc.password", "masterkey");

        if (em == null) {
            em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT, props).createEntityManager();
        }
        return em;
    }
}
