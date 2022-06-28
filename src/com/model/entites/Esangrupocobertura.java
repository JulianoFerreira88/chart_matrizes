
package com.model.entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ESANGRUPOCOBERTURA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esangrupocobertura.findAll", query = "SELECT e FROM Esangrupocobertura e")})
public class Esangrupocobertura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDGRUPOCOBERTURA")
    private Integer cdgrupocobertura;
    @Column(name = "NMGRUPOCOBERTURA")
    private String nmgrupocobertura;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @Column(name = "CDGRUPOCOBERTURAANTERIOR")
    private Integer cdgrupocoberturaanterior;
    @OneToMany(mappedBy = "cdgrupocobertura")
    private List<Esancobertura> esancoberturaList;

    public Esangrupocobertura() {
    }

    public Esangrupocobertura(Integer cdgrupocobertura) {
        this.cdgrupocobertura = cdgrupocobertura;
    }

    public Integer getCdgrupocobertura() {
        return cdgrupocobertura;
    }

    public void setCdgrupocobertura(Integer cdgrupocobertura) {
        this.cdgrupocobertura = cdgrupocobertura;
    }

    public String getNmgrupocobertura() {
        return nmgrupocobertura;
    }

    public void setNmgrupocobertura(String nmgrupocobertura) {
        this.nmgrupocobertura = nmgrupocobertura;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Integer cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Integer getCdgrupocoberturaanterior() {
        return cdgrupocoberturaanterior;
    }

    public void setCdgrupocoberturaanterior(Integer cdgrupocoberturaanterior) {
        this.cdgrupocoberturaanterior = cdgrupocoberturaanterior;
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
        hash += (cdgrupocobertura != null ? cdgrupocobertura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esangrupocobertura)) {
            return false;
        }
        Esangrupocobertura other = (Esangrupocobertura) object;
        if ((this.cdgrupocobertura == null && other.cdgrupocobertura != null) || (this.cdgrupocobertura != null && !this.cdgrupocobertura.equals(other.cdgrupocobertura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esangrupocobertura[ cdgrupocobertura=" + cdgrupocobertura + " ]";
    }

}
