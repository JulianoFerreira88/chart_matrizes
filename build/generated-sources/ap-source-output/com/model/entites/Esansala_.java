package com.model.entites;

import com.model.entites.Esancobertura;
import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanfase;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanparto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esansala.class)
public class Esansala_ { 

    public static volatile SingularAttribute<Esansala, Integer> cdsala;
    public static volatile ListAttribute<Esansala, Esanmatriz> esanmatrizList;
    public static volatile ListAttribute<Esansala, Esancobertura> esancoberturaList;
    public static volatile SingularAttribute<Esansala, String> nmsala;
    public static volatile SingularAttribute<Esansala, Esanempresa> cdempresa;
    public static volatile ListAttribute<Esansala, Esandesmame> esandesmameList;
    public static volatile ListAttribute<Esansala, Esanmovanimais> esanmovanimaisList;
    public static volatile SingularAttribute<Esansala, Esanfase> cdfase;
    public static volatile ListAttribute<Esansala, Esanmovanimais> esanmovanimaisList1;
    public static volatile ListAttribute<Esansala, Esanparto> esanpartoList;
    public static volatile SingularAttribute<Esansala, Integer> nusala;
    public static volatile SingularAttribute<Esansala, Integer> nubaias;
    public static volatile SingularAttribute<Esansala, String> guid;

}