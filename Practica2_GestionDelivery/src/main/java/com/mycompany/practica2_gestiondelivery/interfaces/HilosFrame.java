
package com.mycompany.practica2_gestiondelivery.interfaces;

import com.mycompany.practica2_gestiondelivery.AppState;
import com.mycompany.practica2_gestiondelivery.Entregas;
import com.mycompany.practica2_gestiondelivery.Vehiculo;
import com.mycompany.practica2_gestiondelivery.Velocidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author angel
 */
public class HilosFrame extends javax.swing.JFrame {
    
    // variables de clase
    Vehiculo repartidor1;
    Vehiculo repartidor2;
    Vehiculo repartidor3;
    int posY = 30;
    int posY2 = 126 + 30 + posY;
    int posY3 = 126 + 30 + posY2;
    Entregas rep1;
    Entregas rep2;
    Entregas rep3;
    
    public HilosFrame() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Control de Entregas");
        this.setDefaultCloseOperation(HilosFrame.EXIT_ON_CLOSE);
        
        this.repartidor1 = Vehiculo.getVehiculo("motocicleta 1", Vehiculo.viajesTemporales);
        this.repartidor2 = Vehiculo.getVehiculo("motocicleta 2", Vehiculo.viajesTemporales);
        this.repartidor3 = Vehiculo.getVehiculo("motocicleta 3", Vehiculo.viajesTemporales);
        kilometraje1.setText(Integer.toString(this.repartidor1.getDistanca()));
        kilometraje2.setText(Integer.toString(this.repartidor2.getDistanca()));
        kilometraje3.setText(Integer.toString(this.repartidor3.getDistanca()));
        
        // bloquear botones con actions listeners
        moto1Buttom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moto1Buttom.setEnabled(false);
                todosButtom.setEnabled(false);
            }
        });
        moto2Buttom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moto2Buttom.setEnabled(false);
                todosButtom.setEnabled(false);
            }
        });
        moto3Buttom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moto3Buttom.setEnabled(false);
                todosButtom.setEnabled(false);
            }
        });
        todosButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moto1Buttom.setEnabled(false);
                moto2Buttom.setEnabled(false);
                moto3Buttom.setEnabled(false);
                todosButtom.setEnabled(false);
            }
        });
        rep1 = new Entregas(this, 20, posY,"Motorista 1", Velocidad.BuscarVelocidad(this.repartidor1.getDistanca()));
        rep2 = new Entregas(this, 20, posY2,"Motorista 2", Velocidad.BuscarVelocidad(this.repartidor2.getDistanca()));
        rep3 = new Entregas(this, 20, posY3,"Motorista 3",Velocidad.BuscarVelocidad(this.repartidor3.getDistanca()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        todosButtom = new javax.swing.JButton();
        moto3Buttom = new javax.swing.JButton();
        moto2Buttom = new javax.swing.JButton();
        moto1Buttom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kilometraje1 = new javax.swing.JLabel();
        kilometraje2 = new javax.swing.JLabel();
        kilometraje3 = new javax.swing.JLabel();
        finButtom = new javax.swing.JButton();
        MetaLabel = new javax.swing.JLabel();
        MetaLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        todosButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        todosButtom.setForeground(new java.awt.Color(0, 0, 0));
        todosButtom.setText("Enviar a todos los repartidores");
        todosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosButtomActionPerformed(evt);
            }
        });

        moto3Buttom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moto3Buttom.setForeground(new java.awt.Color(0, 0, 0));
        moto3Buttom.setText("Enviar Motorista 3");
        moto3Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moto3ButtomActionPerformed(evt);
            }
        });

        moto2Buttom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moto2Buttom.setForeground(new java.awt.Color(0, 0, 0));
        moto2Buttom.setText("Enviar Motorista 2");
        moto2Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moto2ButtomActionPerformed(evt);
            }
        });

        moto1Buttom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moto1Buttom.setForeground(new java.awt.Color(0, 0, 0));
        moto1Buttom.setText("Enviar Motorista 1");
        moto1Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moto1ButtomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Distancia hacia el domicilio:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Distancia hacia el domicilio:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Distancia hacia el domicilio:");

        kilometraje1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kilometraje1.setForeground(new java.awt.Color(0, 0, 0));
        kilometraje1.setText("0 km");

        kilometraje2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kilometraje2.setForeground(new java.awt.Color(0, 0, 0));
        kilometraje2.setText("0 km");

        kilometraje3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kilometraje3.setForeground(new java.awt.Color(0, 0, 0));
        kilometraje3.setText("0 km");

        finButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finButtom.setForeground(new java.awt.Color(0, 0, 0));
        finButtom.setText("Finalizar entregas");
        finButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finButtom)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(moto1Buttom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kilometraje1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(moto3Buttom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kilometraje3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(moto2Buttom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kilometraje2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(todosButtom))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(todosButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilometraje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moto1Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilometraje2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moto2Buttom)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilometraje3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moto3Buttom)
                .addGap(65, 65, 65)
                .addComponent(finButtom)
                .addGap(27, 27, 27))
        );

        MetaLabel.setBackground(new java.awt.Color(255, 102, 102));
        MetaLabel.setOpaque(true);

        MetaLabel1.setBackground(new java.awt.Color(51, 153, 255));
        MetaLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MetaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE)
                .addComponent(MetaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MetaLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MetaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosButtomActionPerformed
        Thread hilo1 = new Thread(this.rep1);
        Thread hilo2 = new Thread(this.rep2);
        Thread hilo3 = new Thread(this.rep3);
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }//GEN-LAST:event_todosButtomActionPerformed

    private void moto1ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moto1ButtomActionPerformed
        Thread hilo1 = new Thread(this.rep1);
        hilo1.start();
    }//GEN-LAST:event_moto1ButtomActionPerformed

    private void finButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finButtomActionPerformed
        if(this.rep1.getEntregado() && this.rep2.getEntregado() && this.rep3.getEntregado()){
            this.repartidor1.setHoraEntrega(this.rep1.getfechaFin());
            Vehiculo.historialViajes.add(repartidor1);
            this.repartidor2.setHoraEntrega(this.rep2.getfechaFin());
            Vehiculo.historialViajes.add(repartidor2);
            this.repartidor3.setHoraEntrega(this.rep3.getfechaFin());
            Vehiculo.historialViajes.add(repartidor3);
            Vehiculo.viajesTemporales.clear();
            AppState.serializar();
            this.dispose();
            AdminFrame nuevaSesion = new AdminFrame();
        } else {
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(null, "Por favor, espere a que los motoristas lleguen como mínimo al domicilio", "Finalización temprana", JOptionPane.WARNING_MESSAGE);
            });
        }
    }//GEN-LAST:event_finButtomActionPerformed

    private void moto2ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moto2ButtomActionPerformed
        Thread hilo2 = new Thread(rep2);
        hilo2.start();
    }//GEN-LAST:event_moto2ButtomActionPerformed

    private void moto3ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moto3ButtomActionPerformed
        Thread hilo3 = new Thread(rep3);
        hilo3.start();
    }//GEN-LAST:event_moto3ButtomActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HilosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MetaLabel;
    private javax.swing.JLabel MetaLabel1;
    private javax.swing.JButton finButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kilometraje1;
    private javax.swing.JLabel kilometraje2;
    private javax.swing.JLabel kilometraje3;
    private javax.swing.JButton moto1Buttom;
    private javax.swing.JButton moto2Buttom;
    private javax.swing.JButton moto3Buttom;
    private javax.swing.JButton todosButtom;
    // End of variables declaration//GEN-END:variables
}
