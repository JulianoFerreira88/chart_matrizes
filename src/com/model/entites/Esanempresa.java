
package com.model.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ESANEMPRESA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanempresa.findAll", query = "SELECT e FROM Esanempresa e")})
public class Esanempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @Column(name = "NMEMPRESA")
    private String nmempresa;
    @Column(name = "FLSPS")
    private String flsps;
    @Column(name = "FLREPRODUCAO")
    private String flreproducao;
    @Column(name = "FLPRECRECHE")
    private String flprecreche;
    @Column(name = "FLCRECHE")
    private String flcreche;
    @Column(name = "FLRECRIA")
    private String flrecria;
    @Column(name = "FLTERMINACAO")
    private String flterminacao;
    @Column(name = "FLID1")
    private String flid1;
    @Column(name = "FLID2")
    private String flid2;
    @Column(name = "FLPESOMATRIZ")
    private String flpesomatriz;
    @Column(name = "FLESPESSURATOUCINHOMATRIZ")
    private String flespessuratoucinhomatriz;
    @Column(name = "FLNOME1")
    private String flnome1;
    @Column(name = "FLNOME2")
    private String flnome2;
    @Column(name = "FLNOME3")
    private String flnome3;
    @Column(name = "FLNOME4")
    private String flnome4;
    @Column(name = "FLCALENDARIO")
    private String flcalendario;
    @Column(name = "FLHOSPITAL")
    private String flhospital;
    @Column(name = "FLNUMONTAS")
    private Integer flnumontas;
    @Column(name = "FLNUINTERVALOMONTAS")
    private Integer flnuintervalomontas;
    @Column(name = "FLFUNCHORA")
    private String flfunchora;
    @Column(name = "FLCOBERTURALACTACAO")
    private String flcoberturalactacao;
    @Column(name = "FLSEMANA1ANO")
    private String flsemana1ano;
    @Column(name = "FLLOCALIZACAOMATRIZES")
    private String fllocalizacaomatrizes;
    @Column(name = "FLPESOLEITOESPARTO")
    private String flpesoleitoesparto;
    @Column(name = "FLPESOLEITOESDESMAME")
    private String flpesoleitoesdesmame;
    @Column(name = "FLDIGITACAOMATRIZ")
    private String fldigitacaomatriz;
    @Column(name = "FLVENDEVACINAMEDICAMENTO")
    private String flvendevacinamedicamento;
    @Column(name = "FLMATERNIDADE")
    private String flmaternidade;
    @Column(name = "FLSCORECORPORALMATRIZ")
    private String flscorecorporalmatriz;
    @Column(name = "FLLOTEDESMSEMANA")
    private String fllotedesmsemana;
    @Column(name = "FLLOTEDESMTIPO")
    private String fllotedesmtipo;
    @Column(name = "FLLOTEDESMANO")
    private String fllotedesmano;
    @Column(name = "FLVENDEMATERIAL")
    private String flvendematerial;
    @Column(name = "FLCONTROLEMATERNIDADE")
    private String flcontrolematernidade;
    @Column(name = "FLPARTICIPARANKING")
    private String flparticiparanking;
    @Column(name = "FLPRODUCAORACAOPELOCONSUMO")
    private String flproducaoracaopeloconsumo;
    @Column(name = "FLCONSUMORACAOPELACOMPRA")
    private String flconsumoracaopelacompra;
    @Column(name = "FLCONSUMOVACINAPELACOMPRA")
    private String flconsumovacinapelacompra;
    @Column(name = "FLCONSUMOMATERIALPELACOMPRA")
    private String flconsumomaterialpelacompra;
    @Column(name = "FLLEITOESBAIXAVIABILIDADE")
    private String flleitoesbaixaviabilidade;
    @Column(name = "FLBLOQUEIOPRODUCAORACAO")
    private String flbloqueioproducaoracao;
    @Column(name = "FLINICIOSEMANA")
    private Integer fliniciosemana;
    @Column(name = "FLTIPIFICACAOCARCACA")
    private Character fltipificacaocarcaca;
    @Column(name = "FLTIPOCALCULOCONSUMORACAO")
    private Character fltipocalculoconsumoracao;
    @Column(name = "FLLOCALIZACAO")
    private String fllocalizacao;
    @Column(name = "NMPROPRIETARIO")
    private String nmproprietario;
    @Column(name = "NMRESPONSAVELTECNICO")
    private String nmresponsaveltecnico;
    @Column(name = "NMCRMV")
    private String nmcrmv;
    @Column(name = "NMORGAOESTADUAL")
    private String nmorgaoestadual;
    @Column(name = "NMGEOREFERENCIAMENTO")
    private String nmgeoreferenciamento;
    @Column(name = "CDMUNICIPIO")
    private Integer cdmunicipio;
    @Column(name = "FLRESPONSAVELBOLETIM")
    private Integer flresponsavelboletim;
    @Column(name = "NMRESPONSAVELTECNICOOUTRO")
    private String nmresponsaveltecnicooutro;
    @Column(name = "FLPERMITIRVALORCOMPRAMAIORNF")
    private String flpermitirvalorcompramaiornf;
    @Column(name = "NUDIASBANDA")
    private Integer nudiasbanda;
    @Column(name = "DABASEBANDA")
    @Temporal(TemporalType.DATE)
    private Date dabasebanda;
    @Column(name = "FLUTILIZAENQUETEBRF")
    private Character flutilizaenquetebrf;
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "FLUTILIZAEXPORTSAIDAPLANTEL")
    private String flutilizaexportsaidaplantel;
    @Column(name = "FLUTILIZAEXPORTADORBRFMTECH")
    private Character flutilizaexportadorbrfmtech;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanmovmaternidade> esanmovmaternidadeList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanfuncionario> esanfuncionarioList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Eannota> eannotaList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanparto> esanpartoList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esansala> esansalaList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanreprodutor> esanreprodutorList;
    @OneToMany(mappedBy = "cdgranja")
    private List<Esanmovanimais> esanmovanimaisList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanmovanimais> esanmovanimaisList1;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esancobertura> esancoberturaList;
    @OneToMany(mappedBy = "cdempresa")
    private List<Esanlote> esanloteList;

    public Esanempresa() {
    }

    public Esanempresa(Integer cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanempresa(Integer cdempresa, String flutilizaexportsaidaplantel) {
        this.cdempresa = cdempresa;
        this.flutilizaexportsaidaplantel = flutilizaexportsaidaplantel;
    }

    public Integer getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Integer cdempresa) {
        this.cdempresa = cdempresa;
    }

    public String getNmempresa() {
        return nmempresa;
    }

    public void setNmempresa(String nmempresa) {
        this.nmempresa = nmempresa;
    }

    public String getFlsps() {
        return flsps;
    }

    public void setFlsps(String flsps) {
        this.flsps = flsps;
    }

    public String getFlreproducao() {
        return flreproducao;
    }

    public void setFlreproducao(String flreproducao) {
        this.flreproducao = flreproducao;
    }

    public String getFlprecreche() {
        return flprecreche;
    }

    public void setFlprecreche(String flprecreche) {
        this.flprecreche = flprecreche;
    }

    public String getFlcreche() {
        return flcreche;
    }

    public void setFlcreche(String flcreche) {
        this.flcreche = flcreche;
    }

    public String getFlrecria() {
        return flrecria;
    }

    public void setFlrecria(String flrecria) {
        this.flrecria = flrecria;
    }

    public String getFlterminacao() {
        return flterminacao;
    }

    public void setFlterminacao(String flterminacao) {
        this.flterminacao = flterminacao;
    }

    public String getFlid1() {
        return flid1;
    }

    public void setFlid1(String flid1) {
        this.flid1 = flid1;
    }

    public String getFlid2() {
        return flid2;
    }

    public void setFlid2(String flid2) {
        this.flid2 = flid2;
    }

    public String getFlpesomatriz() {
        return flpesomatriz;
    }

    public void setFlpesomatriz(String flpesomatriz) {
        this.flpesomatriz = flpesomatriz;
    }

    public String getFlespessuratoucinhomatriz() {
        return flespessuratoucinhomatriz;
    }

    public void setFlespessuratoucinhomatriz(String flespessuratoucinhomatriz) {
        this.flespessuratoucinhomatriz = flespessuratoucinhomatriz;
    }

    public String getFlnome1() {
        return flnome1;
    }

    public void setFlnome1(String flnome1) {
        this.flnome1 = flnome1;
    }

    public String getFlnome2() {
        return flnome2;
    }

    public void setFlnome2(String flnome2) {
        this.flnome2 = flnome2;
    }

    public String getFlnome3() {
        return flnome3;
    }

    public void setFlnome3(String flnome3) {
        this.flnome3 = flnome3;
    }

    public String getFlnome4() {
        return flnome4;
    }

    public void setFlnome4(String flnome4) {
        this.flnome4 = flnome4;
    }

    public String getFlcalendario() {
        return flcalendario;
    }

    public void setFlcalendario(String flcalendario) {
        this.flcalendario = flcalendario;
    }

    public String getFlhospital() {
        return flhospital;
    }

    public void setFlhospital(String flhospital) {
        this.flhospital = flhospital;
    }

    public Integer getFlnumontas() {
        return flnumontas;
    }

    public void setFlnumontas(Integer flnumontas) {
        this.flnumontas = flnumontas;
    }

    public Integer getFlnuintervalomontas() {
        return flnuintervalomontas;
    }

    public void setFlnuintervalomontas(Integer flnuintervalomontas) {
        this.flnuintervalomontas = flnuintervalomontas;
    }

    public String getFlfunchora() {
        return flfunchora;
    }

    public void setFlfunchora(String flfunchora) {
        this.flfunchora = flfunchora;
    }

    public String getFlcoberturalactacao() {
        return flcoberturalactacao;
    }

    public void setFlcoberturalactacao(String flcoberturalactacao) {
        this.flcoberturalactacao = flcoberturalactacao;
    }

    public String getFlsemana1ano() {
        return flsemana1ano;
    }

    public void setFlsemana1ano(String flsemana1ano) {
        this.flsemana1ano = flsemana1ano;
    }

    public String getFllocalizacaomatrizes() {
        return fllocalizacaomatrizes;
    }

    public void setFllocalizacaomatrizes(String fllocalizacaomatrizes) {
        this.fllocalizacaomatrizes = fllocalizacaomatrizes;
    }

    public String getFlpesoleitoesparto() {
        return flpesoleitoesparto;
    }

    public void setFlpesoleitoesparto(String flpesoleitoesparto) {
        this.flpesoleitoesparto = flpesoleitoesparto;
    }

    public String getFlpesoleitoesdesmame() {
        return flpesoleitoesdesmame;
    }

    public void setFlpesoleitoesdesmame(String flpesoleitoesdesmame) {
        this.flpesoleitoesdesmame = flpesoleitoesdesmame;
    }

    public String getFldigitacaomatriz() {
        return fldigitacaomatriz;
    }

    public void setFldigitacaomatriz(String fldigitacaomatriz) {
        this.fldigitacaomatriz = fldigitacaomatriz;
    }

    public String getFlvendevacinamedicamento() {
        return flvendevacinamedicamento;
    }

    public void setFlvendevacinamedicamento(String flvendevacinamedicamento) {
        this.flvendevacinamedicamento = flvendevacinamedicamento;
    }

    public String getFlmaternidade() {
        return flmaternidade;
    }

    public void setFlmaternidade(String flmaternidade) {
        this.flmaternidade = flmaternidade;
    }

    public String getFlscorecorporalmatriz() {
        return flscorecorporalmatriz;
    }

    public void setFlscorecorporalmatriz(String flscorecorporalmatriz) {
        this.flscorecorporalmatriz = flscorecorporalmatriz;
    }

    public String getFllotedesmsemana() {
        return fllotedesmsemana;
    }

    public void setFllotedesmsemana(String fllotedesmsemana) {
        this.fllotedesmsemana = fllotedesmsemana;
    }

    public String getFllotedesmtipo() {
        return fllotedesmtipo;
    }

    public void setFllotedesmtipo(String fllotedesmtipo) {
        this.fllotedesmtipo = fllotedesmtipo;
    }

    public String getFllotedesmano() {
        return fllotedesmano;
    }

    public void setFllotedesmano(String fllotedesmano) {
        this.fllotedesmano = fllotedesmano;
    }

    public String getFlvendematerial() {
        return flvendematerial;
    }

    public void setFlvendematerial(String flvendematerial) {
        this.flvendematerial = flvendematerial;
    }

    public String getFlcontrolematernidade() {
        return flcontrolematernidade;
    }

    public void setFlcontrolematernidade(String flcontrolematernidade) {
        this.flcontrolematernidade = flcontrolematernidade;
    }

    public String getFlparticiparanking() {
        return flparticiparanking;
    }

    public void setFlparticiparanking(String flparticiparanking) {
        this.flparticiparanking = flparticiparanking;
    }

    public String getFlproducaoracaopeloconsumo() {
        return flproducaoracaopeloconsumo;
    }

    public void setFlproducaoracaopeloconsumo(String flproducaoracaopeloconsumo) {
        this.flproducaoracaopeloconsumo = flproducaoracaopeloconsumo;
    }

    public String getFlconsumoracaopelacompra() {
        return flconsumoracaopelacompra;
    }

    public void setFlconsumoracaopelacompra(String flconsumoracaopelacompra) {
        this.flconsumoracaopelacompra = flconsumoracaopelacompra;
    }

    public String getFlconsumovacinapelacompra() {
        return flconsumovacinapelacompra;
    }

    public void setFlconsumovacinapelacompra(String flconsumovacinapelacompra) {
        this.flconsumovacinapelacompra = flconsumovacinapelacompra;
    }

    public String getFlconsumomaterialpelacompra() {
        return flconsumomaterialpelacompra;
    }

    public void setFlconsumomaterialpelacompra(String flconsumomaterialpelacompra) {
        this.flconsumomaterialpelacompra = flconsumomaterialpelacompra;
    }

    public String getFlleitoesbaixaviabilidade() {
        return flleitoesbaixaviabilidade;
    }

    public void setFlleitoesbaixaviabilidade(String flleitoesbaixaviabilidade) {
        this.flleitoesbaixaviabilidade = flleitoesbaixaviabilidade;
    }

    public String getFlbloqueioproducaoracao() {
        return flbloqueioproducaoracao;
    }

    public void setFlbloqueioproducaoracao(String flbloqueioproducaoracao) {
        this.flbloqueioproducaoracao = flbloqueioproducaoracao;
    }

    public Integer getFliniciosemana() {
        return fliniciosemana;
    }

    public void setFliniciosemana(Integer fliniciosemana) {
        this.fliniciosemana = fliniciosemana;
    }

    public Character getFltipificacaocarcaca() {
        return fltipificacaocarcaca;
    }

    public void setFltipificacaocarcaca(Character fltipificacaocarcaca) {
        this.fltipificacaocarcaca = fltipificacaocarcaca;
    }

    public Character getFltipocalculoconsumoracao() {
        return fltipocalculoconsumoracao;
    }

    public void setFltipocalculoconsumoracao(Character fltipocalculoconsumoracao) {
        this.fltipocalculoconsumoracao = fltipocalculoconsumoracao;
    }

    public String getFllocalizacao() {
        return fllocalizacao;
    }

    public void setFllocalizacao(String fllocalizacao) {
        this.fllocalizacao = fllocalizacao;
    }

    public String getNmproprietario() {
        return nmproprietario;
    }

    public void setNmproprietario(String nmproprietario) {
        this.nmproprietario = nmproprietario;
    }

    public String getNmresponsaveltecnico() {
        return nmresponsaveltecnico;
    }

    public void setNmresponsaveltecnico(String nmresponsaveltecnico) {
        this.nmresponsaveltecnico = nmresponsaveltecnico;
    }

    public String getNmcrmv() {
        return nmcrmv;
    }

    public void setNmcrmv(String nmcrmv) {
        this.nmcrmv = nmcrmv;
    }

    public String getNmorgaoestadual() {
        return nmorgaoestadual;
    }

    public void setNmorgaoestadual(String nmorgaoestadual) {
        this.nmorgaoestadual = nmorgaoestadual;
    }

    public String getNmgeoreferenciamento() {
        return nmgeoreferenciamento;
    }

    public void setNmgeoreferenciamento(String nmgeoreferenciamento) {
        this.nmgeoreferenciamento = nmgeoreferenciamento;
    }

    public Integer getCdmunicipio() {
        return cdmunicipio;
    }

    public void setCdmunicipio(Integer cdmunicipio) {
        this.cdmunicipio = cdmunicipio;
    }

    public Integer getFlresponsavelboletim() {
        return flresponsavelboletim;
    }

    public void setFlresponsavelboletim(Integer flresponsavelboletim) {
        this.flresponsavelboletim = flresponsavelboletim;
    }

    public String getNmresponsaveltecnicooutro() {
        return nmresponsaveltecnicooutro;
    }

    public void setNmresponsaveltecnicooutro(String nmresponsaveltecnicooutro) {
        this.nmresponsaveltecnicooutro = nmresponsaveltecnicooutro;
    }

    public String getFlpermitirvalorcompramaiornf() {
        return flpermitirvalorcompramaiornf;
    }

    public void setFlpermitirvalorcompramaiornf(String flpermitirvalorcompramaiornf) {
        this.flpermitirvalorcompramaiornf = flpermitirvalorcompramaiornf;
    }

    public Integer getNudiasbanda() {
        return nudiasbanda;
    }

    public void setNudiasbanda(Integer nudiasbanda) {
        this.nudiasbanda = nudiasbanda;
    }

    public Date getDabasebanda() {
        return dabasebanda;
    }

    public void setDabasebanda(Date dabasebanda) {
        this.dabasebanda = dabasebanda;
    }

    public Character getFlutilizaenquetebrf() {
        return flutilizaenquetebrf;
    }

    public void setFlutilizaenquetebrf(Character flutilizaenquetebrf) {
        this.flutilizaenquetebrf = flutilizaenquetebrf;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getFlutilizaexportsaidaplantel() {
        return flutilizaexportsaidaplantel;
    }

    public void setFlutilizaexportsaidaplantel(String flutilizaexportsaidaplantel) {
        this.flutilizaexportsaidaplantel = flutilizaexportsaidaplantel;
    }

    public Character getFlutilizaexportadorbrfmtech() {
        return flutilizaexportadorbrfmtech;
    }

    public void setFlutilizaexportadorbrfmtech(Character flutilizaexportadorbrfmtech) {
        this.flutilizaexportadorbrfmtech = flutilizaexportadorbrfmtech;
    }

    public List<Esanmovmaternidade> getEsanmovmaternidadeList() {
        return esanmovmaternidadeList;
    }

    public void setEsanmovmaternidadeList(List<Esanmovmaternidade> esanmovmaternidadeList) {
        this.esanmovmaternidadeList = esanmovmaternidadeList;
    }

    public List<Esanfuncionario> getEsanfuncionarioList() {
        return esanfuncionarioList;
    }

    public void setEsanfuncionarioList(List<Esanfuncionario> esanfuncionarioList) {
        this.esanfuncionarioList = esanfuncionarioList;
    }

    public List<Eannota> getEannotaList() {
        return eannotaList;
    }

    public void setEannotaList(List<Eannota> eannotaList) {
        this.eannotaList = eannotaList;
    }

    public List<Esandesmame> getEsandesmameList() {
        return esandesmameList;
    }

    public void setEsandesmameList(List<Esandesmame> esandesmameList) {
        this.esandesmameList = esandesmameList;
    }

    public List<Esanparto> getEsanpartoList() {
        return esanpartoList;
    }

    public void setEsanpartoList(List<Esanparto> esanpartoList) {
        this.esanpartoList = esanpartoList;
    }

    public List<Esansala> getEsansalaList() {
        return esansalaList;
    }

    public void setEsansalaList(List<Esansala> esansalaList) {
        this.esansalaList = esansalaList;
    }

    public List<Esanmatriz> getEsanmatrizList() {
        return esanmatrizList;
    }

    public void setEsanmatrizList(List<Esanmatriz> esanmatrizList) {
        this.esanmatrizList = esanmatrizList;
    }

    public List<Esanreprodutor> getEsanreprodutorList() {
        return esanreprodutorList;
    }

    public void setEsanreprodutorList(List<Esanreprodutor> esanreprodutorList) {
        this.esanreprodutorList = esanreprodutorList;
    }

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
    }

    public List<Esanmovanimais> getEsanmovanimaisList1() {
        return esanmovanimaisList1;
    }

    public void setEsanmovanimaisList1(List<Esanmovanimais> esanmovanimaisList1) {
        this.esanmovanimaisList1 = esanmovanimaisList1;
    }

    public List<Esancobertura> getEsancoberturaList() {
        return esancoberturaList;
    }

    public void setEsancoberturaList(List<Esancobertura> esancoberturaList) {
        this.esancoberturaList = esancoberturaList;
    }

    public List<Esanlote> getEsanloteList() {
        return esanloteList;
    }

    public void setEsanloteList(List<Esanlote> esanloteList) {
        this.esanloteList = esanloteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdempresa != null ? cdempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanempresa)) {
            return false;
        }
        Esanempresa other = (Esanempresa) object;
        if ((this.cdempresa == null && other.cdempresa != null) || (this.cdempresa != null && !this.cdempresa.equals(other.cdempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanempresa[ cdempresa=" + cdempresa + " ]";
    }

}
