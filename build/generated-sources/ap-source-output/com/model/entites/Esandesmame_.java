package com.model.entites;

import com.model.entites.Esancobertura;
import com.model.entites.Esanempresa;
import com.model.entites.Esanfuncionario;
import com.model.entites.Esanlote;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanmovmaternidade;
import com.model.entites.Esansala;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esandesmame.class)
public class Esandesmame_ { 

    public static volatile SingularAttribute<Esandesmame, Integer> nudesmamado;
    public static volatile SingularAttribute<Esandesmame, Integer> cddesmame;
    public static volatile SingularAttribute<Esandesmame, String> obs;
    public static volatile SingularAttribute<Esandesmame, Esansala> cdsala;
    public static volatile SingularAttribute<Esandesmame, String> fldesmameparcial;
    public static volatile SingularAttribute<Esandesmame, Esanfuncionario> cdfuncionario;
    public static volatile SingularAttribute<Esandesmame, String> flpalm;
    public static volatile SingularAttribute<Esandesmame, Date> dtregistro;
    public static volatile SingularAttribute<Esandesmame, String> nubaia;
    public static volatile SingularAttribute<Esandesmame, Integer> nudoado;
    public static volatile SingularAttribute<Esandesmame, Esanmovanimais> cdmovanimais;
    public static volatile SingularAttribute<Esandesmame, String> flgeradoautomaticamente;
    public static volatile SingularAttribute<Esandesmame, Integer> nudesclassificado;
    public static volatile SingularAttribute<Esandesmame, Esancobertura> cdcobertura;
    public static volatile SingularAttribute<Esandesmame, Integer> ciclo;
    public static volatile ListAttribute<Esandesmame, Esanmovmaternidade> esanmovmaternidadeList;
    public static volatile SingularAttribute<Esandesmame, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esandesmame, Integer> numorto;
    public static volatile SingularAttribute<Esandesmame, Double> espessuratoucinhomatriz;
    public static volatile SingularAttribute<Esandesmame, Integer> scorecorporal;
    public static volatile SingularAttribute<Esandesmame, Integer> nurecebido;
    public static volatile SingularAttribute<Esandesmame, Double> pesoleitegada;
    public static volatile SingularAttribute<Esandesmame, Esanmatriz> cdmatriz;
    public static volatile SingularAttribute<Esandesmame, Esanlote> cdlote;
    public static volatile SingularAttribute<Esandesmame, String> guid;
    public static volatile SingularAttribute<Esandesmame, Date> dtdesmame;
    public static volatile SingularAttribute<Esandesmame, Double> pesomatriz;

}