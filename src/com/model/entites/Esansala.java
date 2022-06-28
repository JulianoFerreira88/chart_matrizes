
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
@Table(name = "ESANSALA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esansala.findAll", query = "SELECT e FROM Esansala e")})
public class Esansala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDSALA")
    private Integer cdsala;
    @Column(name = "NUSALA")
    private Integer nusala;
    @Column(name = "NMSALA")
    private String nmsala;
    @Column(name = "NUBAIAS")
    private Integer nubaias;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdsala")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdsala")
    private List<Esanparto> esanpartoList;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFASE", referencedColumnName = "CDFASE")
    @ManyToOne
    private Esanfase cdfase;
    @OneToMany(mappedBy = "cdsala")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdsalalote")
    private List<Esanmovanimais> esanmovanimaisList;
    @OneToMany(mappedBy = "cdsalalote2")
    private List<Esanmovanimais> esanmovanimaisList1;
    @OneToMany(mappedBy = "cdsala")
    private List<Esancobertura> esancoberturaList;

    public Esansala() {
    }

    public Esansala(Integer cdsala) {
        this.cdsala = cdsala;
    }

    public Integer getCdsala() {
        return cdsala;
    }

    public void setCdsala(Integer cdsala) {
        this.cdsala = cdsala;
    }

    public Integer getNusala() {
        return nusala;
    }

    public void setNusala(Integer nusala) {
        this.nusala = nusala;
    }

    public String getNmsala() {
        return nmsala;
    }

    public void setNmsala(String nmsala) {
        this.nmsala = nmsala;
    }

    public Integer getNubaias() {
        return nubaias;
    }

    public void setNubaias(Integer nubaias) {
        this.nubaias = nubaias;
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

    public List<Esanparto> getEsanpartoList() {
        return esanpartoList;
    }

    public void setEsanpartoList(List<Esanparto> esanpartoList) {
        this.esanpartoList = esanpartoList;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanfase getCdfase() {
        return cdfase;
    }

    public void setCdfase(Esanfase cdfase) {
        this.cdfase = cdfase;
    }

    public List<Esanmatriz> getEsanmatrizList() {
        return esanmatrizList;
    }

    public void setEsanmatrizList(List<Esanmatriz> esanmatrizList) {
        this.esanmatrizList = esanmatrizList;
    }

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
    }

    public List<Esanmovanimais> getEsanmovanimaisList1() {
        return esanmovanimaisList1;
    }

    public void setEsanmovanimaisList1(List<Esanmovanimais> esanmovanimaisList1) {
        this.esanmovanimaisList1 = esanmovanimaisList1;
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
        hash += (cdsala != null ? cdsala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esansala)) {
            return false;
        }
        Esansala other = (Esansala) object;
        if ((this.cdsala == null && other.cdsala != null) || (this.cdsala != null && !this.cdsala.equals(other.cdsala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esansala[ cdsala=" + cdsala + " ]";
    }

}
