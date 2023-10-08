/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mavenproject.mavenproject1.INTERFACES.PROFESOR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import mavenproject.mavenproject1.CLASES.Actividades;
import static mavenproject.mavenproject1.CLASES.AppState.*;
import mavenproject.mavenproject1.CLASES.Asignatura;
import static mavenproject.mavenproject1.CLASES.Asignatura.listadoAsignaturas;
import mavenproject.mavenproject1.CLASES.Estudiante;
import mavenproject.mavenproject1.CLASES.Notas;

/**
 *
 * @author angel
 */
public class AdminCursoVentana extends javax.swing.JFrame {

    /**
     * Creates new form AdminCursoVentana
     */
    Asignatura c;
    
    public AdminCursoVentana(int codigoCurso) {
        initComponents();
        obtenerCurso (codigoCurso);
        this.llenarTabla("actividades");
        this.llenarTabla("estudiantes");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cursoLabel.setText(this.c.nombre);
        this.setDefaultCloseOperation(AdminCursoVentana.EXIT_ON_CLOSE);
    }

    public void obtenerCurso (int cod){
        for (Asignatura curso : listadoAsignaturas) {
            if(curso.codigo == cod){
                this.c = curso;
            }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActividades = new javax.swing.JTable();
        MasivaAlumnosButtom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cursoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstudiantesCurso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        LabelDinamicoNotas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreFIELD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descripcionFIELD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ponderacionFIELD = new javax.swing.JTextField();
        MasivaNotasButtom = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        top5mejores = new javax.swing.JButton();
        top5peores = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CrearAcrividad = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        tablaActividades.setBackground(new java.awt.Color(255, 255, 255));
        tablaActividades.setForeground(new java.awt.Color(0, 0, 0));
        tablaActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Ponderación", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaActividades);

        MasivaAlumnosButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MasivaAlumnosButtom.setForeground(new java.awt.Color(0, 0, 0));
        MasivaAlumnosButtom.setText("Carga Masiva Alumnos");
        MasivaAlumnosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasivaAlumnosButtomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REPORTES");

        cursoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cursoLabel.setForeground(new java.awt.Color(0, 0, 0));
        cursoLabel.setText("NOMBRE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado de Alumnos asignados");

        tablaEstudiantesCurso.setBackground(new java.awt.Color(255, 255, 255));
        tablaEstudiantesCurso.setForeground(new java.awt.Color(0, 0, 0));
        tablaEstudiantesCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido", "Acciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEstudiantesCurso);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Acunulado");

        LabelDinamicoNotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDinamicoNotas.setForeground(new java.awt.Color(0, 0, 0));
        LabelDinamicoNotas.setText("0/10");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Actividades del curso");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre");

        nombreFIELD.setBackground(new java.awt.Color(255, 255, 255));
        nombreFIELD.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Descripción");

        descripcionFIELD.setBackground(new java.awt.Color(255, 255, 255));
        descripcionFIELD.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ponderación");

        ponderacionFIELD.setBackground(new java.awt.Color(255, 255, 255));
        ponderacionFIELD.setForeground(new java.awt.Color(0, 0, 0));

        MasivaNotasButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MasivaNotasButtom.setForeground(new java.awt.Color(0, 0, 0));
        MasivaNotasButtom.setText("Carga masiva de notas");
        MasivaNotasButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasivaNotasButtomActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Notas");

