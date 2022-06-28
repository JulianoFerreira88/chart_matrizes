package com.views.esanmatriztable;

import com.model.entites.Esanmatriz;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class EsanmatrizTable extends javax.swing.JPanel {

    private List<Esanmatriz> matrizes = new ArrayList<>();
    private OnMatrizSelected onMatrizSelected;

    public EsanmatrizTable() {
        initComponents();
        onMatrizSelected = (Esanmatriz m) -> {
            System.out.println("Matriz selected: " + m);
        };
        tableMatrizes.setModel(getMatrizModel());
        tableMatrizes.setRowSorter(new TableRowSorter<>(getMatrizModel()));
        tableMatrizes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent me) {
                int row = tableMatrizes.getSelectedRow();
                String idMatriz = (String) tableMatrizes.getValueAt(row, 0);
                matrizes.forEach(m -> {
                    if (m.getId1().equals(idMatriz)) {
                        onMatrizSelected.onMatrizSelected(m);
                    }

                });
            }
        });
    }

    public void onMatrizSelected(Esanmatriz matriz) {
        System.out.println(matriz);
    }

    public void setMatrizes(List<Esanmatriz> matrizes) {
        this.matrizes = matrizes;
        tableMatrizes.setModel(getMatrizModel());
        this.updateUI();
    }

    public void setOnMatrizSelected(OnMatrizSelected onMatrizSelected) {
        this.onMatrizSelected = onMatrizSelected;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatrizes = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tableMatrizes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMatrizes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableMatrizes.setGridColor(new java.awt.Color(0, 0, 204));
        tableMatrizes.setRowHeight(20);
        jScrollPane1.setViewportView(tableMatrizes);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMatrizes;
    // End of variables declaration//GEN-END:variables

    private TableModel getMatrizModel() {
        return new AbstractTableModel() {
            private final String[] columns = new String[]{
                "Matriz",
                "Ciclo",
                "Raça",
                "NV",
                "NM(%)",
                "MUM(%)",
                "MN(%)",
                "NT",
                "BV(%)"
            };

            @Override
            public int getRowCount() {
                return matrizes.size();
            }

            @Override
            public int getColumnCount() {
                return columns.length;
            }

            @Override
            public Object getValueAt(int row, int column) {
                switch (column) {
                    case 0:
                        return matrizes.get(row).getId1();
                    case 1:
                        return matrizes.get(row).getNuciclos();
                    case 2:
                        return matrizes.get(row).getCdraca().getNmraca();
                    case 3:
                        return matrizes.get(row).getMediaNascidosVivos();
                    case 4:
                        return matrizes.get(row).getPercentualNatimortos();
                    case 5:
                        return matrizes.get(row).getPercentualMumificados();
                    case 6:
                        return matrizes.get(row).getPercentualMorteAoNascer();
                    case 7:
                        return matrizes.get(row).getMediaNascidosTotais();
                    case 8:
                        return matrizes.get(row).getPercentualBaixaViabilidade();
                }
                return null;
            }

            @Override
            public String getColumnName(int i) {
                return columns[i];
            }

            @Override
            public Class<?> getColumnClass(int column) {
                return getValueAt(0, column).getClass();

            }

        };

    }

    public interface OnMatrizSelected {

        void onMatrizSelected(Esanmatriz m);
    }

}
