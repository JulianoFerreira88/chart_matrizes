package com.views.esanpartoview;

import com.model.entites.Esanparto;

public class EsanpartoView extends javax.swing.JPanel {

    private Esanparto parto;

    public EsanpartoView() {
        parto = new Esanparto();
        initComponents();
    }

    public void setParto(Esanparto parto) {
        this.parto = parto;
        onPartoChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onPartoChanged() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