        top5mejores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        top5mejores.setForeground(new java.awt.Color(0, 0, 0));
        top5mejores.setText("TOP 5 mejores alumnos");
        top5mejores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top5mejoresActionPerformed(evt);
            }
        });

        top5peores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        top5peores.setForeground(new java.awt.Color(0, 0, 0));
        top5peores.setText("TOP 5 peroes alumnos");
        top5peores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top5peoresActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Crear Acrividad del curso");

        CrearAcrividad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CrearAcrividad.setForeground(new java.awt.Color(0, 0, 0));
        CrearAcrividad.setText("Crear actividad");
        CrearAcrividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAcrividadActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MasivaAlumnosButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(top5mejores)
                                        .addGap(2, 2, 2)
                                        .addComponent(top5peores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(descripcionFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ponderacionFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombreFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CrearAcrividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MasivaNotasButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelDinamicoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDinamicoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponderacionFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MasivaNotasButtom)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearAcrividad)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MasivaAlumnosButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(top5mejores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top5peores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        serializar();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void top5mejoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top5mejoresActionPerformed
        Comparator<Notas> comparador = Collections.reverseOrder();
        Collections.sort(this.c.integrantes, comparador);
        File carpeta = new File("./reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        String contenido = this.generarHTML();
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("./reportes/TopMejoresCinco.html");
            fileWriter.write(contenido);
            fileWriter.close();            
            String mensaje = "Reporte del TOP5 mejores estudiantes fue generado en la carpeta \"Reportes\" dentro del proyecto ";
            JOptionPane.showMessageDialog(this, mensaje, "alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_top5mejoresActionPerformed

    private void MasivaAlumnosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasivaAlumnosButtomActionPerformed
        JFileChooser exploradorArchivos = new JFileChooser();
        exploradorArchivos.setMultiSelectionEnabled(true);
        FileNameExtensionFilter FiltroCsv = new FileNameExtensionFilter("archivo csv", "csv");
        exploradorArchivos.setFileFilter(FiltroCsv);
        int exploradorArchivosState = exploradorArchivos.showOpenDialog(this);
        if (exploradorArchivosState == JFileChooser.APPROVE_OPTION) {
            File[] archivo = exploradorArchivos.getSelectedFiles();
            for (File u : archivo) {
                try {
                    BufferedReader lector = new BufferedReader(new FileReader(u));
                    String linea = "";
                    while((linea = lector.readLine()) != null ){
                        String[] datos = linea.split(",");
                        int codigo_Estudiante = Integer.parseInt(datos[0]);
                        ObtenerEstudiantes(codigo_Estudiante);
                        //como no asignamos notas entonces por eso es cero
                        Notas alumno = new Notas(codigo_Estudiante, 0);
                        this.c.integrantes.add(alumno);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error mientras se cargaban los datos", "Carga de Archivos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        llenarTabla("estudiantes");
    }//GEN-LAST:event_MasivaAlumnosButtomActionPerformed

    private void MasivaNotasButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasivaNotasButtomActionPerformed
        JFileChooser exploradorArchivos = new JFileChooser();
        exploradorArchivos.setMultiSelectionEnabled(true);
        FileNameExtensionFilter FiltroCsv = new FileNameExtensionFilter("archivo csv", "csv");
        exploradorArchivos.setFileFilter(FiltroCsv);
        int exploradorArchivosState = exploradorArchivos.showOpenDialog(this);
        if (exploradorArchivosState == JFileChooser.APPROVE_OPTION) {
            File[] archivo = exploradorArchivos.getSelectedFiles();
            for (File u : archivo) {
                try {
                    BufferedReader lector = new BufferedReader(new FileReader(u));
                    String linea = "";
                    while((linea = lector.readLine()) != null ){
                        String[] datos = linea.split(",");
                        int codigo_Estudiante = Integer.parseInt(datos[0]);
                        float estudiante_nota = Float.parseFloat(datos[1]);
                        asignarNota(codigo_Estudiante, estudiante_nota);
                    }
                    JOptionPane.showMessageDialog(null, "Se han actualizado los datos de notas", "Actualizar notas", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error mientras se cargaban los datos", "Carga de Archivos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_MasivaNotasButtomActionPerformed

    int totalPuntos = 0;
    private void CrearAcrividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAcrividadActionPerformed
        try {
            String nombre = nombreFIELD.getText();
            String descripcion = descripcionFIELD.getText();
            int ponderacion = Integer.parseInt(ponderacionFIELD.getText());
            if(totalPuntos <= 100){
                if(ponderacion>0 && ponderacion<=(100-totalPuntos)){
                    this.c.actividadesAsignatura.add(new Actividades(nombre, descripcion, ponderacion));
                    this.totalPuntos += ponderacion;
                    LabelDinamicoNotas.setText(this.totalPuntos+"/100");
                } else {
                    JOptionPane.showMessageDialog(null,"Ingresé solamente números mayores a cero o iguales a "+(100-totalPuntos)+"en ponderación", "Valores Incorrectos", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,"La ponderación ha llegado a cien, no pueden subirse más actividades", "Limite de actividades", JOptionPane.ERROR_MESSAGE);
            }
            this.llenarTabla("actividades");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingresé solamente números en el apartado de ponderación", "Valores Incorrectos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearAcrividadActionPerformed

    private void top5peoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top5peoresActionPerformed
        Collections.sort(this.c.integrantes);
        File carpeta = new File("./reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        String contenido = this.generarHTML();
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("./reportes/TopPeoresCinco.html");
            fileWriter.write(contenido);
            fileWriter.close();            
            String mensaje = "Reporte del TOP5 peores estudiantes fue generado en la carpeta \"Reportes\" dentro del proyecto ";
            JOptionPane.showMessageDialog(this, mensaje, "alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_top5peoresActionPerformed
    
    
    public void asignarNota(int alumno, float nota){
        for (int i = 0; i < this.c.integrantes.size(); i++) {
            Notas objeto = this.c.integrantes.get(i);
            if(alumno == objeto.estudiante){
                objeto.estudiante = alumno;
                objeto.nota = nota;
                this.c.integrantes.set(i, objeto);
                break;
            }
        }
    }
    
    private void ObtenerEstudiantes(int codigo) {
        for (Estudiante estudiante : Estudiante.listadoEstudiantes) {
            if (estudiante.codigo == codigo) { 
                this.estudiantes.add(estudiante);
                break;
            }
        }
    }
    
    
    private Notas ObtenerNota(int codigo) {
        for (Notas integrante : this.c.integrantes) {
            if (integrante.estudiante == codigo) { 
                return integrante;
            }
        }
        return null;
    }
    
    private Estudiante enlazarEstudiantes(int codigo){
        for (Estudiante es : Estudiante.listadoEstudiantes) {
            if(es.codigo == codigo){
                return es;
            }
        }
        return null;
    }
    
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    private void llenarTabla(String imprimir){
        if(imprimir.equalsIgnoreCase("actividades")){
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("descripción");
            modeloTabla.addColumn("Ponderación");
            modeloTabla.addColumn("Promedio");
            for (Actividades a : this.c.actividadesAsignatura) {
                float promedio = (100-a.ponderacion)/100;
                Object[] filaDatos = {a.nombre, a.descripcion, a.ponderacion, promedio};
                modeloTabla.addRow(filaDatos);
            }
            tablaActividades.setModel(modeloTabla);
        }else{
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Acciones");
            for (Notas integrante : this.c.integrantes) {
                Estudiante es = enlazarEstudiantes(integrante.estudiante);
                Object[] filaDatos = { integrante.estudiante, es.nombre, es.apellido, "editar info."};
                modeloTabla.addRow(filaDatos);
                
            }
            tablaEstudiantesCurso.setModel(modeloTabla);
        }
    }
    
    private String generarHTML(){
        StringBuilder sb = new StringBuilder();        
        sb.append("<table border=\"1\" cellspacing=\"0\">\n");
        sb.append("<tr>\n");
        sb.append("<th>\n").append("TOP 5").append("</th>\n");
        sb.append("<th>\n").append("Codigo del alumno").append("</th>\n");        
        sb.append("<th>\n").append("Nombre del alumno").append("</th>\n");
        sb.append("<th>\n").append("Apellido del alumno").append("</th>\n");
        sb.append("<th>\n").append("nota del alumno").append("</th>\n");
        sb.append("</ts>\n");
        int elementosAMostrar = Math.min(estudiantes.size(), 5);
        for (int i = 0; i < elementosAMostrar; i++) {
            sb.append("<tr>\n");
            sb.append("<th>\n").append(i+1).append("</th>");
            sb.append("<th>\n").append(this.c.integrantes.get(i).estudiante).append("</th>");
            sb.append("<th>\n").append( enlazarEstudiantes(this.c.integrantes.get(i).estudiante).nombre).append("</th>");
            sb.append("<th>\n").append( enlazarEstudiantes(this.c.integrantes.get(i).estudiante).apellido).append("</th>");
            sb.append("<th>\n").append(this.c.integrantes.get(i).nota).append("</th>");
            sb.append("</tr>\n");
        }
        sb.append("</table>\n");
        return sb.toString();
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
    private javax.swing.JButton CrearAcrividad;
    private javax.swing.JLabel LabelDinamicoNotas;
    private javax.swing.JButton MasivaAlumnosButtom;
    private javax.swing.JButton MasivaNotasButtom;
    private javax.swing.JLabel cursoLabel;
    private javax.swing.JTextField descripcionFIELD;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreFIELD;
    private javax.swing.JTextField ponderacionFIELD;
    private javax.swing.JTable tablaActividades;
    private javax.swing.JTable tablaEstudiantesCurso;
    private javax.swing.JButton top5mejores;
    private javax.swing.JButton top5peores;
    // End of variables declaration//GEN-END:variables
}