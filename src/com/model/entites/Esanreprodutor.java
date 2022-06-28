
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
@Table(name = "ESANREPRODUTOR", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanreprodutor.findAll", query = "SELECT e FROM Esanreprodutor e")})
public class Esanreprodutor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDREPRODUTOR")
    private Integer cdreprodutor;
    @Column(name = "ID1")
    private String id1;
    @Column(name = "ID2")
    private String id2;
    @Column(name = "DTNASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    @Column(name = "DTENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtentrada;
    @Column(name = "DTSAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtsaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOENTRADA")
    private Double pesoentrada;
    @Column(name = "PESOSAIDA")
    private Double pesosaida;
    @Column(name = "VLCOMPRA")
    private Double vlcompra;
    @Column(name = "VLVENDA")
    private Double vlvenda;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLUTILIZADOEMINSEMINACAO")
    private String flutilizadoeminseminacao;
    @Column(name = "FLEHSEMEN")
    private String flehsemen;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "FLUTILIZADOEMMONTANATURAL")
    private String flutilizadoemmontanatural;
    @Column(name = "FLRUFIAO")
    private String flrufiao;
    @Column(name = "FLPREDESCARTE")
    private String flpredescarte;
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDNOTA", referencedColumnName = "CDNOTA")
    @ManyToOne
    private Eannota cdnota;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDMOVANIMAIS", referencedColumnName = "CDMOVANIMAIS")
    @ManyToOne
    private Esanmovanimais cdmovanimais;
    @JoinColumn(name = "CDRACA", referencedColumnName = "CDRACA")
    @ManyToOne
    private Esanraca cdraca;
    @OneToMany(mappedBy = "cdreprodutor")
    private List<Esancobertura> esancoberturaList;

    public Esanreprodutor() {
    }

    public Esanreprodutor(Integer cdreprodutor) {
        this.cdreprodutor = cdreprodutor;
    }

    public Integer getCdreprodutor() {
        return cdreprodutor;
    }

    public void setCdreprodutor(Integer cdreprodutor) {
        this.cdreprodutor = cdreprodutor;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Double getPesoentrada() {
        return pesoentrada;
    }

    public void setPesoentrada(Double pesoentrada) {
        this.pesoentrada = pesoentrada;
    }

    public Double getPesosaida() {
        return pesosaida;
    }

    public void setPesosaida(Double pesosaida) {
        this.pesosaida = pesosaida;
    }

    public Double getVlcompra() {
        return vlcompra;
    }

    public void setVlcompra(Double vlcompra) {
        this.vlcompra = vlcompra;
    }

    public Double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(Double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public String getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(String flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getFlutilizadoeminseminacao() {
        return flutilizadoeminseminacao;
    }

    public void setFlutilizadoeminseminacao(String flutilizadoeminseminacao) {
        this.flutilizadoeminseminacao = flutilizadoeminseminacao;
    }

    public String getFlehsemen() {
        return flehsemen;
    }

    public void setFlehsemen(String flehsemen) {
        this.flehsemen = flehsemen;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public String getFlutilizadoemmontanatural() {
        return flutilizadoemmontanatural;
    }

    public void setFlutilizadoemmontanatural(String flutilizadoemmontanatural) {
        this.flutilizadoemmontanatural = flutilizadoemmontanatural;
    }

    public String getFlrufiao() {
        return flrufiao;
    }

    public void setFlrufiao(String flrufiao) {
        this.flrufiao = flrufiao;
    }

    public String getFlpredescarte() {
        return flpredescarte;
    }

    public void setFlpredescarte(String flpredescarte) {
        this.flpredescarte = flpredescarte;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanmovanimais getCdmovanimais() {
        return cdmovanimais;
    }

    public void setCdmovanimais(Esanmovanimais cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Esanraca getCdraca() {
        return cdraca;
    }

    public void setCdraca(Esanraca cdraca) {
        this.cdraca = cdraca;
    }

    public List<Esancobertura> getEsancoberturaList() {
        return esancoberturaList;
    }

    public void setEsancoberturaList(List<Esancobertura> esancoberturaList) {
        this.esancoberturaList = esancoberturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdreprodutor != null ? cdreprodutor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanreprodutor)) {
            return false;
        }
        Esanreprodutor other = (Esanreprodutor) object;
        if ((this.cdreprodutor == null && other.cdreprodutor != null) || (this.cdreprodutor != null && !this.cdreprodutor.equals(other.cdreprodutor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanreprodutor[ cdreprodutor=" + cdreprodutor + " ]";
    }

}
