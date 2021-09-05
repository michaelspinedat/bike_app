/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.RouteJDBC;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
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
public class JDEndRoute extends javax.swing.JDialog {

    private JDUserPanel userPanel;
    private Route route;
    private java.awt.Frame parent;
    private final Icon MAP_IMAGE = new ImageIcon("src/main/java/images/map.jpg");
    
    //private final Icon MAP_IMAGE = new ImageIcon("src/main/java/images/map.jpg");

    /**
     * Creates new form JDAddRoute
     */
    public JDEndRoute(java.awt.Frame parent, boolean modal, JDUserPanel userPanel, Route route) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.jLImage.setIcon(MAP_IMAGE);
        this.parent = parent;
        this.userPanel = userPanel;
        this.route = route;
        
        this.jLMsg.setText(String.format("End the route with id: %d, started in: %s at %s; %s",
                this.route.getId(), this.route.getStartingLocation(),
                this.route.getStart(), this.userPanel.getUser().getName()));
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
        jLabel7 = new javax.swing.JLabel();
        jTFinalLocation = new javax.swing.JTextField();
        jTDistance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAddRoute = new javax.swing.JButton();
        jLBack = new javax.swing.JLabel();
        jLMsg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnAddNolvety = new javax.swing.JButton();
        jLImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(18, 104, 123));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(18, 104, 123));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Final location");

        jTFinalLocation.setBackground(new java.awt.Color(152, 237, 237));

        jTDistance.setBackground(new java.awt.Color(152, 237, 237));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("END ROUTE");

        jBAddRoute.setBackground(new java.awt.Color(34, 182, 75));
        jBAddRoute.setForeground(new java.awt.Color(255, 255, 255));
        jBAddRoute.setText("End route");
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
        jLMsg.setText("End the route ");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Distance");

        jBtnAddNolvety.setBackground(new java.awt.Color(34, 182, 75));
        jBtnAddNolvety.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddNolvety.setText("Add novelty");
        jBtnAddNolvety.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAddNolvetyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7)
                            .addComponent(jBtnAddNolvety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFinalLocation)
                            .addComponent(jTDistance)
                            .addComponent(jLabel6)
                            .addComponent(jBAddRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jLImage, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLBack)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFinalLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAddNolvety)
                        .addGap(29, 29, 29)
                        .addComponent(jBAddRoute))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47)
                .addComponent(jLBack)
                .addGap(28, 28, 28))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackMouseClicked
        this.end();
    }//GEN-LAST:event_jLBackMouseClicked

    private void jBAddRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAddRouteMouseClicked
        this.endRoute();
    }//GEN-LAST:event_jBAddRouteMouseClicked

    private void jBtnAddNolvetyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAddNolvetyMouseClicked
        this.addNovelty();
    }//GEN-LAST:event_jBtnAddNolvetyMouseClicked

    private void addNovelty () {
        new JDAddNovelty(this.parent, true, route).setVisible(true);
    }
    
    private void end() {
        this.clear();
        this.setVisible(false);
        this.userPanel.setVisible(true);
        this.dispose();
    }

    private void endRoute() {
        String finalLocation = jTFinalLocation.getText();

        if (finalLocation.equals("")) {
            JOptionPane.showMessageDialog(this, "La ubicación final está vacía");
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
            Timestamp end = new Timestamp(new Date().getTime());
            Route route = new Route(this.route.getId(), end, finalLocation, distance);
            RouteJDBC routeJDBC = new RouteJDBC();
            routeJDBC.update(route);

            String msg = String.format("Has actualizado la ruta con id: %d%n",
                    this.route.getId());
            JOptionPane.showMessageDialog(this, msg);
            this.userPanel.loadRoutes();
            this.end();
        } catch (SQLException | RouteDataTooLongException ex) {
            ExceptionHandler.showErrorMsg(this, ex);
        }
    }

    private void clear() {
        jTFinalLocation.setText("");
        jTDistance.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddRoute;
    private javax.swing.JButton jBtnAddNolvety;
    private javax.swing.JLabel jLBack;
    private javax.swing.JLabel jLImage;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDistance;
    private javax.swing.JTextField jTFinalLocation;
    // End of variables declaration//GEN-END:variables
}
