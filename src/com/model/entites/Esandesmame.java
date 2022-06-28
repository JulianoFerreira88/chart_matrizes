
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
@Table(name = "ESANDESMAME", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esandesmame.findAll", query = "SELECT e FROM Esandesmame e")})
public class Esandesmame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDDESMAME")
    private Integer cddesmame;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTDESMAME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtdesmame;
    @Column(name = "NUDESMAMADO")
    private Integer nudesmamado;
    @Column(name = "NURECEBIDO")
    private Integer nurecebido;
    @Column(name = "NUDOADO")
    private Integer nudoado;
    @Column(name = "NUMORTO")
    private Integer numorto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOLEITEGADA")
    private Double pesoleitegada;
    @Column(name = "PESOMATRIZ")
    private Double pesomatriz;
    @Column(name = "ESPESSURATOUCINHOMATRIZ")
    private Double espessuratoucinhomatriz;
    @Column(name = "FLDESMAMEPARCIAL")
    private String fldesmameparcial;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "FLGERADOAUTOMATICAMENTE")
    private String flgeradoautomaticamente;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "SCORECORPORAL")
    private Integer scorecorporal;
    @Column(name = "NUDESCLASSIFICADO")
    private Integer nudesclassificado;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cddesmame")
    private List<Esanmovmaternidade> esanmovmaternidadeList;
    @JoinColumn(name = "CDCOBERTURA", referencedColumnName = "CDCOBERTURA")
    @ManyToOne
    private Esancobertura cdcobertura;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFUNCIONARIO", referencedColumnName = "CDFUNCIONARIO")
    @ManyToOne
    private Esanfuncionario cdfuncionario;
    @JoinColumn(name = "CDLOTE", referencedColumnName = "CDLOTE")
    @ManyToOne
    private Esanlote cdlote;
    @JoinColumn(name = "CDMATRIZ", referencedColumnName = "CDMATRIZ")
    @ManyToOne
    private Esanmatriz cdmatriz;
    @JoinColumn(name = "CDMOVANIMAIS", referencedColumnName = "CDMOVANIMAIS")
    @ManyToOne
    private Esanmovanimais cdmovanimais;
    @JoinColumn(name = "CDSALA", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsala;

    public Esandesmame() {
    }

    public Esandesmame(Integer cddesmame) {
        this.cddesmame = cddesmame;
    }

    public Integer getCddesmame() {
        return cddesmame;
    }

    public void setCddesmame(Integer cddesmame) {
        this.cddesmame = cddesmame;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtdesmame() {
        return dtdesmame;
    }

    public void setDtdesmame(Date dtdesmame) {
        this.dtdesmame = dtdesmame;
    }

    public Integer getNudesmamado() {
        return nudesmamado;
    }

    public void setNudesmamado(Integer nudesmamado) {
        this.nudesmamado = nudesmamado;
    }

    public Integer getNurecebido() {
        return nurecebido;
    }

    public void setNurecebido(Integer nurecebido) {
        this.nurecebido = nurecebido;
    }

    public Integer getNudoado() {
        return nudoado;
    }

    public void setNudoado(Integer nudoado) {
        this.nudoado = nudoado;
    }

    public Integer getNumorto() {
        return numorto;
    }

    public void setNumorto(Integer numorto) {
        this.numorto = numorto;
    }

    public Double getPesoleitegada() {
        return pesoleitegada;
    }

    public void setPesoleitegada(Double pesoleitegada) {
        this.pesoleitegada = pesoleitegada;
    }

    public Double getPesomatriz() {
        return pesomatriz;
    }

    public void setPesomatriz(Double pesomatriz) {
        this.pesomatriz = pesomatriz;
    }

    public Double getEspessuratoucinhomatriz() {
        return espessuratoucinhomatriz;
    }

    public void setEspessuratoucinhomatriz(Double espessuratoucinhomatriz) {
        this.espessuratoucinhomatriz = espessuratoucinhomatriz;
    }

    public String getFldesmameparcial() {
        return fldesmameparcial;
    }

    public void setFldesmameparcial(String fldesmameparcial) {
        this.fldesmameparcial = fldesmameparcial;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getFlgeradoautomaticamente() {
        return flgeradoautomaticamente;
    }

    public void setFlgeradoautomaticamente(String flgeradoautomaticamente) {
        this.flgeradoautomaticamente = flgeradoautomaticamente;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public Integer getScorecorporal() {
        return scorecorporal;
    }

    public void setScorecorporal(Integer scorecorporal) {
        this.scorecorporal = scorecorporal;
    }

    public Integer getNudesclassificado() {
        return nudesclassificado;
    }

    public void setNudesclassificado(Integer nudesclassificado) {
        this.nudesclassificado = nudesclassificado;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<Esanmovmaternidade> getEsanmovmaternidadeList() {
        return esanmovmaternidadeList;
    }

    public void setEsanmovmaternidadeList(List<Esanmovmaternidade> esanmovmaternidadeList) {
        this.esanmovmaternidadeList = esanmovmaternidadeList;
    }

    public Esancobertura getCdcobertura() {
        return cdcobertura;
    }

    public void setCdcobertura(Esancobertura cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
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

    public Esanmatriz getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Esanmatriz cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public Esanmovanimais getCdmovanimais() {
        return cdmovanimais;
    }

    public void setCdmovanimais(Esanmovanimais cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Esansala getCdsala() {
        return cdsala;
    }

    public void setCdsala(Esansala cdsala) {
        this.cdsala = cdsala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cddesmame != null ? cddesmame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esandesmame)) {
            return false;
        }
        Esandesmame other = (Esandesmame) object;
        if ((this.cddesmame == null && other.cddesmame != null) || (this.cddesmame != null && !this.cddesmame.equals(other.cddesmame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esandesmame[ cddesmame=" + cddesmame + " ]";
    }

}
