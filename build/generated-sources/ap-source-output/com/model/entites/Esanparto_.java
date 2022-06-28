package com.model.entites;

import com.model.entites.Esancobertura;
import com.model.entites.Esanempresa;
import com.model.entites.Esanfuncionario;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanmovmaternidade;
import com.model.entites.Esansala;
import com.model.entites.Esantipoparto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanparto.class)
public class Esanparto_ { 

    public static volatile SingularAttribute<Esanparto, String> obs;
    public static volatile SingularAttribute<Esanparto, Esansala> cdsala;
    public static volatile SingularAttribute<Esanparto, Date> dtmedianascimento;
    public static volatile SingularAttribute<Esanparto, Date> horainicioparto;
    public static volatile SingularAttribute<Esanparto, Esanfuncionario> cdfuncionario;
    public static volatile SingularAttribute<Esanparto, String> flpalm;
    public static volatile SingularAttribute<Esanparto, Integer> nuleitoesabaixo;
    public static volatile SingularAttribute<Esanparto, Date> dtregistro;
    public static volatile SingularAttribute<Esanparto, String> nubaia;
    public static volatile SingularAttribute<Esanparto, Integer> numumificado;
    public static volatile SingularAttribute<Esanparto, Date> dtfimparto;
    public static volatile SingularAttribute<Esanparto, Integer> nudoado;
    public static volatile SingularAttribute<Esanparto, Esanmovanimais> cdmovanimais;
    public static volatile SingularAttribute<Esanparto, Date> dtinicioparto;
    public static volatile SingularAttribute<Esanparto, String> duracao;
    public static volatile SingularAttribute<Esanparto, Double> pesomedionascimento;
    public static volatile SingularAttribute<Esanparto, Esantipoparto> cdtipoparto;
    public static volatile SingularAttribute<Esanparto, Integer> cdparto;
    public static volatile SingularAttribute<Esanparto, Esancobertura> cdcobertura;
    public static volatile SingularAttribute<Esanparto, Integer> ciclo;
    public static volatile ListAttribute<Esanparto, Esanmovmaternidade> esanmovmaternidadeList1;
    public static volatile SingularAttribute<Esanparto, Integer> numortoaonascer;
    public static volatile ListAttribute<Esanparto, Esanmovmaternidade> esanmovmaternidadeList;
    public static volatile SingularAttribute<Esanparto, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanparto, Integer> nuvivo;
    public static volatile SingularAttribute<Esanparto, Double> espessuratoucinhomatriz;
    public static volatile SingularAttribute<Esanparto, Integer> scorecorporal;
    public static volatile SingularAttribute<Esanparto, Integer> nurecebido;
    public static volatile SingularAttribute<Esanparto, Double> pesoleitegada;
    public static volatile SingularAttribute<Esanparto, Esanmatriz> cdmatriz;
    public static volatile SingularAttribute<Esanparto, Integer> nuleitoesentre;
    public static volatile SingularAttribute<Esanparto, String> guid;
    public static volatile SingularAttribute<Esanparto, Date> horafimparto;
    public static volatile SingularAttribute<Esanparto, Double> pesomatriz;
    public static volatile SingularAttribute<Esanparto, Integer> nuleitoesacima;
    public static volatile SingularAttribute<Esanparto, Integer> nunatimorto;

}