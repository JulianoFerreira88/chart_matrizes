
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
@Table(name = "ECUSBDPORCCAUSALEITAO", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ecusbdporccausaleitao.findAll", query = "SELECT e FROM Ecusbdporccausaleitao e")})
public class Ecusbdporccausaleitao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDBDPORCCAUSALEITAO")
    private String cdbdporccausaleitao;
    @Column(name = "NMBDPORCCAUSALEITAO")
    private String nmbdporccausaleitao;
    @OneToMany(mappedBy = "cdbdporccausaleitao")
    private List<Esancausa> esancausaList;

    public Ecusbdporccausaleitao() {
    }

    public Ecusbdporccausaleitao(String cdbdporccausaleitao) {
        this.cdbdporccausaleitao = cdbdporccausaleitao;
    }

    public String getCdbdporccausaleitao() {
        return cdbdporccausaleitao;
    }

    public void setCdbdporccausaleitao(String cdbdporccausaleitao) {
        this.cdbdporccausaleitao = cdbdporccausaleitao;
    }

    public String getNmbdporccausaleitao() {
        return nmbdporccausaleitao;
    }

    public void setNmbdporccausaleitao(String nmbdporccausaleitao) {
        this.nmbdporccausaleitao = nmbdporccausaleitao;
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
        hash += (cdbdporccausaleitao != null ? cdbdporccausaleitao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ecusbdporccausaleitao)) {
            return false;
        }
        Ecusbdporccausaleitao other = (Ecusbdporccausaleitao) object;
        if ((this.cdbdporccausaleitao == null && other.cdbdporccausaleitao != null) || (this.cdbdporccausaleitao != null && !this.cdbdporccausaleitao.equals(other.cdbdporccausaleitao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Ecusbdporccausaleitao[ cdbdporccausaleitao=" + cdbdporccausaleitao + " ]";
    }

}
