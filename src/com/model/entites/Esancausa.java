
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
@Table(name = "ESANCAUSA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esancausa.findAll", query = "SELECT e FROM Esancausa e")})
public class Esancausa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDCAUSA")
    private Integer cdcausa;
    @Column(name = "FLMATRIZ")
    private String flmatriz;
    @Column(name = "FLREPRODUTOR")
    private String flreprodutor;
    @Column(name = "FLLEITAO")
    private String flleitao;
    @Column(name = "FLTERMINADO")
    private String flterminado;
    @Column(name = "FLLEITAOLACTANTE")
    private String flleitaolactante;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @Column(name = "FLDESCARTEPROBLEMAREPRODUTIVO")
    private String fldescarteproblemareprodutivo;
    @Column(name = "NMCAUSA")
    private String nmcausa;
    @Column(name = "FLMARRA")
    private String flmarra;
    @Column(name = "FLTIPO")
    private String fltipo;
    @Column(name = "FLSITUACAO")
    private Character flsituacao;
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "CDBDPORCCAUSALEITAO", referencedColumnName = "CDBDPORCCAUSALEITAO")
    @ManyToOne
    private Ecusbdporccausaleitao cdbdporccausaleitao;
    @JoinColumn(name = "CDBDPORCCAUSAREPROD", referencedColumnName = "CDBDPORCCAUSAREPROD")
    @ManyToOne
    private Ecusbdporccausareprodutor cdbdporccausareprod;
    @OneToMany(mappedBy = "cdcausa")
    private List<Esanmovanimais> esanmovanimaisList;

    public Esancausa() {
    }

    public Esancausa(Integer cdcausa) {
        this.cdcausa = cdcausa;
    }

    public Integer getCdcausa() {
        return cdcausa;
    }

    public void setCdcausa(Integer cdcausa) {
        this.cdcausa = cdcausa;
    }

    public String getFlmatriz() {
        return flmatriz;
    }

    public void setFlmatriz(String flmatriz) {
        this.flmatriz = flmatriz;
    }

    public String getFlreprodutor() {
        return flreprodutor;
    }

    public void setFlreprodutor(String flreprodutor) {
        this.flreprodutor = flreprodutor;
    }

    public String getFlleitao() {
        return flleitao;
    }

    public void setFlleitao(String flleitao) {
        this.flleitao = flleitao;
    }

    public String getFlterminado() {
        return flterminado;
    }

    public void setFlterminado(String flterminado) {
        this.flterminado = flterminado;
    }

    public String getFlleitaolactante() {
        return flleitaolactante;
    }

    public void setFlleitaolactante(String flleitaolactante) {
        this.flleitaolactante = flleitaolactante;
    }

    public String getFlintegradora() {
        return flintegradora;
    }

    public void setFlintegradora(String flintegradora) {
        this.flintegradora = flintegradora;
    }

    public String getFldescarteproblemareprodutivo() {
        return fldescarteproblemareprodutivo;
    }

    public void setFldescarteproblemareprodutivo(String fldescarteproblemareprodutivo) {
        this.fldescarteproblemareprodutivo = fldescarteproblemareprodutivo;
    }

    public String getNmcausa() {
        return nmcausa;
    }

    public void setNmcausa(String nmcausa) {
        this.nmcausa = nmcausa;
    }

    public String getFlmarra() {
        return flmarra;
    }

    public void setFlmarra(String flmarra) {
        this.flmarra = flmarra;
    }

    public String getFltipo() {
        return fltipo;
    }

    public void setFltipo(String fltipo) {
        this.fltipo = fltipo;
    }

    public Character getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(Character flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Ecusbdporccausaleitao getCdbdporccausaleitao() {
        return cdbdporccausaleitao;
    }

    public void setCdbdporccausaleitao(Ecusbdporccausaleitao cdbdporccausaleitao) {
        this.cdbdporccausaleitao = cdbdporccausaleitao;
    }

    public Ecusbdporccausareprodutor getCdbdporccausareprod() {
        return cdbdporccausareprod;
    }

    public void setCdbdporccausareprod(Ecusbdporccausareprodutor cdbdporccausareprod) {
        this.cdbdporccausareprod = cdbdporccausareprod;
    }

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdcausa != null ? cdcausa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esancausa)) {
            return false;
        }
        Esancausa other = (Esancausa) object;
        if ((this.cdcausa == null && other.cdcausa != null) || (this.cdcausa != null && !this.cdcausa.equals(other.cdcausa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esancausa[ cdcausa=" + cdcausa + " ]";
    }

}
