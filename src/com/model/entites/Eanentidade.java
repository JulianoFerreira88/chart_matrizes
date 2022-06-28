
package com.model.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "EANENTIDADE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eanentidade.findAll", query = "SELECT e FROM Eanentidade e")})
public class Eanentidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDENTIDADE")
    private Integer cdentidade;
    @Column(name = "FLTIPOPESSOA")
    private String fltipopessoa;
    @Column(name = "DTCADASTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcadastro;
    @Column(name = "NMENTIDADE")
    private String nmentidade;
    @Column(name = "NMFANTASIA")
    private String nmfantasia;
    @Column(name = "DOCUMENTO")
    private String documento;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "CAIXAPOSTAL")
    private String caixapostal;
    @Column(name = "FONECOMERCIAL")
    private String fonecomercial;
    @Column(name = "FONERESIDENCIAL")
    private String foneresidencial;
    @Column(name = "FONECELULAR")
    private String fonecelular;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "HOMEPAGE")
    private String homepage;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "CGCCPF")
    private String cgccpf;
    @Column(name = "INSCESTADUAL")
    private String inscestadual;
    @Column(name = "CDPROCEDENCIA")
    private String cdprocedencia;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLINTEGRADORA")
    private String flintegradora;
    @Column(name = "CDGRANJAINTEGRADORA")
    private Integer cdgranjaintegradora;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdentidade")
    private List<Eannota> eannotaList;
    @OneToMany(mappedBy = "cdentidade")
    private List<Esanmatriz> esanmatrizList;
    @OneToMany(mappedBy = "cdentidade")
    private List<Esanreprodutor> esanreprodutorList;
    @JoinColumn(name = "CDMUNICIPIO", referencedColumnName = "CDMUNICIPIO")
    @ManyToOne
    private Eanmunicipio cdmunicipio;
    @OneToMany(mappedBy = "cdentidade")
    private List<Esanmovanimais> esanmovanimaisList;
    @OneToMany(mappedBy = "cdentidade")
    private List<Esanlote> esanloteList;

    public Eanentidade() {
    }

    public Eanentidade(Integer cdentidade) {
        this.cdentidade = cdentidade;
    }

    public Integer getCdentidade() {
        return cdentidade;
    }

    public void setCdentidade(Integer cdentidade) {
        this.cdentidade = cdentidade;
    }

    public String getFltipopessoa() {
        return fltipopessoa;
    }

    public void setFltipopessoa(String fltipopessoa) {
        this.fltipopessoa = fltipopessoa;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public String getNmentidade() {
        return nmentidade;
    }

    public void setNmentidade(String nmentidade) {
        this.nmentidade = nmentidade;
    }

    public String getNmfantasia() {
        return nmfantasia;
    }

    public void setNmfantasia(String nmfantasia) {
        this.nmfantasia = nmfantasia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCaixapostal() {
        return caixapostal;
    }

    public void setCaixapostal(String caixapostal) {
        this.caixapostal = caixapostal;
    }

    public String getFonecomercial() {
        return fonecomercial;
    }

    public void setFonecomercial(String fonecomercial) {
        this.fonecomercial = fonecomercial;
    }

    public String getFoneresidencial() {
        return foneresidencial;
    }

    public void setFoneresidencial(String foneresidencial) {
        this.foneresidencial = foneresidencial;
    }

    public String getFonecelular() {
        return fonecelular;
    }

    public void setFonecelular(String fonecelular) {
        this.fonecelular = fonecelular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCgccpf() {
        return cgccpf;
    }

    public void setCgccpf(String cgccpf) {
        this.cgccpf = cgccpf;
    }

    public String getInscestadual() {
        return inscestadual;
    }

    public void setInscestadual(String inscestadual) {
        this.inscestadual = inscestadual;
    }

    public String getCdprocedencia() {
        return cdprocedencia;
    }

    public void setCdprocedencia(String cdprocedencia) {
        this.cdprocedencia = cdprocedencia;
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

    public Integer getCdgranjaintegradora() {
        return cdgranjaintegradora;
    }

    public void setCdgranjaintegradora(Integer cdgranjaintegradora) {
        this.cdgranjaintegradora = cdgranjaintegradora;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<Eannota> getEannotaList() {
        return eannotaList;
    }

    public void setEannotaList(List<Eannota> eannotaList) {
        this.eannotaList = eannotaList;
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

    public Eanmunicipio getCdmunicipio() {
        return cdmunicipio;
    }

    public void setCdmunicipio(Eanmunicipio cdmunicipio) {
        this.cdmunicipio = cdmunicipio;
    }

    public List<Esanmovanimais> getEsanmovanimaisList() {
        return esanmovanimaisList;
    }

    public void setEsanmovanimaisList(List<Esanmovanimais> esanmovanimaisList) {
        this.esanmovanimaisList = esanmovanimaisList;
    }

    public List<Esanlote> getEsanloteList() {
        return esanloteList;
    }

    public void setEsanloteList(List<Esanlote> esanloteList) {
        this.esanloteList = esanloteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdentidade != null ? cdentidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eanentidade)) {
            return false;
        }
        Eanentidade other = (Eanentidade) object;
        if ((this.cdentidade == null && other.cdentidade != null) || (this.cdentidade != null && !this.cdentidade.equals(other.cdentidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Eanentidade[ cdentidade=" + cdentidade + " ]";
    }

}
