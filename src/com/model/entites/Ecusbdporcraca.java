
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
@Table(name = "ECUSBDPORCRACA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ecusbdporcraca.findAll", query = "SELECT e FROM Ecusbdporcraca e")})
public class Ecusbdporcraca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDBDPORCRACA")
    private String cdbdporcraca;
    @Column(name = "NMBDPORCRACA")
    private String nmbdporcraca;
    @OneToMany(mappedBy = "cdbdporcraca")
    private List<Esanraca> esanracaList;

    public Ecusbdporcraca() {
    }

    public Ecusbdporcraca(String cdbdporcraca) {
        this.cdbdporcraca = cdbdporcraca;
    }

    public String getCdbdporcraca() {
        return cdbdporcraca;
    }

    public void setCdbdporcraca(String cdbdporcraca) {
        this.cdbdporcraca = cdbdporcraca;
    }

    public String getNmbdporcraca() {
        return nmbdporcraca;
    }

    public void setNmbdporcraca(String nmbdporcraca) {
        this.nmbdporcraca = nmbdporcraca;
    }

    public List<Esanraca> getEsanracaList() {
        return esanracaList;
    }

    public void setEsanracaList(List<Esanraca> esanracaList) {
        this.esanracaList = esanracaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdbdporcraca != null ? cdbdporcraca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ecusbdporcraca)) {
            return false;
        }
        Ecusbdporcraca other = (Ecusbdporcraca) object;
        if ((this.cdbdporcraca == null && other.cdbdporcraca != null) || (this.cdbdporcraca != null && !this.cdbdporcraca.equals(other.cdbdporcraca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Ecusbdporcraca[ cdbdporcraca=" + cdbdporcraca + " ]";
    }

}
