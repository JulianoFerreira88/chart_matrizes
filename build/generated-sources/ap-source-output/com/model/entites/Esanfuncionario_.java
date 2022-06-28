package com.model.entites;

import com.model.entites.Esancobertura;
import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanparto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanfuncionario.class)
public class Esanfuncionario_ { 

    public static volatile SingularAttribute<Esanfuncionario, Double> vlsalario;
    public static volatile SingularAttribute<Esanfuncionario, Date> hrtrabalhodia;
    public static volatile ListAttribute<Esanfuncionario, Esancobertura> esancoberturaList;
    public static volatile SingularAttribute<Esanfuncionario, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanfuncionario, String> guid;
    public static volatile SingularAttribute<Esanfuncionario, Integer> cdfuncionario;
    public static volatile ListAttribute<Esanfuncionario, Esandesmame> esandesmameList;
    public static volatile ListAttribute<Esanfuncionario, Esanmovanimais> esanmovanimaisList;
    public static volatile SingularAttribute<Esanfuncionario, String> nmfuncionario;
    public static volatile SingularAttribute<Esanfuncionario, Double> peencargo;
    public static volatile SingularAttribute<Esanfuncionario, String> flativo;
    public static volatile ListAttribute<Esanfuncionario, Esanparto> esanpartoList;

}