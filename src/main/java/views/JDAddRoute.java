/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.RouteJDBC;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.ExceptionHandler;
import models.Route;
import models.exceptions.RouteDataTooLongException;

/**
 *
 * @author michael
 */
public class JDAddRoute extends javax.swing.JDialog {

    private JDUserPanel userPanel;
    private final Icon MAP_IMAGE = new ImageIcon("src/main/java/images/map.jpg");

    /**
     * Creates new form JDAddRoute
     */
    public JDAddRoute(java.awt.Frame parent, boolean modal, JDUserPanel userPanel) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.jLImage.setIcon(MAP_IMAGE);
        this.userPanel = userPanel;
        this.jLMsg.setText("Add a route, " + this.userPanel.getUser().getName());
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
        jTStartingLocation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFinalLocation = new javax.swing.JTextField();
        jTDistance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAddRoute = new javax.swing.JButton();
        jLBack = new javax.swing.JLabel();
        jLMsg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(18, 104, 123));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(18, 104, 123));

        jTStartingLocation.setBackground(new java.awt.Color(152, 237, 237));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Final location");

        jTFinalLocation.setBackground(new java.awt.Color(152, 237, 237));

        jTDistance.setBackground(new java.awt.Color(152, 237, 237));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD ROUTE");

        jBAddRoute.setBackground(new java.awt.Color(34, 182, 75));
        jBAddRoute.setForeground(new java.awt.Color(255, 255, 255));
        jBAddRoute.setText("Add route");
        jBAddRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAddRouteMouseClicked(evt);
            }
        });

        jLBack.setForeground(new java.awt.Color(255, 255, 255));
        jLBack.setText("Back");
        jLBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBackMouseClicked(evt);
            }
        });

        jLMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLMsg.setText("Add a route, ");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Starting location");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Distance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMsg)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTDistance)
                                    .addComponent(jTStartingLocation)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jBAddRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                                .addGap(244, 244, 244)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jTFinalLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLImage, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLBack)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLMsg)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTStartingLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFinalLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLImage, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddRoute)
                .addGap(30, 30, 30)
                .addComponent(jLBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackMouseClicked
        this.clear();
        this.setVisible(false);
        this.userPanel.loadRoutes();
        this.userPanel.setVisible(true);
    }//GEN-LAST:event_jLBackMouseClicked

    private void jBAddRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAddRouteMouseClicked
        String startingLocation = jTStartingLocation.getText();
        String finalLocation = jTFinalLocation.getText();

        if (startingLocation.equals("") || finalLocation.equals("")) {
            JOptionPane.showMessageDialog(this, "Faltan campos");
            return;
        }

        double distance = 0;
        try {
            distance = Double.parseDouble(jTDistance.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa una distancia correcta");
            return;
        }

        try {
            Route route = new Route(this.userPanel.getUser(),
                    startingLocation, finalLocation, distance);
            
            RouteJDBC routeJDBC = new RouteJDBC();
            routeJDBC.insert(route);
            JOptionPane.showMessageDialog(this, "Ruta creada con éxito");
            this.clear();
        } catch (SQLException | RouteDataTooLongException ex) {
            ExceptionHandler.showErrorMsg(this, ex);
        }         
    }//GEN-LAST:event_jBAddRouteMouseClicked

    private void clear() {
        jTStartingLocation.setText("");
        jTFinalLocation.setText("");
        jTDistance.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddRoute;
    private javax.swing.JLabel jLBack;
    private javax.swing.JLabel jLImage;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDistance;
    private javax.swing.JTextField jTFinalLocation;
    private javax.swing.JTextField jTStartingLocation;
    // End of variables declaration//GEN-END:variables
}
