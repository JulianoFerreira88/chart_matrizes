package com.views.esanmatrizview;

import com.model.entites.Esanmatriz;

public class EsanmatrizView extends javax.swing.JPanel {

    private final Esanmatriz matriz;

    public EsanmatrizView(Esanmatriz matriz) {
        this.matriz = matriz;
        initComponents();
        chartMorteAoNascer.setData(matriz.getMorteAoNascerDataSet());
        chartBaixaViabilidade.setData(matriz.getBaixaViabiliadeDataSet());
        chartNatimortos.setData(matriz.getNatimortosDataSet());
        bottomPanel.setBackground(matriz.getColor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNomeMatriz = new javax.swing.JLabel();
        txtRacaMatriz = new javax.swing.JLabel();
        txtCicloMatriz = new javax.swing.JLabel();
        txtIdadeMatriz = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        chartNascidosTotais = new com.components.charts.LineChart();
        chartNascidosVivos = new com.components.charts.LineChart();
        chartNatimortos = new com.components.charts.LineChart();
        chartMumificados = new com.components.charts.LineChart();
        chartMorteAoNascer = new com.components.charts.LineChart();
        chartBaixaViabilidade = new com.components.charts.LineChart();
        bottomPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 255)), "Dados da Matriz"));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        txtNomeMatriz.setText("Matriz: "+matriz.getId1());
        jPanel3.add(txtNomeMatriz);

        txtRacaMatriz.setText("Raça: "+matriz.getCdraca().getNmraca());
        jPanel3.add(txtRacaMatriz);

        txtCicloMatriz.setText("Ciclo: "+matriz.getNuciclos());
        jPanel3.add(txtCicloMatriz);

        txtIdadeMatriz.setText("Idade: "+matriz.getIdadeDias());
        jPanel3.add(txtIdadeMatriz);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 255)), "Dados de Cobertura"));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1);

        jLabel2.setText("jLabel1");
        jPanel4.add(jLabel2);

        jLabel3.setText("jLabel1");
        jPanel4.add(jLabel3);

        jLabel4.setText("jLabel1");
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 255)), "Dados de Parto"));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        jLabel5.setText("jLabel5");
        jPanel5.add(jLabel5);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 255)), "Dados de Desmame"));
        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.CardLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(102, 102, 255)));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chartNascidosTotais.setChartTitle("Nascidos Totais");
        chartNascidosTotais.setChartTitleColor(java.awt.Color.white);
        chartNascidosTotais.setData(matriz.getNascidosTotaisDataSet());
        jTabbedPane1.addTab("Nascidos Totais", chartNascidosTotais);

        chartNascidosVivos.setChartTitle("Nascidos Vivos");
        chartNascidosVivos.setChartTitleColor(java.awt.Color.white);
        chartNascidosVivos.setData(matriz.getNascidosVivosDataSet());
        jTabbedPane1.addTab("Nascidos Vivos", chartNascidosVivos);

        chartNatimortos.setChartTitle("Natimortos");
        chartNatimortos.setChartTitleColor(java.awt.Color.white);
        jTabbedPane1.addTab("Natimortos", chartNatimortos);

        chartMumificados.setChartTitle("Mumificados");
        chartMumificados.setChartTitleColor(java.awt.Color.white);
        chartMumificados.setData(matriz.getMumificadosDataSet());
        jTabbedPane1.addTab("Mumificados", chartMumificados);

        chartMorteAoNascer.setChartColor(java.awt.Color.darkGray);
        chartMorteAoNascer.setChartTitle("Mortes Ao Nascer");
        chartMorteAoNascer.setChartTitleColor(java.awt.Color.white);
        jTabbedPane1.addTab("Mortes Ao Nascer", chartMorteAoNascer);

        chartBaixaViabilidade.setChartTitle("Baixa Viabilidade");
        chartBaixaViabilidade.setChartTitleColor(java.awt.Color.white);
        jTabbedPane1.addTab("Baixa Viabilidade", chartBaixaViabilidade);

        jPanel2.add(jTabbedPane1, "card2");

        add(jPanel2, java.awt.BorderLayout.CENTER);

        bottomPanel.setPreferredSize(new java.awt.Dimension(875, 10));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(bottomPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private com.components.charts.LineChart chartBaixaViabilidade;
    private com.components.charts.LineChart chartMorteAoNascer;
    private com.components.charts.LineChart chartMumificados;
    private com.components.charts.LineChart chartNascidosTotais;
    private com.components.charts.LineChart chartNascidosVivos;
    private com.components.charts.LineChart chartNatimortos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtCicloMatriz;
    private javax.swing.JLabel txtIdadeMatriz;
    private javax.swing.JLabel txtNomeMatriz;
    private javax.swing.JLabel txtRacaMatriz;
    // End of variables declaration//GEN-END:variables
}
