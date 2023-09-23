/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mavenproject.mavenproject1.INTERFACES.ADMIN;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static mavenproject.mavenproject1.CLASES.Profesor.listadoProfesores;
import mavenproject.mavenproject1.CLASES.Profesor;

/**
 *
 * @author angel
 */
public class RemoverProfesor_Ventana extends javax.swing.JFrame {
    
    public RemoverProfesor_Ventana() {
        initComponents();
        this.setVisible(true);              // muestra ventana
        this.setLocationRelativeTo(null);   // centra la ventan
        this.setResizable(false);     // bloquea el redimensionamiento de la ventana
        this.setTitle("Remover un Profesor");          // le da un titulo a la ventana
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
        jLabel1 = new javax.swing.JLabel();
        RegresarButtom = new javax.swing.JButton();
        RemoverButtom = new javax.swing.JButton();
        codigoField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        BuscarButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el código del Profesor que desea remover:");

        RegresarButtom.setForeground(new java.awt.Color(0, 0, 0));
        RegresarButtom.setText("Regresar");
        RegresarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtomActionPerformed(evt);
            }
        });

        RemoverButtom.setForeground(new java.awt.Color(0, 0, 0));
        RemoverButtom.setText("Remover");
        RemoverButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtomActionPerformed(evt);
            }
        });

        codigoField.setForeground(new java.awt.Color(0, 0, 0));
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });

        TablaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TablaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido", "Correo", "Género"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaUsuario);

        BuscarButtom.setForeground(new java.awt.Color(0, 0, 0));
        BuscarButtom.setText("Buscar Profesor");
        BuscarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RegresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RemoverButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(codigoField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoverButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    int codigo = 0;
    Profesor p = null;
    
    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
            
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void RemoverButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtomActionPerformed
        for (int i = 0; i < listadoProfesores.size(); i++) {
            if(codigo == listadoProfesores.get(i).codigo){
                listadoProfesores.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha removido al profesor", "Remover Profesor", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }      
    }//GEN-LAST:event_RemoverButtomActionPerformed

    private void BuscarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtomActionPerformed
        try {
            String auxCodigo = codigoField.getText();
            codigo = Integer.parseInt(auxCodigo);           
            for (Profesor u : listadoProfesores) {
                if(u.codigo == codigo){
                    p = u;
                    codigo = u.codigo;
                }
            }
            llenarTablaDatos(p);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solamente digitos", "Error al ingresar código del Profesor", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_BuscarButtomActionPerformed

    private void RegresarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarButtomActionPerformed
        this.dispose();
    }//GEN-LAST:event_RegresarButtomActionPerformed

    private void llenarTablaDatos(Profesor p){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Género");
        Object[] filaDatos = { p.codigo, p.nombre, p.apellido, p.correo, p.genero};
        modeloTabla.addRow(filaDatos);
        TablaUsuario.setModel(modeloTabla);
    }
    
    
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
            java.util.logging.Logger.getLogger(RemoverProfesor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverProfesor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverProfesor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverProfesor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProfesor_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButtom;
    private javax.swing.JButton RegresarButtom;
    private javax.swing.JButton RemoverButtom;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JTextField codigoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}