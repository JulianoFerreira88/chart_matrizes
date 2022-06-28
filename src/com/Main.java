package com;

import com.model.dao.esanmatrizdao.EsanmatrizDao;
import com.model.entites.Esanmatriz;
import com.views.esanmatrizview.EsanmatrizView;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    private final List<Esanmatriz> gestantes;
    private final List<Esanmatriz> lactantes;
    private final List<Esanmatriz> vazias;
    private final EsanmatrizDao dao;

    public Main() {
        initComponents();
        dao = new EsanmatrizDao();
        gestantes = dao.getGestantes();
        lactantes = dao.getLactantes();
        vazias = dao.getVazias();
        tblGestantes.setMatrizes(gestantes);
        tblLactantes.setMatrizes(lactantes);
        tblVazias.setMatrizes(vazias);
        tblGestantes.setOnMatrizSelected((Esanmatriz m) -> {
            onMatriz(m);
        });
        tblLactantes.setOnMatrizSelected((Esanmatriz m) -> {
            onMatriz(m);
        });
        tblVazias.setOnMatrizSelected((Esanmatriz m) -> {
            onMatriz(m);
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tblGestantes = new com.views.esanmatriztable.EsanmatrizTable();
        tblLactantes = new com.views.esanmatriztable.EsanmatrizTable();
        tblVazias = new com.views.esanmatriztable.EsanmatrizTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 650));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane1.addTab("Gestantes", tblGestantes);
        jTabbedPane1.addTab("Lactantes", tblLactantes);
        jTabbedPane1.addTab("Vazias", tblVazias);

        getContentPane().add(jTabbedPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.views.esanmatriztable.EsanmatrizTable tblGestantes;
    private com.views.esanmatriztable.EsanmatrizTable tblLactantes;
    private com.views.esanmatriztable.EsanmatrizTable tblVazias;
    // End of variables declaration//GEN-END:variables

    private void onMatriz(Esanmatriz m) {
        JDialog dialog = new JDialog(this);
        dialog.add(new EsanmatrizView(m));
        dialog.setModal(true);
        dialog.setUndecorated(true);
        dialog.setSize(1000, 650);
        dialog.setVisible(true);
    }

}
