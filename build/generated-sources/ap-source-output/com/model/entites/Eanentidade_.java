package com.model.entites;

import com.model.entites.Eanmunicipio;
import com.model.entites.Eannota;
import com.model.entites.Esanlote;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanmovanimais;
import com.model.entites.Esanreprodutor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Eanentidade.class)
public class Eanentidade_ { 

    public static volatile SingularAttribute<Eanentidade, Eanmunicipio> cdmunicipio;
    public static volatile SingularAttribute<Eanentidade, String> observacao;
    public static volatile SingularAttribute<Eanentidade, String> nmentidade;
    public static volatile ListAttribute<Eanentidade, Eannota> eannotaList;
    public static volatile SingularAttribute<Eanentidade, String> documento;
    public static volatile ListAttribute<Eanentidade, Esanmovanimais> esanmovanimaisList;
    public static volatile ListAttribute<Eanentidade, Esanlote> esanloteList;
    public static volatile SingularAttribute<Eanentidade, String> cep;
    public static volatile SingularAttribute<Eanentidade, String> fonecelular;
    public static volatile SingularAttribute<Eanentidade, String> complemento;
    public static volatile SingularAttribute<Eanentidade, String> cdprocedencia;
    public static volatile SingularAttribute<Eanentidade, String> fonecomercial;
    public static volatile SingularAttribute<Eanentidade, Integer> cdgranjaintegradora;
    public static volatile SingularAttribute<Eanentidade, String> foneresidencial;
    public static volatile SingularAttribute<Eanentidade, String> fax;
    public static volatile SingularAttribute<Eanentidade, String> inscestadual;
    public static volatile SingularAttribute<Eanentidade, String> email;
    public static volatile SingularAttribute<Eanentidade, String> nmfantasia;
    public static volatile SingularAttribute<Eanentidade, String> endereco;
    public static volatile SingularAttribute<Eanentidade, String> bairro;
    public static volatile ListAttribute<Eanentidade, Esanmatriz> esanmatrizList;
    public static volatile SingularAttribute<Eanentidade, String> flsituacao;
    public static volatile SingularAttribute<Eanentidade, String> caixapostal;
    public static volatile SingularAttribute<Eanentidade, Integer> cdentidade;
    public static volatile SingularAttribute<Eanentidade, String> cgccpf;
    public static volatile SingularAttribute<Eanentidade, String> fltipopessoa;
    public static volatile ListAttribute<Eanentidade, Esanreprodutor> esanreprodutorList;
    public static volatile SingularAttribute<Eanentidade, String> guid;
    public static volatile SingularAttribute<Eanentidade, Date> dtcadastro;
    public static volatile SingularAttribute<Eanentidade, String> homepage;
    public static volatile SingularAttribute<Eanentidade, String> flintegradora;

}