
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
@Table(name = "ECUSBDPORCCAUSAREPRODUTOR", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ecusbdporccausareprodutor.findAll", query = "SELECT e FROM Ecusbdporccausareprodutor e")})
public class Ecusbdporccausareprodutor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDBDPORCCAUSAREPROD")
    private String cdbdporccausareprod;
    @Column(name = "NMBDPORCCAUSAREPROD")
    private String nmbdporccausareprod;
    @OneToMany(mappedBy = "cdbdporccausareprod")
    private List<Esancausa> esancausaList;

    public Ecusbdporccausareprodutor() {
    }

    public Ecusbdporccausareprodutor(String cdbdporccausareprod) {
        this.cdbdporccausareprod = cdbdporccausareprod;
    }

    public String getCdbdporccausareprod() {
        return cdbdporccausareprod;
    }

    public void setCdbdporccausareprod(String cdbdporccausareprod) {
        this.cdbdporccausareprod = cdbdporccausareprod;
    }

    public String getNmbdporccausareprod() {
        return nmbdporccausareprod;
    }

    public void setNmbdporccausareprod(String nmbdporccausareprod) {
        this.nmbdporccausareprod = nmbdporccausareprod;
    }

    public List<Esancausa> getEsancausaList() {
        return esancausaList;
    }

    public void setEsancausaList(List<Esancausa> esancausaList) {
        this.esancausaList = esancausaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdbdporccausareprod != null ? cdbdporccausareprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ecusbdporccausareprodutor)) {
            return false;
        }
        Ecusbdporccausareprodutor other = (Ecusbdporccausareprodutor) object;
        if ((this.cdbdporccausareprod == null && other.cdbdporccausareprod != null) || (this.cdbdporccausareprod != null && !this.cdbdporccausareprod.equals(other.cdbdporccausareprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Ecusbdporccausareprodutor[ cdbdporccausareprod=" + cdbdporccausareprod + " ]";
    }

}
