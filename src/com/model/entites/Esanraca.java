
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
@Table(name = "ESANRACA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanraca.findAll", query = "SELECT e FROM Esanraca e")})
public class Esanraca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDRACA")
    private Integer cdraca;
    @Column(name = "NMRACA")
    private String nmraca;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdraca")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdraca")
    private List<Esanreprodutor> esanreprodutorList;
    @JoinColumn(name = "CDBDPORCRACA", referencedColumnName = "CDBDPORCRACA")
    @ManyToOne
    private Ecusbdporcraca cdbdporcraca;

    public Esanraca() {
    }

    public Esanraca(Integer cdraca) {
        this.cdraca = cdraca;
    }

    public Integer getCdraca() {
        return cdraca;
    }

    public void setCdraca(Integer cdraca) {
        this.cdraca = cdraca;
    }

    public String getNmraca() {
        return nmraca;
    }

    public void setNmraca(String nmraca) {
        this.nmraca = nmraca;
    }

    public String getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(String flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getFlintegradora() {
        return flintegradora;
    }

    public void setFlintegradora(String flintegradora) {
        this.flintegradora = flintegradora;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<Esanmatriz> getEsanmatrizList() {
        return esanmatrizList;
    }

    public void setEsanmatrizList(List<Esanmatriz> esanmatrizList) {
        this.esanmatrizList = esanmatrizList;
    }

    public List<Esanreprodutor> getEsanreprodutorList() {
        return esanreprodutorList;
    }

    public void setEsanreprodutorList(List<Esanreprodutor> esanreprodutorList) {
        this.esanreprodutorList = esanreprodutorList;
    }

    public Ecusbdporcraca getCdbdporcraca() {
        return cdbdporcraca;
    }

    public void setCdbdporcraca(Ecusbdporcraca cdbdporcraca) {
        this.cdbdporcraca = cdbdporcraca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdraca != null ? cdraca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanraca)) {
            return false;
        }
        Esanraca other = (Esanraca) object;
        if ((this.cdraca == null && other.cdraca != null) || (this.cdraca != null && !this.cdraca.equals(other.cdraca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanraca[ cdraca=" + cdraca + " ]";
    }

}
