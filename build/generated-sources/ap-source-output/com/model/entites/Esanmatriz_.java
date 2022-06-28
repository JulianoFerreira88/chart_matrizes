package com.model.entites;

import com.model.entites.Eanentidade;
import com.model.entites.Eannota;
import com.model.entites.Esancobertura;
import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanparto;
import com.model.entites.Esanraca;
import com.model.entites.Esansala;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanmatriz.class)
public class Esanmatriz_ { 

    public static volatile SingularAttribute<Esanmatriz, String> obs;
    public static volatile SingularAttribute<Esanmatriz, String> flpredescarte;
    public static volatile SingularAttribute<Esanmatriz, String> flmaedeleite;
    public static volatile SingularAttribute<Esanmatriz, Date> dtprimeiracobertura;
    public static volatile SingularAttribute<Esanmatriz, Esansala> cdsala;
    public static volatile SingularAttribute<Esanmatriz, Double> pesosaida;
    public static volatile SingularAttribute<Esanmatriz, Esanraca> cdraca;
    public static volatile ListAttribute<Esanmatriz, Esandesmame> esandesmameList;
    public static volatile SingularAttribute<Esanmatriz, Date> dtregistro;
    public static volatile SingularAttribute<Esanmatriz, String> nubaia;
    public static volatile SingularAttribute<Esanmatriz, Date> dtnascimento;
    public static volatile SingularAttribute<Esanmatriz, String> fllactantecoberta;
    public static volatile SingularAttribute<Esanmatriz, Esanmovanimais> cdmovanimais;
    public static volatile SingularAttribute<Esanmatriz, Short> nuciclos;
    public static volatile SingularAttribute<Esanmatriz, Short> cicloentrada;
    public static volatile SingularAttribute<Esanmatriz, Double> vlcompra;
    public static volatile SingularAttribute<Esanmatriz, String> flmotivoentrada;
    public static volatile SingularAttribute<Esanmatriz, Date> dtentrada;
    public static volatile SingularAttribute<Esanmatriz, String> flestadoreprodutivo;
    public static volatile ListAttribute<Esanmatriz, Esancobertura> esancoberturaList;
    public static volatile SingularAttribute<Esanmatriz, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanmatriz, String> flsituacao;
    public static volatile SingularAttribute<Esanmatriz, Date> dtsaida;
    public static volatile SingularAttribute<Esanmatriz, Eannota> cdnota;
    public static volatile SingularAttribute<Esanmatriz, Double> pesoentrada;
    public static volatile SingularAttribute<Esanmatriz, Date> dtcobertcompra;
    public static volatile ListAttribute<Esanmatriz, Esanparto> esanpartoList;
    public static volatile SingularAttribute<Esanmatriz, Eanentidade> cdentidade;
    public static volatile SingularAttribute<Esanmatriz, Integer> cdmatriz;
    public static volatile SingularAttribute<Esanmatriz, String> flcompragestante;
    public static volatile SingularAttribute<Esanmatriz, String> id2;
    public static volatile SingularAttribute<Esanmatriz, String> id1;
    public static volatile SingularAttribute<Esanmatriz, String> guid;
    public static volatile SingularAttribute<Esanmatriz, Double> vlvenda;

}