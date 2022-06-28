
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
@Table(name = "EANUF", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eanuf.findAll", query = "SELECT e FROM Eanuf e")})
public class Eanuf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDUF")
    private Integer cduf;
    @Column(name = "NMUF")
    private String nmuf;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @JoinColumn(name = "CDPAIS", referencedColumnName = "CDPAIS")
    @ManyToOne
    private Eanpais cdpais;
    @OneToMany(mappedBy = "cduf")
    private List<Eanmunicipio> eanmunicipioList;

    public Eanuf() {
    }

    public Eanuf(Integer cduf) {
        this.cduf = cduf;
    }

    public Integer getCduf() {
        return cduf;
    }

    public void setCduf(Integer cduf) {
        this.cduf = cduf;
    }

    public String getNmuf() {
        return nmuf;
    }

    public void setNmuf(String nmuf) {
        this.nmuf = nmuf;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFlintegradora() {
        return flintegradora;
    }

    public void setFlintegradora(String flintegradora) {
        this.flintegradora = flintegradora;
    }

    public Eanpais getCdpais() {
        return cdpais;
    }

    public void setCdpais(Eanpais cdpais) {
        this.cdpais = cdpais;
    }

    public List<Eanmunicipio> getEanmunicipioList() {
        return eanmunicipioList;
    }

    public void setEanmunicipioList(List<Eanmunicipio> eanmunicipioList) {
        this.eanmunicipioList = eanmunicipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cduf != null ? cduf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eanuf)) {
            return false;
        }
        Eanuf other = (Eanuf) object;
        if ((this.cduf == null && other.cduf != null) || (this.cduf != null && !this.cduf.equals(other.cduf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Eanuf[ cduf=" + cduf + " ]";
    }

}
