
package com.model.entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ESANMOVMATERNIDADE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanmovmaternidade.findAll", query = "SELECT e FROM Esanmovmaternidade e")})
public class Esanmovmaternidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMOVMATERNIDADE")
    private Integer cdmovmaternidade;
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
    @Column(name = "FLMAEDELEITE")
    private String flmaedeleite;
    @Column(name = "DTMEDIANASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Column(name = "PESOMEDIONASCIMENTO")
    private Double pesomedionascimento;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "CDDESMAME", referencedColumnName = "CDDESMAME")
    @ManyToOne
    private Esandesmame cddesmame;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDPARTOORIGEM", referencedColumnName = "CDPARTO")
    @ManyToOne
    private Esanparto cdpartoorigem;
    @JoinColumn(name = "CDPARTODESTINO", referencedColumnName = "CDPARTO")
    @ManyToOne
    private Esanparto cdpartodestino;

    public Esanmovmaternidade() {
    }

    public Esanmovmaternidade(Integer cdmovmaternidade) {
        this.cdmovmaternidade = cdmovmaternidade;
    }

    public Integer getCdmovmaternidade() {
        return cdmovmaternidade;
    }

    public void setCdmovmaternidade(Integer cdmovmaternidade) {
        this.cdmovmaternidade = cdmovmaternidade;
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

    public String getFlmaedeleite() {
        return flmaedeleite;
    }

    public void setFlmaedeleite(String flmaedeleite) {
        this.flmaedeleite = flmaedeleite;
    }

    public Date getDtmedianascimento() {
        return dtmedianascimento;
    }

    public void setDtmedianascimento(Date dtmedianascimento) {
        this.dtmedianascimento = dtmedianascimento;
    }

    public Double getPesomedionascimento() {
        return pesomedionascimento;
    }

    public void setPesomedionascimento(Double pesomedionascimento) {
        this.pesomedionascimento = pesomedionascimento;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Esandesmame getCddesmame() {
        return cddesmame;
    }

    public void setCddesmame(Esandesmame cddesmame) {
        this.cddesmame = cddesmame;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanparto getCdpartoorigem() {
        return cdpartoorigem;
    }

    public void setCdpartoorigem(Esanparto cdpartoorigem) {
        this.cdpartoorigem = cdpartoorigem;
    }

    public Esanparto getCdpartodestino() {
        return cdpartodestino;
    }

    public void setCdpartodestino(Esanparto cdpartodestino) {
        this.cdpartodestino = cdpartodestino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdmovmaternidade != null ? cdmovmaternidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanmovmaternidade)) {
            return false;
        }
        Esanmovmaternidade other = (Esanmovmaternidade) object;
        if ((this.cdmovmaternidade == null && other.cdmovmaternidade != null) || (this.cdmovmaternidade != null && !this.cdmovmaternidade.equals(other.cdmovmaternidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanmovmaternidade[ cdmovmaternidade=" + cdmovmaternidade + " ]";
    }

}
