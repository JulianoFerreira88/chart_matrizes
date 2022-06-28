package com.model.entites;

import com.model.entites.Ecusbdporcraca;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanreprodutor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanraca.class)
public class Esanraca_ { 

    public static volatile SingularAttribute<Esanraca, String> nmraca;
    public static volatile ListAttribute<Esanraca, Esanreprodutor> esanreprodutorList;
    public static volatile ListAttribute<Esanraca, Esanmatriz> esanmatrizList;
    public static volatile SingularAttribute<Esanraca, Integer> cdraca;
    public static volatile SingularAttribute<Esanraca, String> guid;
    public static volatile SingularAttribute<Esanraca, Ecusbdporcraca> cdbdporcraca;
    public static volatile SingularAttribute<Esanraca, String> flsituacao;
    public static volatile SingularAttribute<Esanraca, String> flintegradora;

}