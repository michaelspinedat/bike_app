/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.NoveltyJDBC;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ExceptionHandler;
import models.Novelty;
import models.Route;

/**
 *
 * @author michael
 */
public class JDAddNovelty extends javax.swing.JDialog {

    private Route route;

    /**
     * Creates new form JDNovelty
     */
    public JDAddNovelty(java.awt.Frame parent, boolean modal, Route route) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.route = route;
        this.loadTypes();
        this.jLRoute.setText(String.format("Route with id: %d, started in: %s at %s",
                this.route.getId(), this.route.getStartingLocation(),
                this.route.getStart()));
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
        jCBType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jBtnAddNovelty = new javax.swing.JButton();
        jLBack = new javax.swing.JLabel();
        jLRoute = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTTitle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(18, 104, 123));

        jCBType.setBackground(new java.awt.Color(152, 237, 237));
        jCBType.setToolTipText("Elige un tipo de novedad");

        jTADescription.setBackground(new java.awt.Color(152, 237, 237));
        jTADescription.setColumns(20);
        jTADescription.setRows(5);
        jScrollPane1.setViewportView(jTADescription);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOVELTY");

        jBtnAddNovelty.setBackground(new java.awt.Color(34, 182, 75));
        jBtnAddNovelty.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddNovelty.setText("Add novelty");
        jBtnAddNovelty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAddNoveltyMouseClicked(evt);
            }
        });

        jLBack.setText("Back");
        jLBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBackMouseClicked(evt);
            }
        });

        jLRoute.setForeground(new java.awt.Color(255, 255, 255));
        jLRoute.setText("Route: ");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Type");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Description");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Title");

        jTTitle.setBackground(new java.awt.Color(152, 237, 237));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBack)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnAddNovelty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jTTitle)
                            .addComponent(jCBType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel3)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLRoute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jBtnAddNovelty)
                .addGap(19, 19, 19)
                .addComponent(jLBack)
                .addGap(24, 24, 24))
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

    private void loadTypes() {
        Novelty.Type[] types = Novelty.Type.values();
        for (Novelty.Type t : types) {
            jCBType.addItem(t.toString());
        }
    }

    private void jBtnAddNoveltyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAddNoveltyMouseClicked
        addNovelty();
    }//GEN-LAST:event_jBtnAddNoveltyMouseClicked

    private void jLBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackMouseClicked
        this.end();
    }//GEN-LAST:event_jLBackMouseClicked

    private void end() {
        this.clear();
        this.dispose();
    }

    private void clear() {
        this.jTTitle.setText("");
        this.jCBType.setSelectedIndex(0);
        this.jTADescription.setText("");
    }

    private void addNovelty() {
        String title = jTTitle.getText();
        String description = jTADescription.getText();
        String type = jCBType.getSelectedItem().toString();
        Novelty novelty = new Novelty(title, this.route, type, description);
        NoveltyJDBC noveltyJDBC = new NoveltyJDBC();

        if (title.equals("")) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un título");
            return;
        }

        try {
            noveltyJDBC.insert(novelty);
            JOptionPane.showMessageDialog(this, "Se ha agregado la descripción");
            this.clear();
        } catch (SQLException ex) {
            ExceptionHandler.showErrorMsg(this, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddNovelty;
    private javax.swing.JComboBox<String> jCBType;
    private javax.swing.JLabel jLBack;
    private javax.swing.JLabel jLRoute;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescription;
    private javax.swing.JTextField jTTitle;
    // End of variables declaration//GEN-END:variables
}
