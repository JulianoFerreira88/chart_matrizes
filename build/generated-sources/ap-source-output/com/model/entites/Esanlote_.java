package com.model.entites;

import com.model.entites.Eanentidade;
import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanmovanimais;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanlote.class)
public class Esanlote_ { 

    public static volatile SingularAttribute<Esanlote, String> obs;
    public static volatile SingularAttribute<Esanlote, Date> dtmedianascimento;
    public static volatile SingularAttribute<Esanlote, Eanentidade> cdentidade;
    public static volatile SingularAttribute<Esanlote, String> nmlote;
    public static volatile SingularAttribute<Esanlote, Integer> cdlote;
    public static volatile SingularAttribute<Esanlote, String> flsituacao2;
    public static volatile SingularAttribute<Esanlote, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanlote, String> guid;
    public static volatile SingularAttribute<Esanlote, String> flsituacao;
    public static volatile ListAttribute<Esanlote, Esandesmame> esandesmameList;
    public static volatile ListAttribute<Esanlote, Esanmovanimais> esanmovanimaisList;
    public static volatile SingularAttribute<Esanlote, Date> dtmedianascimento2;

}