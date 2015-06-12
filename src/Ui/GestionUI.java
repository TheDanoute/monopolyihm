/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ui;
import Jeu.*;
/**
 *
 * @author gueganb
 */
public class GestionUI extends javax.swing.JFrame {
    private Monopoly monop;
    private Joueur j;
    /**
     * Creates new form GestionUI
     */
    public GestionUI() {
        initComponents();
    }

    public GestionUI(Monopoly monop, Joueur j) {
        this.monop=monop;
        this.j=j;
        initComponents();
        setListProp();
    }
    
    private void setListProp (){
        listProp.clear();
        for (CarreauPropriete cp : j.getProprietes()){
            listProp.add(cp.getNom());
        }
    }
    
    private void setValues(){
        CarreauPropriete cp = monop.getCarreauPropriete(listProp.getSelectedItem());
        labelHypo.setText("Hypothéquer : "+cp.estHypothequer());
        labelLoyer.setText("Loyer : "+cp.getLoyer());
        labelPrixHypo.setText("Prix hypothèque : "+cp.getPrixHypotheque());
        if (cp.getClass().toString().equals("class Jeu.ProprieteAConstruire")){
            ProprieteAConstruire pac = (ProprieteAConstruire) cp;
            labelPrixCons.setText("Prix construction : "+pac.getPrixMaison());
        }else{
            labelPrixCons.setText("");
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listProp = new java.awt.List();
        vosprop = new java.awt.Label();
        buyHouse = new javax.swing.JButton();
        deleteHouse = new javax.swing.JButton();
        hypothequer = new javax.swing.JButton();
        leverhypo = new javax.swing.JButton();
        labelHypo = new javax.swing.JLabel();
        labelPrixHypo = new javax.swing.JLabel();
        labelPrixCons = new javax.swing.JLabel();
        labelLoyer = new javax.swing.JLabel();
        fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listProp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPropMouseClicked(evt);
            }
        });

        vosprop.setAlignment(java.awt.Label.CENTER);
        vosprop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        vosprop.setText("Vos propriétés");

        buyHouse.setText("Acheter maison");
        buyHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyHouseActionPerformed(evt);
            }
        });

        deleteHouse.setText("Détruire maison");
        deleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHouseActionPerformed(evt);
            }
        });

        hypothequer.setText("Hypothéquer");
        hypothequer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypothequerActionPerformed(evt);
            }
        });

        leverhypo.setText("Lever une hypothèque");
        leverhypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leverhypoActionPerformed(evt);
            }
        });

        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vosprop, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leverhypo)
                            .addComponent(hypothequer, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrixHypo)
                            .addComponent(labelHypo)
                            .addComponent(labelPrixCons)
                            .addComponent(labelLoyer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(fermer)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(vosprop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listProp, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHypo)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrixHypo)
                        .addGap(18, 18, 18)
                        .addComponent(labelLoyer)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrixCons)
                        .addGap(18, 18, 18)
                        .addComponent(buyHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteHouse)
                        .addGap(30, 30, 30)
                        .addComponent(hypothequer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leverhypo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fermer)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyHouseActionPerformed
        if (buyHouse.isEnabled() || listProp.getSelectedItem().getClass().toString().equals("class Jeu.ProprieteAConstruire")){
            CarreauPropriete cp = monop.getCarreauPropriete(listProp.getSelectedItem());
            ProprieteAConstruire pac = (ProprieteAConstruire) cp;
            pac.construire();
            setValues();
        }
    }//GEN-LAST:event_buyHouseActionPerformed

    private void deleteHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHouseActionPerformed
        if (deleteHouse.isEnabled() || listProp.getSelectedItem().getClass().toString().equals("class Jeu.ProprieteAConstruire")){
            CarreauPropriete cp = monop.getCarreauPropriete(listProp.getSelectedItem());
            ProprieteAConstruire pac = (ProprieteAConstruire) cp;
            pac.detruire();
            setValues();
        }
    }//GEN-LAST:event_deleteHouseActionPerformed

    private void hypothequerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypothequerActionPerformed
        if (hypothequer.isEnabled()){
            monop.getCarreauPropriete(listProp.getSelectedItem()).hypotheqer();
            setValues();
        }
    }//GEN-LAST:event_hypothequerActionPerformed

    private void leverhypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leverhypoActionPerformed
        if (leverhypo.isEnabled()){
            monop.getCarreauPropriete(listProp.getSelectedItem()).leverHypotheque();
            setValues();
        }
    }//GEN-LAST:event_leverhypoActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        if (fermer.isEnabled()){
            this.setVisible(false);
        }
    }//GEN-LAST:event_fermerActionPerformed

    private void listPropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPropMouseClicked
        setValues();
    }//GEN-LAST:event_listPropMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyHouse;
    private javax.swing.JButton deleteHouse;
    private javax.swing.JButton fermer;
    private javax.swing.JButton hypothequer;
    private javax.swing.JLabel labelHypo;
    private javax.swing.JLabel labelLoyer;
    private javax.swing.JLabel labelPrixCons;
    private javax.swing.JLabel labelPrixHypo;
    private javax.swing.JButton leverhypo;
    private java.awt.List listProp;
    private java.awt.Label vosprop;
    // End of variables declaration//GEN-END:variables
}
