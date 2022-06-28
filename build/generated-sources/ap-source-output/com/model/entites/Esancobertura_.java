package com.model.entites;

import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanfuncionario;
import com.model.entites.Esangrupocobertura;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanparto;
import com.model.entites.Esanreprodutor;
import com.model.entites.Esansala;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esancobertura.class)
public class Esancobertura_ { 

    public static volatile SingularAttribute<Esancobertura, String> obs;
    public static volatile SingularAttribute<Esancobertura, String> flmaedeleite;
    public static volatile SingularAttribute<Esancobertura, Esansala> cdsala;
    public static volatile SingularAttribute<Esancobertura, String> flinseminacao;
    public static volatile SingularAttribute<Esancobertura, Esanreprodutor> cdreprodutor;
    public static volatile SingularAttribute<Esancobertura, Integer> idcobertura;
    public static volatile SingularAttribute<Esancobertura, Esanfuncionario> cdfuncionario;
    public static volatile ListAttribute<Esancobertura, Esandesmame> esandesmameList;
    public static volatile SingularAttribute<Esancobertura, String> flpalm;
    public static volatile SingularAttribute<Esancobertura, Date> dtregistro;
    public static volatile SingularAttribute<Esancobertura, String> nubaia;
    public static volatile SingularAttribute<Esancobertura, Integer> cdcobertura;
    public static volatile SingularAttribute<Esancobertura, Date> horacobertura;
    public static volatile SingularAttribute<Esancobertura, Integer> ciclo;
    public static volatile SingularAttribute<Esancobertura, String> flcobertanalactacao;
    public static volatile SingularAttribute<Esancobertura, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esancobertura, Date> dtcobertura;
    public static volatile ListAttribute<Esancobertura, Esanparto> esanpartoList;
    public static volatile SingularAttribute<Esancobertura, Double> espessuratoucinhomatriz;
    public static volatile SingularAttribute<Esancobertura, Integer> scorecorporal;
    public static volatile SingularAttribute<Esancobertura, String> flcompragestante;
    public static volatile SingularAttribute<Esancobertura, Esanmatriz> cdmatriz;
    public static volatile SingularAttribute<Esancobertura, Esangrupocobertura> cdgrupocobertura;
    public static volatile SingularAttribute<Esancobertura, String> guid;
    public static volatile SingularAttribute<Esancobertura, Double> pesomatriz;

}