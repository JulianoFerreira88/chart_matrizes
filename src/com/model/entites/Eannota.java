
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
@Table(name = "EANNOTA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eannota.findAll", query = "SELECT e FROM Eannota e")})
public class Eannota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDNOTA")
    private Integer cdnota;
    @Column(name = "NUNOTA")
    private String nunota;
    @Column(name = "DTNOTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLTOTALNOTA")
    private Double vltotalnota;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "FLTIPONOTA")
    private String fltiponota;
    @Column(name = "FLTIPOPAGAMENTO")
    private String fltipopagamento;
    @Column(name = "VLTOTALATUAL")
    private Double vltotalatual;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "FILIAL")
    private String filial;
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @OneToMany(mappedBy = "cdnota")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdnota")
    private List<Esanreprodutor> esanreprodutorList;
    @OneToMany(mappedBy = "cdnota")
    private List<Esanmovanimais> esanmovanimaisList;

    public Eannota() {
    }

    public Eannota(Integer cdnota) {
        this.cdnota = cdnota;
    }

    public Integer getCdnota() {
        return cdnota;
    }

    public void setCdnota(Integer cdnota) {
        this.cdnota = cdnota;
    }

    public String getNunota() {
        return nunota;
    }

    public void setNunota(String nunota) {
        this.nunota = nunota;
    }

    public Date getDtnota() {
        return dtnota;
    }

    public void setDtnota(Date dtnota) {
        this.dtnota = dtnota;
    }

    public Double getVltotalnota() {
        return vltotalnota;
    }

    public void setVltotalnota(Double vltotalnota) {
        this.vltotalnota = vltotalnota;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public String getFltiponota() {
        return fltiponota;
    }

    public void setFltiponota(String fltiponota) {
        this.fltiponota = fltiponota;
    }

    public String getFltipopagamento() {
        return fltipopagamento;
    }

    public void setFltipopagamento(String fltipopagamento) {
        this.fltipopagamento = fltipopagamento;
    }

    public Double getVltotalatual() {
        return vltotalatual;
    }

    public void setVltotalatual(Double vltotalatual) {
        this.vltotalatual = vltotalatual;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
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

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdnota != null ? cdnota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eannota)) {
            return false;
        }
        Eannota other = (Eannota) object;
        if ((this.cdnota == null && other.cdnota != null) || (this.cdnota != null && !this.cdnota.equals(other.cdnota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Eannota[ cdnota=" + cdnota + " ]";
    }

}
