
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
@Table(name = "ESANTIPOPARTO", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esantipoparto.findAll", query = "SELECT e FROM Esantipoparto e")})
public class Esantipoparto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDTIPOPARTO")
    private Integer cdtipoparto;
    @Column(name = "NMTIPOPARTO")
    private String nmtipoparto;
    @OneToMany(mappedBy = "cdtipoparto")
    private List<Esanparto> esanpartoList;

    public Esantipoparto() {
    }

    public Esantipoparto(Integer cdtipoparto) {
        this.cdtipoparto = cdtipoparto;
    }

    public Integer getCdtipoparto() {
        return cdtipoparto;
    }

    public void setCdtipoparto(Integer cdtipoparto) {
        this.cdtipoparto = cdtipoparto;
    }

    public String getNmtipoparto() {
        return nmtipoparto;
    }

    public void setNmtipoparto(String nmtipoparto) {
        this.nmtipoparto = nmtipoparto;
    }

    public List<Esanparto> getEsanpartoList() {
        return esanpartoList;
    }

    public void setEsanpartoList(List<Esanparto> esanpartoList) {
        this.esanpartoList = esanpartoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdtipoparto != null ? cdtipoparto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esantipoparto)) {
            return false;
        }
        Esantipoparto other = (Esantipoparto) object;
        if ((this.cdtipoparto == null && other.cdtipoparto != null) || (this.cdtipoparto != null && !this.cdtipoparto.equals(other.cdtipoparto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esantipoparto[ cdtipoparto=" + cdtipoparto + " ]";
    }

}
