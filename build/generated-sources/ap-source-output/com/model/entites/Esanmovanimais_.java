package com.model.entites;

import com.model.entites.Eanentidade;
import com.model.entites.Eannota;
import com.model.entites.Esancausa;
import com.model.entites.Esandesmame;
import com.model.entites.Esanempresa;
import com.model.entites.Esanfase;
import com.model.entites.Esanfuncionario;
import com.model.entites.Esanlote;
import com.model.entites.Esanmatriz;
import com.model.entites.Esanparto;
import com.model.entites.Esanreprodutor;
import com.model.entites.Esansala;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-28T09:18:16")
@StaticMetamodel(Esanmovanimais.class)
public class Esanmovanimais_ { 

    public static volatile SingularAttribute<Esanmovanimais, Integer> cdcargaanimal;
    public static volatile SingularAttribute<Esanmovanimais, String> observacao;
    public static volatile SingularAttribute<Esanmovanimais, Esansala> cdsalalote;
    public static volatile SingularAttribute<Esanmovanimais, Integer> cdmovanimais2;
    public static volatile SingularAttribute<Esanmovanimais, Date> hora;
    public static volatile SingularAttribute<Esanmovanimais, Integer> cdrelacionado;
    public static volatile SingularAttribute<Esanmovanimais, Esanempresa> cdgranja;
    public static volatile SingularAttribute<Esanmovanimais, Esanfuncionario> cdfuncionario;
    public static volatile ListAttribute<Esanmovanimais, Esandesmame> esandesmameList;
    public static volatile SingularAttribute<Esanmovanimais, String> fltipo;
    public static volatile SingularAttribute<Esanmovanimais, String> flpalm;
    public static volatile SingularAttribute<Esanmovanimais, Date> dtregistro;
    public static volatile SingularAttribute<Esanmovanimais, String> nubaia;
    public static volatile SingularAttribute<Esanmovanimais, Esanfase> cdfase;
    public static volatile SingularAttribute<Esanmovanimais, Date> dtnascimento;
    public static volatile SingularAttribute<Esanmovanimais, Integer> cdmovanimais;
    public static volatile SingularAttribute<Esanmovanimais, Integer> qtanimaisposabate;
    public static volatile SingularAttribute<Esanmovanimais, Esansala> cdsalalote2;
    public static volatile SingularAttribute<Esanmovanimais, Double> peso;
    public static volatile SingularAttribute<Esanmovanimais, Date> dtmovimentacao;
    public static volatile ListAttribute<Esanmovanimais, Esanmatriz> esanmatrizList;
    public static volatile SingularAttribute<Esanmovanimais, String> fltipovenda;
    public static volatile SingularAttribute<Esanmovanimais, Double> valor;
    public static volatile SingularAttribute<Esanmovanimais, Esanempresa> cdempresa;
    public static volatile SingularAttribute<Esanmovanimais, Esancausa> cdcausa;
    public static volatile SingularAttribute<Esanmovanimais, Eannota> cdnota;
    public static volatile SingularAttribute<Esanmovanimais, String> flacertomaternidadeagriness;
    public static volatile SingularAttribute<Esanmovanimais, Integer> cdlote2;
    public static volatile ListAttribute<Esanmovanimais, Esanparto> esanpartoList;
    public static volatile SingularAttribute<Esanmovanimais, Eanentidade> cdentidade;
    public static volatile ListAttribute<Esanmovanimais, Esanreprodutor> esanreprodutorList;
    public static volatile SingularAttribute<Esanmovanimais, Esanlote> cdlote;
    public static volatile SingularAttribute<Esanmovanimais, String> guid;
    public static volatile SingularAttribute<Esanmovanimais, Integer> qtanimais;

}