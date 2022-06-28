
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
@Table(name = "ESANCOBERTURA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esancobertura.findAll", query = "SELECT e FROM Esancobertura e")})
public class Esancobertura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDCOBERTURA")
    private Integer cdcobertura;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTCOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcobertura;
    @Column(name = "HORACOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horacobertura;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "FLMAEDELEITE")
    private String flmaedeleite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOMATRIZ")
    private Double pesomatriz;
    @Column(name = "ESPESSURATOUCINHOMATRIZ")
    private Double espessuratoucinhomatriz;
    @Column(name = "IDCOBERTURA")
    private Integer idcobertura;
    @Column(name = "FLINSEMINACAO")
    private String flinseminacao;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "FLCOBERTANALACTACAO")
    private String flcobertanalactacao;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "SCORECORPORAL")
    private Integer scorecorporal;
    @Column(name = "FLCOMPRAGESTANTE")
    private String flcompragestante;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdcobertura")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdcobertura")
    private List<Esanparto> esanpartoList;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFUNCIONARIO", referencedColumnName = "CDFUNCIONARIO")
    @ManyToOne
    private Esanfuncionario cdfuncionario;
    @JoinColumn(name = "CDGRUPOCOBERTURA", referencedColumnName = "CDGRUPOCOBERTURA")
    @ManyToOne
    private Esangrupocobertura cdgrupocobertura;
    @JoinColumn(name = "CDMATRIZ", referencedColumnName = "CDMATRIZ")
    @ManyToOne
    private Esanmatriz cdmatriz;
    @JoinColumn(name = "CDREPRODUTOR", referencedColumnName = "CDREPRODUTOR")
    @ManyToOne
    private Esanreprodutor cdreprodutor;
    @JoinColumn(name = "CDSALA", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsala;

    public Esancobertura() {
    }

    public Esancobertura(Integer cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Integer getCdcobertura() {
        return cdcobertura;
    }

    public void setCdcobertura(Integer cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtcobertura() {
        return dtcobertura;
    }

    public void setDtcobertura(Date dtcobertura) {
        this.dtcobertura = dtcobertura;
    }

    public Date getHoracobertura() {
        return horacobertura;
    }

    public void setHoracobertura(Date horacobertura) {
        this.horacobertura = horacobertura;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getFlmaedeleite() {
        return flmaedeleite;
    }

    public void setFlmaedeleite(String flmaedeleite) {
        this.flmaedeleite = flmaedeleite;
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

    public Integer getIdcobertura() {
        return idcobertura;
    }

    public void setIdcobertura(Integer idcobertura) {
        this.idcobertura = idcobertura;
    }

    public String getFlinseminacao() {
        return flinseminacao;
    }

    public void setFlinseminacao(String flinseminacao) {
        this.flinseminacao = flinseminacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public String getFlcobertanalactacao() {
        return flcobertanalactacao;
    }

    public void setFlcobertanalactacao(String flcobertanalactacao) {
        this.flcobertanalactacao = flcobertanalactacao;
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

    public String getFlcompragestante() {
        return flcompragestante;
    }

    public void setFlcompragestante(String flcompragestante) {
        this.flcompragestante = flcompragestante;
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

    public Esangrupocobertura getCdgrupocobertura() {
        return cdgrupocobertura;
    }

    public void setCdgrupocobertura(Esangrupocobertura cdgrupocobertura) {
        this.cdgrupocobertura = cdgrupocobertura;
    }

    public Esanmatriz getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Esanmatriz cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public Esanreprodutor getCdreprodutor() {
        return cdreprodutor;
    }

    public void setCdreprodutor(Esanreprodutor cdreprodutor) {
        this.cdreprodutor = cdreprodutor;
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
        hash += (cdcobertura != null ? cdcobertura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esancobertura)) {
            return false;
        }
        Esancobertura other = (Esancobertura) object;
        if ((this.cdcobertura == null && other.cdcobertura != null) || (this.cdcobertura != null && !this.cdcobertura.equals(other.cdcobertura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esancobertura[ cdcobertura=" + cdcobertura + " ]";
    }

}
