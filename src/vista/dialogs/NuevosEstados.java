/* 
 *  Copyright (C) 2011  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package vista.dialogs;

import controlador.dialogs.ControllerNE;
import javax.swing.JOptionPane;

public class NuevosEstados extends javax.swing.JDialog {
    private ControllerNE controlador;
    
    public NuevosEstados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        controlador=new ControllerNE();
        initComponents();
        this.setLocationRelativeTo(parent);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textQ = new javax.swing.JTextField();
        botonOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevos Estados");

        jLabel1.setText("Cantidad de estados (Q) del AFD:");

        botonOk.setText("Ok");
        botonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkActionPerformed
        // TODO add your handling code here:
        try{
            controlador.ingresarEstados(Integer.parseInt(textQ.getText()));
            this.dispose();
        }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(this, "Debe ingresar un número entero", "ERROR", JOptionPane.ERROR_MESSAGE);                   
        }                
    }//GEN-LAST:event_botonOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textQ;
    // End of variables declaration//GEN-END:variables
}