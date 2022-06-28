
package com.model.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ESANMOVANIMAIS", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanmovanimais.findAll", query = "SELECT e FROM Esanmovanimais e")})
public class Esanmovanimais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMOVANIMAIS")
    private Integer cdmovanimais;
    @Column(name = "CDMOVANIMAIS2")
    private Integer cdmovanimais2;
    @Column(name = "FLTIPO")
    private String fltipo;
    @Column(name = "FLTIPOVENDA")
    private String fltipovenda;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTMOVIMENTACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmovimentacao;
    @Column(name = "QTANIMAIS")
    private Integer qtanimais;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private Double peso;
    @Column(name = "DTNASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    @Column(name = "CDRELACIONADO")
    private Integer cdrelacionado;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "CDLOTE2")
    private Integer cdlote2;
    @Column(name = "CDCARGAANIMAL")
    private Integer cdcargaanimal;
    @Column(name = "QTANIMAISPOSABATE")
    private Integer qtanimaisposabate;
    @Column(name = "FLACERTOMATERNIDADEAGRINESS")
    private String flacertomaternidadeagriness;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdmovanimais")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdmovanimais")
    private List<Esanparto> esanpartoList;
    @OneToMany(mappedBy = "cdmovanimais")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdmovanimais")
    private List<Esanreprodutor> esanreprodutorList;
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDNOTA", referencedColumnName = "CDNOTA")
    @ManyToOne
    private Eannota cdnota;
    @JoinColumn(name = "CDCAUSA", referencedColumnName = "CDCAUSA")
    @ManyToOne
    private Esancausa cdcausa;
    @JoinColumn(name = "CDGRANJA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdgranja;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFASE", referencedColumnName = "CDFASE")
    @ManyToOne
    private Esanfase cdfase;
    @JoinColumn(name = "CDFUNCIONARIO", referencedColumnName = "CDFUNCIONARIO")
    @ManyToOne
    private Esanfuncionario cdfuncionario;
    @JoinColumn(name = "CDLOTE", referencedColumnName = "CDLOTE")
    @ManyToOne
    private Esanlote cdlote;
    @JoinColumn(name = "CDSALALOTE", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsalalote;
    @JoinColumn(name = "CDSALALOTE2", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsalalote2;

    public Esanmovanimais() {
    }

    public Esanmovanimais(Integer cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Integer getCdmovanimais() {
        return cdmovanimais;
    }

    public void setCdmovanimais(Integer cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Integer getCdmovanimais2() {
        return cdmovanimais2;
    }

    public void setCdmovanimais2(Integer cdmovanimais2) {
        this.cdmovanimais2 = cdmovanimais2;
    }

    public String getFltipo() {
        return fltipo;
    }

    public void setFltipo(String fltipo) {
        this.fltipo = fltipo;
    }

    public String getFltipovenda() {
        return fltipovenda;
    }

    public void setFltipovenda(String fltipovenda) {
        this.fltipovenda = fltipovenda;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtmovimentacao() {
        return dtmovimentacao;
    }

    public void setDtmovimentacao(Date dtmovimentacao) {
        this.dtmovimentacao = dtmovimentacao;
    }

    public Integer getQtanimais() {
        return qtanimais;
    }

    public void setQtanimais(Integer qtanimais) {
        this.qtanimais = qtanimais;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Integer getCdrelacionado() {
        return cdrelacionado;
    }

    public void setCdrelacionado(Integer cdrelacionado) {
        this.cdrelacionado = cdrelacionado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public Integer getCdlote2() {
        return cdlote2;
    }

    public void setCdlote2(Integer cdlote2) {
        this.cdlote2 = cdlote2;
    }

    public Integer getCdcargaanimal() {
        return cdcargaanimal;
    }

    public void setCdcargaanimal(Integer cdcargaanimal) {
        this.cdcargaanimal = cdcargaanimal;
    }

    public Integer getQtanimaisposabate() {
        return qtanimaisposabate;
    }

    public void setQtanimaisposabate(Integer qtanimaisposabate) {
        this.qtanimaisposabate = qtanimaisposabate;
    }

    public String getFlacertomaternidadeagriness() {
        return flacertomaternidadeagriness;
    }

    public void setFlacertomaternidadeagriness(String flacertomaternidadeagriness) {
        this.flacertomaternidadeagriness = flacertomaternidadeagriness;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public Eanentidade getCdentidade() {
        return cdentidade;
    }

    public void setCdentidade(Eanentidade cdentidade) {
        this.cdentidade = cdentidade;
    }

    public Eannota getCdnota() {
        return cdnota;
    }

    public void setCdnota(Eannota cdnota) {
        this.cdnota = cdnota;
    }

    public Esancausa getCdcausa() {
        return cdcausa;
    }

    public void setCdcausa(Esancausa cdcausa) {
        this.cdcausa = cdcausa;
    }

    public Esanempresa getCdgranja() {
        return cdgranja;
    }

    public void setCdgranja(Esanempresa cdgranja) {
        this.cdgranja = cdgranja;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanfase getCdfase() {
        return cdfase;
    }

    public void setCdfase(Esanfase cdfase) {
        this.cdfase = cdfase;
    }

    public Esanfuncionario getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Esanfuncionario cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public Esanlote getCdlote() {
        return cdlote;
    }

    public void setCdlote(Esanlote cdlote) {
        this.cdlote = cdlote;
    }

    public Esansala getCdsalalote() {
        return cdsalalote;
    }

    public void setCdsalalote(Esansala cdsalalote) {
        this.cdsalalote = cdsalalote;
    }

    public Esansala getCdsalalote2() {
        return cdsalalote2;
    }

    public void setCdsalalote2(Esansala cdsalalote2) {
        this.cdsalalote2 = cdsalalote2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdmovanimais != null ? cdmovanimais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanmovanimais)) {
            return false;
        }
        Esanmovanimais other = (Esanmovanimais) object;
        if ((this.cdmovanimais == null && other.cdmovanimais != null) || (this.cdmovanimais != null && !this.cdmovanimais.equals(other.cdmovanimais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanmovanimais[ cdmovanimais=" + cdmovanimais + " ]";
    }

}
