/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mavenproject.mavenproject1.INTERFACES.ESTUDIANTES;

import java.awt.BorderLayout;
import java.awt.Dimension;
import mavenproject.mavenproject1.CLASES.Asignatura;
import mavenproject.mavenproject1.CLASES.Notas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author angel
 */
public class AdminCursoVentana extends javax.swing.JFrame {

    /**
     * Creates new form AdminCursoVentana
     */
    Notas es;
    int esCod;
    Asignatura asig;
    
    public AdminCursoVentana(Asignatura curso, int estudiante) {
        this.esCod = estudiante;
        this.asig = curso;
        this.es = ObtenerNota(this.esCod);
        initComponents();
        this.setVisible(true);                          // muestra ventana
        this.setLocationRelativeTo(null);               // centra la ventan
        this.setResizable(false);               // bloquea el redimensionamiento de la ventana
        this.setTitle("Grafico Notas");          // le da un titulo a la ventana
        this.setDefaultCloseOperation(AdminCursoVentana.EXIT_ON_CLOSE);   //cierra la ventana
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
        graficaBarras = new javax.swing.JPanel();
        RegresarButtom = new javax.swing.JButton();
        ActivarButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graficaBarrasLayout = new javax.swing.GroupLayout(graficaBarras);
        graficaBarras.setLayout(graficaBarrasLayout);
        graficaBarrasLayout.setHorizontalGroup(
            graficaBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        graficaBarrasLayout.setVerticalGroup(
            graficaBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        RegresarButtom.setForeground(new java.awt.Color(0, 0, 0));
        RegresarButtom.setText("Regresar");
        RegresarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtomActionPerformed(evt);
            }
        });

        ActivarButtom.setForeground(new java.awt.Color(0, 0, 0));
        ActivarButtom.setText("Activar Gráfica");
        ActivarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(graficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActivarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActivarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(graficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarButtomActionPerformed
        this.dispose();
    }//GEN-LAST:event_RegresarButtomActionPerformed

    private void ActivarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarButtomActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(this.es.nota, "Nota", this.asig.nombre);
        JFreeChart barChart = ChartFactory.createBarChart(
            "Grafico de notas",        // Título del gráfico
            "Eje X",       // Etiqueta del eje X
            "Eje Y",              // Etiqueta del eje Y
            dataset,                            // Conjunto de datos
            PlotOrientation.VERTICAL,   // Orientación del gráfico
            true,                       // Incluir leyenda
            true,                       // Incluir herramientas de información
            false                       // No incluir URLs de hipervínculos
        );
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(551, 346));
        graficaBarras.setLayout(new BorderLayout());
        graficaBarras.add(chartPanel, BorderLayout.NORTH);
    }//GEN-LAST:event_ActivarButtomActionPerformed
    
    private Notas ObtenerNota(int codigo) {
        for (Notas integrante : this.asig.integrantes) {
            if (integrante.estudiante == codigo) { 
                return integrante;
            }
        }
        return null;
    }
    /**
     * @param args the command line arguments
     */
    private AdminCursoVentana() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
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
            java.util.logging.Logger.getLogger(AdminCursoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCursoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCursoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCursoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCursoVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivarButtom;
    private javax.swing.JButton RegresarButtom;
    private javax.swing.JPanel graficaBarras;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
