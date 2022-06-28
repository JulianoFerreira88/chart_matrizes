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
@Table(name = "ESANPARTO", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanparto.findAll", query = "SELECT e FROM Esanparto e")})
public class Esanparto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDPARTO")
    private Integer cdparto;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTINICIOPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinicioparto;
    @Column(name = "DTFIMPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfimparto;
    @Column(name = "HORAINICIOPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicioparto;
    @Column(name = "HORAFIMPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafimparto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOMATRIZ")
    private Double pesomatriz;
    @Column(name = "ESPESSURATOUCINHOMATRIZ")
    private Double espessuratoucinhomatriz;
    @Column(name = "PESOLEITEGADA")
    private Double pesoleitegada;
    @Column(name = "NUMUMIFICADO")
    private Integer numumificado;
    @Column(name = "NUNATIMORTO")
    private Integer nunatimorto;
    @Column(name = "NUMORTOAONASCER")
    private Integer numortoaonascer;
    @Column(name = "NUVIVO")
    private Integer nuvivo;
    @Column(name = "NUDOADO")
    private Integer nudoado;
    @Column(name = "NURECEBIDO")
    private Integer nurecebido;
    @Column(name = "PESOMEDIONASCIMENTO")
    private Double pesomedionascimento;
    @Column(name = "DTMEDIANASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "SCORECORPORAL")
    private Integer scorecorporal;
    @Column(name = "NULEITOESABAIXO")
    private Integer nuleitoesabaixo;
    @Column(name = "NULEITOESENTRE")
    private Integer nuleitoesentre;
    @Column(name = "NULEITOESACIMA")
    private Integer nuleitoesacima;
    @Column(name = "DURACAO")
    private String duracao;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdpartoorigem")
    private List<Esanmovmaternidade> esanmovmaternidadeList;
    @OneToMany(mappedBy = "cdpartodestino")
    private List<Esanmovmaternidade> esanmovmaternidadeList1;
    @JoinColumn(name = "CDCOBERTURA", referencedColumnName = "CDCOBERTURA")
    @ManyToOne
    private Esancobertura cdcobertura;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFUNCIONARIO", referencedColumnName = "CDFUNCIONARIO")
    @ManyToOne
    private Esanfuncionario cdfuncionario;
    @JoinColumn(name = "CDMATRIZ", referencedColumnName = "CDMATRIZ")
    @ManyToOne
    private Esanmatriz cdmatriz;
    @JoinColumn(name = "CDMOVANIMAIS", referencedColumnName = "CDMOVANIMAIS")
    @ManyToOne
    private Esanmovanimais cdmovanimais;
    @JoinColumn(name = "CDSALA", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsala;
    @JoinColumn(name = "CDTIPOPARTO", referencedColumnName = "CDTIPOPARTO")
    @ManyToOne
    private Esantipoparto cdtipoparto;

    public Esanparto() {
    }

    public Esanparto(Integer cdparto) {
        this.cdparto = cdparto;
    }

    public Integer getCdparto() {
        return cdparto;
    }

    public void setCdparto(Integer cdparto) {
        this.cdparto = cdparto;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtinicioparto() {
        return dtinicioparto;
    }

    public void setDtinicioparto(Date dtinicioparto) {
        this.dtinicioparto = dtinicioparto;
    }

    public Date getDtfimparto() {
        return dtfimparto;
    }

    public void setDtfimparto(Date dtfimparto) {
        this.dtfimparto = dtfimparto;
    }

    public Date getHorainicioparto() {
        return horainicioparto;
    }

    public void setHorainicioparto(Date horainicioparto) {
        this.horainicioparto = horainicioparto;
    }

    public Date getHorafimparto() {
        return horafimparto;
    }

    public void setHorafimparto(Date horafimparto) {
        this.horafimparto = horafimparto;
    }

    public Double getPesomatriz() {
        return pesomatriz;
    }

    public void setPesomatriz(Double pesomatriz) {
        this.pesomatriz = pesomatriz;
    }

    public Double getEspessuratoucinhomatriz() {
        return espessuratoucinhomatriz;
    }

    public void setEspessuratoucinhomatriz(Double espessuratoucinhomatriz) {
        this.espessuratoucinhomatriz = espessuratoucinhomatriz;
    }

    public Double getPesoleitegada() {
        return pesoleitegada;
    }

    public void setPesoleitegada(Double pesoleitegada) {
        this.pesoleitegada = pesoleitegada;
    }

    public Integer getNumumificado() {
        return numumificado;
    }

    public void setNumumificado(Integer numumificado) {
        this.numumificado = numumificado;
    }

    public Integer getNunatimorto() {
        return nunatimorto;
    }

    public void setNunatimorto(Integer nunatimorto) {
        this.nunatimorto = nunatimorto;
    }

    public Integer getNumortoaonascer() {
        return numortoaonascer;
    }

    public void setNumortoaonascer(Integer numortoaonascer) {
        this.numortoaonascer = numortoaonascer;
    }

    public Integer getNuvivo() {
        return nuvivo;
    }

    public void setNuvivo(Integer nuvivo) {
        this.nuvivo = nuvivo;
    }

    public Integer getNudoado() {
        return nudoado;
    }

    public void setNudoado(Integer nudoado) {
        this.nudoado = nudoado;
    }

    public Integer getNurecebido() {
        return nurecebido;
    }

    public void setNurecebido(Integer nurecebido) {
        this.nurecebido = nurecebido;
    }

    public Double getPesomedionascimento() {
        return pesomedionascimento;
    }

    public void setPesomedionascimento(Double pesomedionascimento) {
        this.pesomedionascimento = pesomedionascimento;
    }

    public Date getDtmedianascimento() {
        return dtmedianascimento;
    }

    public void setDtmedianascimento(Date dtmedianascimento) {
        this.dtmedianascimento = dtmedianascimento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public Integer getScorecorporal() {
        return scorecorporal;
    }

    public void setScorecorporal(Integer scorecorporal) {
        this.scorecorporal = scorecorporal;
    }

    public Integer getNuleitoesabaixo() {
        return nuleitoesabaixo;
    }

    public void setNuleitoesabaixo(Integer nuleitoesabaixo) {
        this.nuleitoesabaixo = nuleitoesabaixo;
    }

    public Integer getNuleitoesentre() {
        return nuleitoesentre;
    }

    public void setNuleitoesentre(Integer nuleitoesentre) {
        this.nuleitoesentre = nuleitoesentre;
    }

    public Integer getNuleitoesacima() {
        return nuleitoesacima;
    }

    public void setNuleitoesacima(Integer nuleitoesacima) {
        this.nuleitoesacima = nuleitoesacima;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<Esanmovmaternidade> getEsanmovmaternidadeList() {
        return esanmovmaternidadeList;
    }

    public void setEsanmovmaternidadeList(List<Esanmovmaternidade> esanmovmaternidadeList) {
        this.esanmovmaternidadeList = esanmovmaternidadeList;
    }

    public List<Esanmovmaternidade> getEsanmovmaternidadeList1() {
        return esanmovmaternidadeList1;
    }

    public void setEsanmovmaternidadeList1(List<Esanmovmaternidade> esanmovmaternidadeList1) {
        this.esanmovmaternidadeList1 = esanmovmaternidadeList1;
    }

    public Esancobertura getCdcobertura() {
        return cdcobertura;
    }

    public void setCdcobertura(Esancobertura cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanfuncionario getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Esanfuncionario cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public Esanmatriz getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Esanmatriz cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public Esanmovanimais getCdmovanimais() {
        return cdmovanimais;
    }

    public void setCdmovanimais(Esanmovanimais cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Esansala getCdsala() {
        return cdsala;
    }

    public void setCdsala(Esansala cdsala) {
        this.cdsala = cdsala;
    }

    public Esantipoparto getCdtipoparto() {
        return cdtipoparto;
    }

    public void setCdtipoparto(Esantipoparto cdtipoparto) {
        this.cdtipoparto = cdtipoparto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdparto != null ? cdparto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanparto)) {
            return false;
        }
        Esanparto other = (Esanparto) object;
        if ((this.cdparto == null && other.cdparto != null) || (this.cdparto != null && !this.cdparto.equals(other.cdparto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entites.Esanparto[ cdparto=" + cdparto + " ]";
    }

    public Integer getNascidosTotais() {
        return nuvivo + nunatimorto + numumificado + numortoaonascer;
    }

}
