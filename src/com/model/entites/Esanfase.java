
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
@Table(name = "ESANFASE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanfase.findAll", query = "SELECT e FROM Esanfase e")})
public class Esanfase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDFASE")
    private Integer cdfase;
    @Column(name = "NMFASE")
    private String nmfase;
    @OneToMany(mappedBy = "cdfase")
    private List<Esansala> esansalaList;
    @OneToMany(mappedBy = "cdfase")
    private List<Esanmovanimais> esanmovanimaisList;

    public Esanfase() {
    }

    public Esanfase(Integer cdfase) {
        this.cdfase = cdfase;
    }

    public Integer getCdfase() {
        return cdfase;
    }

    public void setCdfase(Integer cdfase) {
        this.cdfase = cdfase;
    }

    public String getNmfase() {
        return nmfase;
    }

    public void setNmfase(String nmfase) {
        this.nmfase = nmfase;
    }

    public List<Esansala> getEsansalaList() {
        return esansalaList;
    }

    public void setEsansalaList(List<Esansala> esansalaList) {
        this.esansalaList = esansalaList;
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
        hash += (cdfase != null ? cdfase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanfase)) {
            return false;
        }
        Esanfase other = (Esanfase) object;
        if ((this.cdfase == null && other.cdfase != null) || (this.cdfase != null && !this.cdfase.equals(other.cdfase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanfase[ cdfase=" + cdfase + " ]";
    }

}
