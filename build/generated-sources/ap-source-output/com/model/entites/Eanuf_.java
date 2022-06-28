package com.model.entites;

import com.model.entites.Eanmunicipio;
import com.model.entites.Eanpais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Eanuf.class)
public class Eanuf_ { 

    public static volatile SingularAttribute<Eanuf, String> nmuf;
    public static volatile SingularAttribute<Eanuf, String> sigla;
    public static volatile SingularAttribute<Eanuf, Eanpais> cdpais;
    public static volatile SingularAttribute<Eanuf, Integer> cduf;
    public static volatile ListAttribute<Eanuf, Eanmunicipio> eanmunicipioList;
    public static volatile SingularAttribute<Eanuf, String> flintegradora;

}