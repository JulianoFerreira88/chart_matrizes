
package com.model.entites;

import java.io.Serializable;
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


@Entity
@Table(name = "EANMUNICIPIO", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eanmunicipio.findAll", query = "SELECT e FROM Eanmunicipio e")})
public class Eanmunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMUNICIPIO")
    private Integer cdmunicipio;
    @Column(name = "NMMUNICIPIO")
    private String nmmunicipio;
    @Column(name = "CEPPADRAO")
    private String ceppadrao;
    @Column(name = "DDD")
    private String ddd;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @JoinColumn(name = "CDUF", referencedColumnName = "CDUF")
    @ManyToOne
    private Eanuf cduf;
    @OneToMany(mappedBy = "cdmunicipio")
    private List<Eanentidade> eanentidadeList;

    public Eanmunicipio() {
    }

    public Eanmunicipio(Integer cdmunicipio) {
        this.cdmunicipio = cdmunicipio;
    }

    public Integer getCdmunicipio() {
        return cdmunicipio;
    }

    public void setCdmunicipio(Integer cdmunicipio) {
        this.cdmunicipio = cdmunicipio;
    }

    public String getNmmunicipio() {
        return nmmunicipio;
    }

    public void setNmmunicipio(String nmmunicipio) {
        this.nmmunicipio = nmmunicipio;
    }

    public String getCeppadrao() {
        return ceppadrao;
    }

    public void setCeppadrao(String ceppadrao) {
        this.ceppadrao = ceppadrao;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getFlintegradora() {
        return flintegradora;
    }

    public void setFlintegradora(String flintegradora) {
        this.flintegradora = flintegradora;
    }

    public Eanuf getCduf() {
        return cduf;
    }

    public void setCduf(Eanuf cduf) {
        this.cduf = cduf;
    }

    public List<Eanentidade> getEanentidadeList() {
        return eanentidadeList;
    }

    public void setEanentidadeList(List<Eanentidade> eanentidadeList) {
        this.eanentidadeList = eanentidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdmunicipio != null ? cdmunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eanmunicipio)) {
            return false;
        }
        Eanmunicipio other = (Eanmunicipio) object;
        if ((this.cdmunicipio == null && other.cdmunicipio != null) || (this.cdmunicipio != null && !this.cdmunicipio.equals(other.cdmunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Eanmunicipio[ cdmunicipio=" + cdmunicipio + " ]";
    }

}
