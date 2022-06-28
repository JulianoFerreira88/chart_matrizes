package com.model.entites;

import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanparto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanmovmaternidade.class)
public class Esanmovmaternidade_ { 

    public static volatile SingularAttribute<Esanmovmaternidade, Esandesmame> cddesmame;
    public static volatile SingularAttribute<Esanmovmaternidade, String> flmaedeleite;
    public static volatile SingularAttribute<Esanmovmaternidade, Date> dtmedianascimento;
    public static volatile SingularAttribute<Esanmovmaternidade, Double> peso;
    public static volatile SingularAttribute<Esanmovmaternidade, Date> dtmovimentacao;
    public static volatile SingularAttribute<Esanmovmaternidade, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanmovmaternidade, String> flpalm;
    public static volatile SingularAttribute<Esanmovmaternidade, Integer> cdmovmaternidade;
    public static volatile SingularAttribute<Esanmovmaternidade, Date> dtregistro;
    public static volatile SingularAttribute<Esanmovmaternidade, Esanparto> cdpartoorigem;
    public static volatile SingularAttribute<Esanmovmaternidade, Esanparto> cdpartodestino;
    public static volatile SingularAttribute<Esanmovmaternidade, String> guid;
    public static volatile SingularAttribute<Esanmovmaternidade, Double> pesomedionascimento;
    public static volatile SingularAttribute<Esanmovmaternidade, Integer> qtanimais;

}