
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
@Table(name = "EANPAIS", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eanpais.findAll", query = "SELECT e FROM Eanpais e")})
public class Eanpais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDPAIS")
    private Integer cdpais;
    @Column(name = "NMPAIS")
    private String nmpais;
    @Column(name = "DDI")
    private String ddi;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @OneToMany(mappedBy = "cdpais")
    private List<Eanuf> eanufList;

    public Eanpais() {
    }

    public Eanpais(Integer cdpais) {
        this.cdpais = cdpais;
    }

    public Integer getCdpais() {
        return cdpais;
    }

    public void setCdpais(Integer cdpais) {
        this.cdpais = cdpais;
    }

    public String getNmpais() {
        return nmpais;
    }

    public void setNmpais(String nmpais) {
        this.nmpais = nmpais;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getFlintegradora() {
        return flintegradora;
    }

    public void setFlintegradora(String flintegradora) {
        this.flintegradora = flintegradora;
    }

    public List<Eanuf> getEanufList() {
        return eanufList;
    }

    public void setEanufList(List<Eanuf> eanufList) {
        this.eanufList = eanufList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdpais != null ? cdpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eanpais)) {
            return false;
        }
        Eanpais other = (Eanpais) object;
        if ((this.cdpais == null && other.cdpais != null) || (this.cdpais != null && !this.cdpais.equals(other.cdpais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Eanpais[ cdpais=" + cdpais + " ]";
    }

}
