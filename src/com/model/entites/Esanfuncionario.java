
package com.model.entites;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ESANFUNCIONARIO", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanfuncionario.findAll", query = "SELECT e FROM Esanfuncionario e")})
public class Esanfuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDFUNCIONARIO")
    private Integer cdfuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmfuncionario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLSALARIO")
    private Double vlsalario;
    @Column(name = "PEENCARGO")
    private Double peencargo;
    @Column(name = "FLATIVO")
    private String flativo;
    @Column(name = "HRTRABALHODIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hrtrabalhodia;
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @OneToMany(mappedBy = "cdfuncionario")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdfuncionario")
    private List<Esanparto> esanpartoList;
    @OneToMany(mappedBy = "cdfuncionario")
    private List<Esanmovanimais> esanmovanimaisList;
    @OneToMany(mappedBy = "cdfuncionario")
    private List<Esancobertura> esancoberturaList;

    public Esanfuncionario() {
    }

    public Esanfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public Integer getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public String getNmfuncionario() {
        return nmfuncionario;
    }

    public void setNmfuncionario(String nmfuncionario) {
        this.nmfuncionario = nmfuncionario;
    }

    public Double getVlsalario() {
        return vlsalario;
    }

    public void setVlsalario(Double vlsalario) {
        this.vlsalario = vlsalario;
    }

    public Double getPeencargo() {
        return peencargo;
    }

    public void setPeencargo(Double peencargo) {
        this.peencargo = peencargo;
    }

    public String getFlativo() {
        return flativo;
    }

    public void setFlativo(String flativo) {
        this.flativo = flativo;
    }

    public Date getHrtrabalhodia() {
        return hrtrabalhodia;
    }

    public void setHrtrabalhodia(Date hrtrabalhodia) {
        this.hrtrabalhodia = hrtrabalhodia;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
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

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
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
        hash += (cdfuncionario != null ? cdfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanfuncionario)) {
            return false;
        }
        Esanfuncionario other = (Esanfuncionario) object;
        if ((this.cdfuncionario == null && other.cdfuncionario != null) || (this.cdfuncionario != null && !this.cdfuncionario.equals(other.cdfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanfuncionario[ cdfuncionario=" + cdfuncionario + " ]";
    }

}
