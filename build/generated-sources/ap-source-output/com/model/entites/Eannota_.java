package com.model.entites;

import com.model.entites.Eanentidade;
import com.model.entites.Esanempresa;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanreprodutor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Eannota.class)
public class Eannota_ { 

    public static volatile SingularAttribute<Eannota, String> obs;
    public static volatile SingularAttribute<Eannota, String> filial;
    public static volatile SingularAttribute<Eannota, Date> dtnota;
    public static volatile ListAttribute<Eannota, Esanmatriz> esanmatrizList;
    public static volatile SingularAttribute<Eannota, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Eannota, Integer> cdnota;
    public static volatile ListAttribute<Eannota, Esanmovanimais> esanmovanimaisList;
    public static volatile SingularAttribute<Eannota, String> nunota;
    public static volatile SingularAttribute<Eannota, Date> dtregistro;
    public static volatile SingularAttribute<Eannota, String> fltiponota;
    public static volatile SingularAttribute<Eannota, Double> vltotalatual;
    public static volatile SingularAttribute<Eannota, Eanentidade> cdentidade;
    public static volatile SingularAttribute<Eannota, Double> vltotalnota;
    public static volatile SingularAttribute<Eannota, String> fltipopagamento;
    public static volatile ListAttribute<Eannota, Esanreprodutor> esanreprodutorList;
    public static volatile SingularAttribute<Eannota, String> serie;
    public static volatile SingularAttribute<Eannota, String> guid;

}