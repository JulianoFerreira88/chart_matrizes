package com.model.dao.esanmatrizdao;

import com.model.dao.connection.ConnectionFactory;
import com.model.entites.Esanmatriz;
import java.util.List;
import javax.persistence.EntityManager;

public class EsanmatrizDao {

    private final EntityManager em;

    public EsanmatrizDao() {
        em = ConnectionFactory.getEntityManager();
    }

    public List<Esanmatriz> getVazias() {
        return (List<Esanmatriz>) em.createNativeQuery("SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' AND m.flestadoreprodutivo = 'V' ", Esanmatriz.class).getResultList();
    }

    public List<Esanmatriz> getLactantes() {
        return (List<Esanmatriz>) em.createNativeQuery("SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' AND m.flestadoreprodutivo = 'L' ", Esanmatriz.class).getResultList();
    }

    public List<Esanmatriz> getMatrizes() {
        return (List<Esanmatriz>) em.createNativeQuery("SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' ", Esanmatriz.class).getResultList();
    }

    public List<Esanmatriz> getGestantes() {
        return (List<Esanmatriz>) em.createNativeQuery("SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' AND m.flestadoreprodutivo = 'G' ", Esanmatriz.class).getResultList();
    }
}
