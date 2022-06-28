package com.model.entites;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.math3.util.Precision;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetGroup;

@Entity
@Table(name = "ESANMATRIZ", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esanmatriz.findAll", query = "SELECT e FROM Esanmatriz e")})
public class Esanmatriz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMATRIZ")
    private Integer cdmatriz;
    @Column(name = "ID1")
    private String id1;
    @Column(name = "ID2")
    private String id2;
    @Column(name = "DTNASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    @Column(name = "DTENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtentrada;
    @Column(name = "DTSAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtsaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOENTRADA")
    private Double pesoentrada;
    @Column(name = "PESOSAIDA")
    private Double pesosaida;
    @Column(name = "VLCOMPRA")
    private Double vlcompra;
    @Column(name = "VLVENDA")
    private Double vlvenda;
    @Column(name = "NUCICLOS")
    private Short nuciclos;
    @Column(name = "CICLOENTRADA")
    private Short cicloentrada;
    @Column(name = "FLESTADOREPRODUTIVO")
    private String flestadoreprodutivo;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLMAEDELEITE")
    private String flmaedeleite;
    @Column(name = "FLMOTIVOENTRADA")
    private String flmotivoentrada;
    @Column(name = "DTPRIMEIRACOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtprimeiracobertura;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "FLLACTANTECOBERTA")
    private String fllactantecoberta;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DTCOBERTCOMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcobertcompra;
    @Column(name = "FLPREDESCARTE")
    private String flpredescarte;
    @Column(name = "FLCOMPRAGESTANTE")
    private String flcompragestante;
    @Column(name = "GUID")
    private String guid;
    @OneToMany(mappedBy = "cdmatriz")
    private List<Esandesmame> esandesmameList;
    @OneToMany(mappedBy = "cdmatriz", fetch = FetchType.EAGER)
    private List<Esanparto> esanpartoList = new ArrayList<>();
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDNOTA", referencedColumnName = "CDNOTA")
    @ManyToOne
    private Eannota cdnota;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDMOVANIMAIS", referencedColumnName = "CDMOVANIMAIS")
    @ManyToOne
    private Esanmovanimais cdmovanimais;
    @JoinColumn(name = "CDRACA", referencedColumnName = "CDRACA")
    @ManyToOne
    private Esanraca cdraca;
    @JoinColumn(name = "CDSALA", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsala;
    @OneToMany(mappedBy = "cdmatriz")
    private List<Esancobertura> esancoberturaList;

    public Esanmatriz() {
    }

    public Esanmatriz(Integer cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public Integer getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Integer cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Double getPesoentrada() {
        return pesoentrada;
    }

    public void setPesoentrada(Double pesoentrada) {
        this.pesoentrada = pesoentrada;
    }

    public Double getPesosaida() {
        return pesosaida;
    }

    public void setPesosaida(Double pesosaida) {
        this.pesosaida = pesosaida;
    }

    public Double getVlcompra() {
        return vlcompra;
    }

    public void setVlcompra(Double vlcompra) {
        this.vlcompra = vlcompra;
    }

    public Double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(Double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public Short getNuciclos() {
        return nuciclos;
    }

    public void setNuciclos(Short nuciclos) {
        this.nuciclos = nuciclos;
    }

    public Short getCicloentrada() {
        return cicloentrada;
    }

    public void setCicloentrada(Short cicloentrada) {
        this.cicloentrada = cicloentrada;
    }

    public String getFlestadoreprodutivo() {
        return flestadoreprodutivo;
    }

    public void setFlestadoreprodutivo(String flestadoreprodutivo) {
        this.flestadoreprodutivo = flestadoreprodutivo;
    }

    public String getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(String flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getFlmaedeleite() {
        return flmaedeleite;
    }

    public void setFlmaedeleite(String flmaedeleite) {
        this.flmaedeleite = flmaedeleite;
    }

    public String getFlmotivoentrada() {
        return flmotivoentrada;
    }

    public void setFlmotivoentrada(String flmotivoentrada) {
        this.flmotivoentrada = flmotivoentrada;
    }

    public Date getDtprimeiracobertura() {
        return dtprimeiracobertura;
    }

    public void setDtprimeiracobertura(Date dtprimeiracobertura) {
        this.dtprimeiracobertura = dtprimeiracobertura;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public String getFllactantecoberta() {
        return fllactantecoberta;
    }

    public void setFllactantecoberta(String fllactantecoberta) {
        this.fllactantecoberta = fllactantecoberta;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtcobertcompra() {
        return dtcobertcompra;
    }

    public void setDtcobertcompra(Date dtcobertcompra) {
        this.dtcobertcompra = dtcobertcompra;
    }

    public String getFlpredescarte() {
        return flpredescarte;
    }

    public void setFlpredescarte(String flpredescarte) {
        this.flpredescarte = flpredescarte;
    }

    public String getFlcompragestante() {
        return flcompragestante;
    }

    public void setFlcompragestante(String flcompragestante) {
        this.flcompragestante = flcompragestante;
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

    public Eanentidade getCdentidade() {
        return cdentidade;
    }

    public void setCdentidade(Eanentidade cdentidade) {
        this.cdentidade = cdentidade;
    }

    public Eannota getCdnota() {
        return cdnota;
    }

    public void setCdnota(Eannota cdnota) {
        this.cdnota = cdnota;
    }

    public Esanempresa getCdempresa() {
        return cdempresa;
    }

    public void setCdempresa(Esanempresa cdempresa) {
        this.cdempresa = cdempresa;
    }

    public Esanmovanimais getCdmovanimais() {
        return cdmovanimais;
    }

    public void setCdmovanimais(Esanmovanimais cdmovanimais) {
        this.cdmovanimais = cdmovanimais;
    }

    public Esanraca getCdraca() {
        return cdraca;
    }

    public void setCdraca(Esanraca cdraca) {
        this.cdraca = cdraca;
    }

    public Esansala getCdsala() {
        return cdsala;
    }

    public void setCdsala(Esansala cdsala) {
        this.cdsala = cdsala;
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
        hash += (cdmatriz != null ? cdmatriz.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanmatriz)) {
            return false;
        }
        Esanmatriz other = (Esanmatriz) object;
        if ((this.cdmatriz == null && other.cdmatriz != null) || (this.cdmatriz != null && !this.cdmatriz.equals(other.cdmatriz))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Esanmatriz{" + "id1=" + id1 + '}';
    }

    public CategoryDataset getNascidosTotaisDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Nascidos Totais"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNascidosTotais(), "Totais", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public CategoryDataset getNascidosVivosDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Nascidos Vivos"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNuvivo(), "Vivos", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public CategoryDataset getNatimortosDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Natimortos"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNunatimorto(), "Natimortos", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public CategoryDataset getMumificadosDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Mumificados"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNumumificado(), "Mumificados", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public CategoryDataset getMorteAoNascerDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Morte Ao Nascer"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNumortoaonascer(), "Morte Ao Nascer", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public CategoryDataset getBaixaViabiliadeDataSet() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setGroup(new DatasetGroup("Baixa Viabilidade"));
        for (Esanparto p : esanpartoList) {
            data.addValue(p.getNuleitoesabaixo(), "Baixa Viabilidade", "Ciclo: " + p.getCiclo());
        }
        return data;
    }

    public String getIdadeDias() {
        return "Implementar!!";
    }

    public String getEstadoReprodutivo() {
        if ("G".equals(flestadoreprodutivo)) {
            return "Gestante";
        } else if ("V".equals(flestadoreprodutivo)) {
            return "Vazia";
        } else {
            return "Lactante";
        }
    }

    public double getMediaNascidosTotais() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double nascidosTotais = 0.0;
        for (Esanparto p : esanpartoList) {
            nascidosTotais += p.getNascidosTotais() * 1.0;
        }
        return Precision.round((nascidosTotais / esanpartoList.size()), 2);
    }

    public double getMediaNascidosVivos() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double nascidosTotais = 0.0;
        for (Esanparto p : esanpartoList) {
            nascidosTotais += p.getNuvivo() * 1.0;
        }
        return Precision.round((nascidosTotais / esanpartoList.size()), 2);
    }

    public double getPercentualNatimortos() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double totalNascidos = 0.0;
        double totalNatimortos = 0.0;
        for (Esanparto p : esanpartoList) {
            totalNascidos += p.getNascidosTotais() * 1.0;
            totalNatimortos += p.getNunatimorto() * 1.0;
        }
        return Precision.round((totalNatimortos * 100 / totalNascidos), 2);
    }

    public double getPercentualMumificados() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double totalNascidos = 0.0;
        double totalMumificados = 0.0;
        for (Esanparto p : esanpartoList) {
            totalNascidos += p.getNascidosTotais() * 1.0;
            totalMumificados += p.getNumumificado() * 1.0;
        }
        return Precision.round((totalMumificados * 100 / totalNascidos), 2);
    }

    public double getPercentualMorteAoNascer() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double totalNascidos = 0.0;
        double totalMorteAoNascer = 0.0;
        for (Esanparto p : esanpartoList) {
            totalNascidos += p.getNascidosTotais() * 1.0;
            totalMorteAoNascer += p.getNumortoaonascer() * 1.0;
        }

        return Precision.round((totalMorteAoNascer * 100 / totalNascidos), 2);
    }

    public double getPercentualBaixaViabilidade() {
        if (esanpartoList.isEmpty()) {
            return 0.0;
        }
        double totalNascidosVivos = 0.0;
        double totalBv = 0.0;
        for (Esanparto p : esanpartoList) {
            totalNascidosVivos += p.getNuvivo() * 1.0;
            totalBv += p.getNuleitoesabaixo() * 1.0;
        }

        return Precision.round((totalBv * 100 / totalNascidosVivos), 2);
    }

    public Color getColor() {
        return Color.red;
    }

    private int getNota() {
        return 0;
    }

}
