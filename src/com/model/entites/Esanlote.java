
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
@Table(name = "ESANLOTE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanlote.findAll", query = "SELECT e FROM Esanlote e")})
public class Esanlote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDLOTE")
    private Integer cdlote;
    @Column(name = "NMLOTE")
    private String nmlote;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLSITUACAO2")
    private String flsituacao2;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DTMEDIANASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Column(name = "DTMEDIANASCIMENTO2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento2;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdlote")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdlote")
    private List<Esanmovanimais> esanmovanimaisList;
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;

    public Esanlote() {
    }

    public Esanlote(Integer cdlote) {
        this.cdlote = cdlote;
    }

    public Integer getCdlote() {
        return cdlote;
    }

    public void setCdlote(Integer cdlote) {
        this.cdlote = cdlote;
    }

    public String getNmlote() {
        return nmlote;
    }

    public void setNmlote(String nmlote) {
        this.nmlote = nmlote;
    }

    public String getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(String flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getFlsituacao2() {
        return flsituacao2;
    }

    public void setFlsituacao2(String flsituacao2) {
        this.flsituacao2 = flsituacao2;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtmedianascimento() {
        return dtmedianascimento;
    }

    public void setDtmedianascimento(Date dtmedianascimento) {
        this.dtmedianascimento = dtmedianascimento;
    }

    public Date getDtmedianascimento2() {
        return dtmedianascimento2;
    }

    public void setDtmedianascimento2(Date dtmedianascimento2) {
        this.dtmedianascimento2 = dtmedianascimento2;
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

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdlote != null ? cdlote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanlote)) {
            return false;
        }
        Esanlote other = (Esanlote) object;
        if ((this.cdlote == null && other.cdlote != null) || (this.cdlote != null && !this.cdlote.equals(other.cdlote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanlote[ cdlote=" + cdlote + " ]";
    }

}
