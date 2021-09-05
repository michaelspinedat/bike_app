/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.NoveltyJDBC;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ExceptionHandler;
import models.Novelty;
import models.Route;

/**
 *
 * @author michael
 */
public class JDNovelties extends javax.swing.JDialog {

    private java.awt.Frame parent;
    private Route route;

    /**
     * Creates new form JDNovelties
     */
    public JDNovelties(java.awt.Frame parent, boolean modal, Route route) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.parent = parent;
        this.route = route;
        this.jLTitle.setText(String.format("Route with id: %d, started in: %s at %s",
                this.route.getId(), this.route.getStartingLocation(),
                this.route.getStart()));
        this.loadNovelties();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCBNovelties = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLTitle = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescription = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLType = new javax.swing.JLabel();
        jLBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(18, 104, 123));

        jCBNovelties.setBackground(new java.awt.Color(152, 237, 237));
        jCBNovelties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNoveltiesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Novelties:");

        jLTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLTitle.setText("ROUTE: ");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Type:");

        jTADescription.setBackground(new java.awt.Color(152, 237, 237));
        jTADescription.setColumns(20);
        jTADescription.setLineWrap(true);
        jTADescription.setRows(5);
        jScrollPane1.setViewportView(jTADescription);

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Description");

        jLType.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLType.setForeground(new java.awt.Color(204, 204, 204));

        jLBack.setForeground(new java.awt.Color(255, 255, 255));
        jLBack.setText("Back");
        jLBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLType, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(jCBNovelties, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLTitle)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jCBNovelties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLBack)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackMouseClicked
        this.end();
    }//GEN-LAST:event_jLBackMouseClicked

    private void jCBNoveltiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNoveltiesActionPerformed
        Novelty novelty = (Novelty) this.jCBNovelties.getSelectedItem();
        if (novelty != null) {
            this.jLType.setText(novelty.getType());
            this.jTADescription.setText(novelty.getDescription());
        }
    }//GEN-LAST:event_jCBNoveltiesActionPerformed

    private void loadNovelties() {
        NoveltyJDBC noveltyJDBC = new NoveltyJDBC();
        try {
            ArrayList<Novelty> novelties = noveltyJDBC.select(route.getId());
            novelties.forEach(n -> jCBNovelties.addItem(n));
        } catch (SQLException ex) {
            ExceptionHandler.showErrorMsg(this, ex);
        }
    }

    private void end() {
        this.setVisible(false);
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Novelty> jCBNovelties;
    private javax.swing.JLabel jLBack;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLType;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescription;
    // End of variables declaration//GEN-END:variables
}
