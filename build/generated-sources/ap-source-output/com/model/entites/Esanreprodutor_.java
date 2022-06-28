package com.model.entites;

import com.model.entites.Eanentidade;
import com.model.entites.Eannota;
import com.model.entites.Esancobertura;
import com.model.entites.Esanempresa;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanraca;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanreprodutor.class)
public class Esanreprodutor_ { 

    public static volatile SingularAttribute<Esanreprodutor, String> flpredescarte;
    public static volatile SingularAttribute<Esanreprodutor, Date> dtentrada;
    public static volatile SingularAttribute<Esanreprodutor, Integer> cdreprodutor;
    public static volatile SingularAttribute<Esanreprodutor, Double> pesosaida;
    public static volatile ListAttribute<Esanreprodutor, Esancobertura> esancoberturaList;
    public static volatile SingularAttribute<Esanreprodutor, Esanraca> cdraca;
    public static volatile SingularAttribute<Esanreprodutor, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanreprodutor, String> flsituacao;
    public static volatile SingularAttribute<Esanreprodutor, Date> dtsaida;
    public static volatile SingularAttribute<Esanreprodutor, Eannota> cdnota;
    public static volatile SingularAttribute<Esanreprodutor, Double> pesoentrada;
    public static volatile SingularAttribute<Esanreprodutor, Date> dtregistro;
    public static volatile SingularAttribute<Esanreprodutor, String> flutilizadoeminseminacao;
    public static volatile SingularAttribute<Esanreprodutor, String> flehsemen;
    public static volatile SingularAttribute<Esanreprodutor, Eanentidade> cdentidade;
    public static volatile SingularAttribute<Esanreprodutor, Date> dtnascimento;
    public static volatile SingularAttribute<Esanreprodutor, String> id2;
    public static volatile SingularAttribute<Esanreprodutor, Esanmovanimais> cdmovanimais;
    public static volatile SingularAttribute<Esanreprodutor, String> id1;
    public static volatile SingularAttribute<Esanreprodutor, String> flrufiao;
    public static volatile SingularAttribute<Esanreprodutor, String> guid;
    public static volatile SingularAttribute<Esanreprodutor, String> flutilizadoemmontanatural;
    public static volatile SingularAttribute<Esanreprodutor, Double> vlcompra;
    public static volatile SingularAttribute<Esanreprodutor, Double> vlvenda;

}