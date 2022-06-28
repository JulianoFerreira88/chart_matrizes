package com.model.entites;

import com.model.entites.Ecusbdporccausaleitao;
import com.model.entites.Ecusbdporccausareprodutor;
import com.model.entites.Esanmovanimais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esancausa.class)
public class Esancausa_ { 

    public static volatile SingularAttribute<Esancausa, String> flterminado;
    public static volatile SingularAttribute<Esancausa, String> nmcausa;
    public static volatile SingularAttribute<Esancausa, Integer> cdcausa;
    public static volatile SingularAttribute<Esancausa, Character> flsituacao;
    public static volatile ListAttribute<Esancausa, Esanmovanimais> esanmovanimaisList;
    public static volatile SingularAttribute<Esancausa, String> fltipo;
    public static volatile SingularAttribute<Esancausa, Ecusbdporccausareprodutor> cdbdporccausareprod;
    public static volatile SingularAttribute<Esancausa, String> flmatriz;
    public static volatile SingularAttribute<Esancausa, String> flreprodutor;
    public static volatile SingularAttribute<Esancausa, String> flmarra;
    public static volatile SingularAttribute<Esancausa, String> fldescarteproblemareprodutivo;
    public static volatile SingularAttribute<Esancausa, Ecusbdporccausaleitao> cdbdporccausaleitao;
    public static volatile SingularAttribute<Esancausa, String> flleitaolactante;
    public static volatile SingularAttribute<Esancausa, String> guid;
    public static volatile SingularAttribute<Esancausa, String> flleitao;
    public static volatile SingularAttribute<Esancausa, String> flintegradora;

}