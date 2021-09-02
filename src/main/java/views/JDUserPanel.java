/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.RouteJDBC;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Route;
import models.User;

/**
 *
 * @author michael
 */
public class JDUserPanel extends javax.swing.JDialog {

    private User user;
    private java.awt.Frame parent;

    /**
     * Creates new form JDUserPanel
     */
    public JDUserPanel(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        setLocationRelativeTo(this.parent);        
        this.user = user;
        showUserInfo();
    }

    private void showUserInfo() {
        jLGreeting.setText("HELLO " + this.user.getName());
        loadRoutes();
    }

    public void loadRoutes() {
        this.clearRoutes();
        RouteJDBC routeJDBC = new RouteJDBC();
        try {
            ArrayList<Route> routes = routeJDBC.getRoutes(this.user);
            DefaultTableModel model = (DefaultTableModel) jTRoutes.getModel();

            routes.forEach(r -> {
                Object[] row = {
                    r.getId(), r.getStart(), r.getEnd(),
                    r.getStartingLocation(), r.getFinalLocation(),
                    r.getDistance()
                };
                model.addRow(row);
            });

            jTRoutes.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }

    private void clearRoutes() {
        DefaultTableModel model = (DefaultTableModel) jTRoutes.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMRouteOptions = new javax.swing.JPopupMenu();
        jMIFinalizar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLGreeting = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRoutes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBAddRoute = new javax.swing.JButton();
        jLLogOut = new javax.swing.JLabel();

        jMIFinalizar.setText("Finalizar ruta");
        jMIFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFinalizarActionPerformed(evt);
            }
        });
        jPMRouteOptions.add(jMIFinalizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1003, 501));

        jPanel1.setBackground(new java.awt.Color(18, 104, 123));

        jLGreeting.setForeground(new java.awt.Color(255, 255, 255));
        jLGreeting.setText("HELLO ");

        jTRoutes.setBackground(new java.awt.Color(204, 255, 255));
        jTRoutes.setForeground(new java.awt.Color(0, 0, 0));
        jTRoutes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "start", "end", "starting location", "final location", "distance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTRoutes.setComponentPopupMenu(jPMRouteOptions);
        jScrollPane1.setViewportView(jTRoutes);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CURRENT ROUTES");

        jBAddRoute.setBackground(new java.awt.Color(34, 182, 75));
        jBAddRoute.setForeground(new java.awt.Color(255, 255, 255));
        jBAddRoute.setText("Add route");
        jBAddRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAddRouteMouseClicked(evt);
            }
        });

        jLLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jLLogOut.setText("Log out");
        jLLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325)
                        .addComponent(jLLogOut)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAddRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogOut)
                    .addComponent(jLGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jBAddRoute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
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

    private void jLLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLogOutMouseClicked
        JOptionPane.showMessageDialog(this.parent, "See you!" + this.user.getName());
        this.setVisible(false);
        this.parent.setVisible(true);
    }//GEN-LAST:event_jLLogOutMouseClicked

    private void jBAddRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAddRouteMouseClicked
        this.setVisible(false);
        new JDAddRoute(this.parent, true, this).setVisible(true);
    }//GEN-LAST:event_jBAddRouteMouseClicked

    private void jMIFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFinalizarActionPerformed
        int row = jTRoutes.getSelectedRow();
        int routeId = (int) jTRoutes.getValueAt(row, 0);        
        Timestamp end = new Timestamp(new Date().getTime());        
        Route route = new Route(routeId, end);
        RouteJDBC routeJDBC = new RouteJDBC();
        try {
            routeJDBC.updateEndTime(route);
            String msg = String.format("Has actualizado la ruta con id: %d%n", routeId);
            JOptionPane.showMessageDialog(this, msg);
            this.loadRoutes();
        } catch (SQLException ex) {
            Logger.getLogger(JDUserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddRoute;
    private javax.swing.JLabel jLGreeting;
    private javax.swing.JLabel jLLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIFinalizar;
    private javax.swing.JPopupMenu jPMRouteOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRoutes;
    // End of variables declaration//GEN-END:variables
}
