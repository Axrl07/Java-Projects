
package mavenproject.mavenproject1.INTERFACES.ADMIN;

import java.awt.BorderLayout;
import java.awt.Dimension;
import mavenproject.mavenproject1.INTERFACES.LoginVentana;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import mavenproject.mavenproject1.CLASES.*;
import static mavenproject.mavenproject1.CLASES.AppState.*;
import static mavenproject.mavenproject1.CLASES.Asignatura.listadoAsignaturas;
import static mavenproject.mavenproject1.CLASES.Estudiante.listadoEstudiantes;
import static mavenproject.mavenproject1.CLASES.Profesor.listadoProfesores;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class adminVentana extends javax.swing.JFrame {
    
    public adminVentana() {
        deserializar();
        initComponents();
        this.setVisible(true);              // muestra ventana
        this.setLocationRelativeTo(null);   // centra la ventan
        this.setResizable(false);     // bloquea el redimensionamiento de la ventana
        this.setTitle("Administrador");          // le da un titulo a la ventana
        llenarTabla("profesor");
        generarGrafica("profesor");
        llenarTabla("curso");
        generarGrafica("curso");
        llenarTabla("estudiantes");
        generarGrafica("estudiantes");
        this.setDefaultCloseOperation(adminVentana.EXIT_ON_CLOSE);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelProf = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProfesor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MasivaProfesorButtom = new javax.swing.JButton();
        ActualizarProfesoresButtom = new javax.swing.JButton();
        CrearProfesorButtom = new javax.swing.JButton();
        EliminarProfesorButtom = new javax.swing.JButton();
        ExportarProfesorButtom = new javax.swing.JButton();
        ActualizarTablaProfesorButtom = new javax.swing.JButton();
        graficaPieProfes = new javax.swing.JPanel();
        PanelCursos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAsignaturas = new javax.swing.JTable();
        ExportarCursoButtom = new javax.swing.JButton();
        ActualizarTablaCursoButtom = new javax.swing.JButton();
        eliminarCursoButtom = new javax.swing.JButton();
        MasivaCursoButtom = new javax.swing.JButton();
        actualizarCursoButtom = new javax.swing.JButton();
        crearCursoButtom = new javax.swing.JButton();
        graficaBarras = new javax.swing.JPanel();
        PanelAlum = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        ExportarEstudiantesButtom = new javax.swing.JButton();
        MasivaEstudiantesButtom = new javax.swing.JButton();
        ActualizarTablaEstudiantesButtom = new javax.swing.JButton();
        graficaPieEstudiantes = new javax.swing.JPanel();
        RegresarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelProf.setBackground(new java.awt.Color(0, 0, 0));

        TablaProfesor.setBackground(new java.awt.Color(255, 255, 255));
        TablaProfesor.setForeground(new java.awt.Color(0, 0, 0));
        TablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
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
        jScrollPane1.setViewportView(TablaProfesor);

        jLabel1.setFont(new java.awt.Font("Hurmit Nerd Font", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado Oficial de Profesores:");

        MasivaProfesorButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MasivaProfesorButtom.setForeground(new java.awt.Color(0, 0, 0));
        MasivaProfesorButtom.setText("Carga Masiva de Profesores");
        MasivaProfesorButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasivaProfesorButtomActionPerformed(evt);
            }
        });

        ActualizarProfesoresButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarProfesoresButtom.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarProfesoresButtom.setText("Actualizar Profesor");
        ActualizarProfesoresButtom.setToolTipText("");
        ActualizarProfesoresButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarProfesoresButtomActionPerformed(evt);
            }
        });

        CrearProfesorButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CrearProfesorButtom.setForeground(new java.awt.Color(0, 0, 0));
        CrearProfesorButtom.setText("Crear Profesor");
        CrearProfesorButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfesorButtomActionPerformed(evt);
            }
        });

        EliminarProfesorButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EliminarProfesorButtom.setForeground(new java.awt.Color(0, 0, 0));
        EliminarProfesorButtom.setText("Eliminar Profesor");
        EliminarProfesorButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProfesorButtomActionPerformed(evt);
            }
        });

        ExportarProfesorButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExportarProfesorButtom.setForeground(new java.awt.Color(0, 0, 0));
        ExportarProfesorButtom.setText("Exportar Listado a PDF");
        ExportarProfesorButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarProfesorButtomActionPerformed(evt);
            }
        });

        ActualizarTablaProfesorButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarTablaProfesorButtom.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarTablaProfesorButtom.setText("Actualizar Tabla");
        ActualizarTablaProfesorButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaProfesorButtomActionPerformed(evt);
            }
        });

        graficaPieProfes.setPreferredSize(new java.awt.Dimension(300, 445));

        javax.swing.GroupLayout graficaPieProfesLayout = new javax.swing.GroupLayout(graficaPieProfes);
        graficaPieProfes.setLayout(graficaPieProfesLayout);
        graficaPieProfesLayout.setHorizontalGroup(
            graficaPieProfesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficaPieProfesLayout.setVerticalGroup(
            graficaPieProfesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelProfLayout = new javax.swing.GroupLayout(PanelProf);
        PanelProf.setLayout(PanelProfLayout);
        PanelProfLayout.setHorizontalGroup(
            PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProfLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelProfLayout.createSequentialGroup()
                                .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ActualizarTablaProfesorButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CrearProfesorButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EliminarProfesorButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ActualizarProfesoresButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MasivaProfesorButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExportarProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(graficaPieProfes, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProfLayout.setVerticalGroup(
            PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProfLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CrearProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActualizarProfesoresButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EliminarProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MasivaProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActualizarTablaProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExportarProfesorButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelProfLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graficaPieProfes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesores", PanelProf);
        PanelProf.getAccessibleContext().setAccessibleName("TabProfesores");

        PanelCursos.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Hurmit Nerd Font", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado Oficial de Cursos:");

        TablaAsignaturas.setBackground(new java.awt.Color(255, 255, 255));
        TablaAsignaturas.setForeground(new java.awt.Color(0, 0, 0));
        TablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad Alumnos", "Creditos", "Profesor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaAsignaturas);

        ExportarCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExportarCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        ExportarCursoButtom.setText("Exportar Listado a PDF");
        ExportarCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarCursoButtomActionPerformed(evt);
            }
        });

        ActualizarTablaCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarTablaCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarTablaCursoButtom.setText("Actualizar Tabla");
        ActualizarTablaCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaCursoButtomActionPerformed(evt);
            }
        });

        eliminarCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        eliminarCursoButtom.setText("Eliminar Asignatura");
        eliminarCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCursoButtomActionPerformed(evt);
            }
        });

        MasivaCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MasivaCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        MasivaCursoButtom.setText("Carga Masiva de Asignaturas");
        MasivaCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasivaCursoButtomActionPerformed(evt);
            }
        });

        actualizarCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualizarCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        actualizarCursoButtom.setText("Actualizar Asignatura");
        actualizarCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarCursoButtomActionPerformed(evt);
            }
        });

        crearCursoButtom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearCursoButtom.setForeground(new java.awt.Color(0, 0, 0));
        crearCursoButtom.setText("Crear Asignatura");
        crearCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCursoButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graficaBarrasLayout = new javax.swing.GroupLayout(graficaBarras);
        graficaBarras.setLayout(graficaBarrasLayout);
        graficaBarrasLayout.setHorizontalGroup(
            graficaBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        graficaBarrasLayout.setVerticalGroup(
            graficaBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCursosLayout = new javax.swing.GroupLayout(PanelCursos);
        PanelCursos.setLayout(PanelCursosLayout);
        PanelCursosLayout.setHorizontalGroup(
            PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCursosLayout.createSequentialGroup()
                .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCursosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCursosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCursosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ActualizarTablaCursoButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crearCursoButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarCursoButtom, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(actualizarCursoButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MasivaCursoButtom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExportarCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCursosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(graficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCursosLayout.setVerticalGroup(
            PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCursosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(PanelCursosLayout.createSequentialGroup()
                        .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualizarCursoButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MasivaCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActualizarTablaCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExportarCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cursos", PanelCursos);
        PanelCursos.getAccessibleContext().setAccessibleName("TabCursos");

        PanelAlum.setBackground(new java.awt.Color(255, 204, 0));

        jLabel3.setFont(new java.awt.Font("Hurmit Nerd Font", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado Oficial de Alumnos:");

        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Género"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaEstudiantes);

        ExportarEstudiantesButtom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExportarEstudiantesButtom.setForeground(new java.awt.Color(0, 0, 0));
        ExportarEstudiantesButtom.setText("Exportar Listado a PDF");
        ExportarEstudiantesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarEstudiantesButtomActionPerformed(evt);
            }
        });

        MasivaEstudiantesButtom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MasivaEstudiantesButtom.setForeground(new java.awt.Color(0, 0, 0));
        MasivaEstudiantesButtom.setText("Carga Masiva");
        MasivaEstudiantesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasivaEstudiantesButtomActionPerformed(evt);
            }
        });

        ActualizarTablaEstudiantesButtom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ActualizarTablaEstudiantesButtom.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarTablaEstudiantesButtom.setText("Actualizar Tabla");
        ActualizarTablaEstudiantesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaEstudiantesButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graficaPieEstudiantesLayout = new javax.swing.GroupLayout(graficaPieEstudiantes);
        graficaPieEstudiantes.setLayout(graficaPieEstudiantesLayout);
        graficaPieEstudiantesLayout.setHorizontalGroup(
            graficaPieEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficaPieEstudiantesLayout.setVerticalGroup(
            graficaPieEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelAlumLayout = new javax.swing.GroupLayout(PanelAlum);
        PanelAlum.setLayout(PanelAlumLayout);
        PanelAlumLayout.setHorizontalGroup(
            PanelAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumLayout.createSequentialGroup()
                .addGroup(PanelAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAlumLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAlumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExportarEstudiantesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(MasivaEstudiantesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ActualizarTablaEstudiantesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(graficaPieEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        PanelAlumLayout.setVerticalGroup(
            PanelAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(PanelAlumLayout.createSequentialGroup()
                        .addComponent(MasivaEstudiantesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ActualizarTablaEstudiantesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportarEstudiantesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graficaPieEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alumnos", PanelAlum);
        PanelAlum.getAccessibleContext().setAccessibleName("TabAlumnos");

        RegresarLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegresarLogin.setForeground(new java.awt.Color(0, 0, 0));
        RegresarLogin.setText("Regresar al inicio de sesión");
        RegresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //LLENAR Y EXPORTAR
    private String generarHTML(String clase){
        StringBuilder sb = new StringBuilder();        
        // se abre la tabla en formato html
        sb.append("<table border=\"1\" cellspacing=\"0\">\n");
        //for que imprime elementos exportados ya sea profesor o alumno
        if (clase.equalsIgnoreCase("profesor")) {
            // nombres de columnas
            sb.append("<tr>\n");
            sb.append("<th>\n").append("Codigo del profesor").append("</th>\n");        
            sb.append("<th>\n").append("Nombre del profesor").append("</th>\n");
            sb.append("<th>\n").append("Apellido del profesor").append("</th>\n");
            sb.append("<th>\n").append("correo del profesor").append("</th>\n");
            sb.append("<th>\n").append("genero del profesor").append("</th>\n");
            sb.append("</ts>\n");
            for (Profesor p : listadoProfesores) {
                sb.append("<tr>\n");
                sb.append("<th>\n").append(p.codigo).append("</th>");
                sb.append("<th>\n").append(p.nombre).append("</th>");
                sb.append("<th>\n").append(p.apellido).append("</th>");
                sb.append("<th>\n").append(p.correo).append("</th>");
                sb.append("<th>\n").append(p.genero).append("</th>");
                sb.append("</tr>\n");
            }
        } else if(clase.equalsIgnoreCase("curso")){
            // nombres de columnas
            sb.append("<tr>\n");
            sb.append("<th>\n").append("Codigo del curso").append("</th>\n");
            sb.append("<th>\n").append("Nombre del curso").append("</th>\n");   
            sb.append("<th>\n").append("Cantidad de alumnos").append("</th>\n");   
            sb.append("<th>\n").append("Creditos del curso").append("</th>\n");
            sb.append("<th>\n").append("Profesor del curso").append("</th>\n");
            sb.append("</ts>\n");
            for (Asignatura c : listadoAsignaturas) {
                sb.append("<tr>\n");
                sb.append("<th>\n").append(c.codigo).append("</th>");
                sb.append("<th>\n").append(c.nombre).append("</th>");
                sb.append("<th>\n").append(c.integrantes.size()).append("</th>");
                sb.append("<th>\n").append(c.creditos).append("</th>");
                sb.append("<th>\n").append(enlace_CodigoProf(c.profesor).nombre).append("</th>");                
                sb.append("</tr>\n");
            }
        } else {
            // nombres de columnas
            sb.append("<tr>\n");
            sb.append("<th>\n").append("Codigo del estudiante").append("</th>\n");        
            sb.append("<th>\n").append("Nombre del estudiante").append("</th>\n");
            sb.append("<th>\n").append("Apellido del estudiante").append("</th>\n");
            sb.append("<th>\n").append("correo del estudiante").append("</th>\n");
            sb.append("<th>\n").append("genero del estudiante").append("</th>\n");
            sb.append("</ts>\n");
            for (Estudiante e : listadoEstudiantes) {
                sb.append("<tr>\n");
                sb.append("<th>\n").append(e.codigo).append("</th>");
                sb.append("<th>\n").append(e.nombre).append("</th>");
                sb.append("<th>\n").append(e.apellido).append("</th>");
                sb.append("<th>\n").append(e.correo).append("</th>");
                sb.append("<th>\n").append(e.genero).append("</th>");
                sb.append("</tr>\n");
            }
        }
        //etiqueta de cierre y return de construcción
        sb.append("</table>\n");
        return sb.toString();
    }    
    private void llenarTabla(String clase){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        if(clase.equalsIgnoreCase("profesor")){
            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Género");
            for (Profesor prof : listadoProfesores) {
                Object[] filaDatos = {prof.codigo, prof.nombre, prof.apellido, prof.correo, prof.genero};
                modeloTabla.addRow(filaDatos);
            }
            TablaProfesor.setModel(modeloTabla);
        } else if(clase.equalsIgnoreCase("curso")){
            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Cantidad Alumnos");
            modeloTabla.addColumn("Créditos");
            modeloTabla.addColumn("Profesor que imparte el curso");
            for (Asignatura asig : listadoAsignaturas) {
                Object[] filaDatos = {asig.codigo, asig.nombre, asig.integrantes.size() , asig.creditos, enlace_CodigoProf(asig.profesor).nombre};
                modeloTabla.addRow(filaDatos);
            }
            TablaAsignaturas.setModel(modeloTabla);
        }else{
            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Género");
            for (Estudiante estu : listadoEstudiantes) {
                Object[] filaDatos = {estu.codigo, estu.nombre, estu.apellido, estu.correo, estu.genero};
                modeloTabla.addRow(filaDatos);
            }
            TablaEstudiantes.setModel(modeloTabla);
        }
    }
    public void generarGrafica(String algo) {
        if(algo.equalsIgnoreCase("profesor")){
            int hombres = 0;
            int mujeres = 0;
            for (Profesor profe : listadoProfesores) {
                if(profe.genero == 'm'){
                    hombres += 1;
                }else{
                    mujeres += 1;
                }
            }
            DefaultPieDataset datos = new DefaultPieDataset();
            datos.setValue("Hombres", hombres);
            datos.setValue("Mujeres", mujeres);
            JFreeChart PieProfesores = ChartFactory.createPieChart(
            "Número de docentes hombres y mujeres",     //nombre
                    datos,                             //datos 
                    true,                              //categorias
                    true,                             //herramientas
                    false                               //generacion URL
            );
            ChartPanel chartPanel = new ChartPanel(PieProfesores);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setPreferredSize(new Dimension(300,445));
            graficaPieProfes.setLayout(new BorderLayout());
            graficaPieProfes.add(chartPanel, BorderLayout.NORTH);
        }else if(algo.equalsIgnoreCase("curso")){
            Comparator<Asignatura> comparador = Collections.reverseOrder();
            Collections.sort(listadoAsignaturas, comparador);
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(listadoAsignaturas.get(0).integrantes.size(), "Notas", listadoAsignaturas.get(0).nombre);
            dataset.setValue(listadoAsignaturas.get(1).integrantes.size(), "Notas", listadoAsignaturas.get(1).nombre);
            dataset.setValue(listadoAsignaturas.get(2).integrantes.size(), "Notas", listadoAsignaturas.get(2).nombre);
            JFreeChart barChart = ChartFactory.createBarChart(
                "Top 3 cursos con más estudiantes",        // Título del gráfico
                "Eje X",       // Etiqueta del eje X
                "Eje Y",              // Etiqueta del eje Y
                dataset,                            // Conjunto de datos
                PlotOrientation.VERTICAL,   // Orientación del gráfico
                true,                       // Incluir leyenda
                true,                       // Incluir herramientas de información
                false                       // No incluir URLs de hipervínculos
            );
            ChartPanel chartPanel = new ChartPanel(barChart);
            chartPanel.setPreferredSize(new Dimension(392, 458));
            graficaBarras.setLayout(new BorderLayout());
            graficaBarras.add(chartPanel, BorderLayout.NORTH);
        } else {
            int masculino = 0;
            int femenino = 0;
            for (Estudiante es : listadoEstudiantes) {
                if(es.genero == 'm'){
                    masculino += 1;
                }else{
                    femenino += 1;
                }
            }
            DefaultPieDataset datos = new DefaultPieDataset();
            datos.setValue("Hombres", masculino);
            datos.setValue("Mujeres", femenino);
            JFreeChart PieProfesores = ChartFactory.createPieChart(
            "Número de estudiantes hombres y mujeres",     //nombre
                    datos,                             //datos 
                    true,                              //categorias
                    true,                             //herramientas
                    false                               //generacion URL
            );
            ChartPanel chartPanel = new ChartPanel(PieProfesores);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setPreferredSize(new Dimension(300,445));
            graficaPieEstudiantes.setLayout(new BorderLayout());
            graficaPieEstudiantes.add(chartPanel, BorderLayout.NORTH);
        }
    }
    // Enlaza el codigo profesor con el nombre
    public static Profesor enlace_CodigoProf(int CodigoProf){
        for (Profesor p : listadoProfesores) {
            if (p.codigo == CodigoProf) {
                return p;
            }
        }
        return null;
    }
    
    
    // REGRESAR
    private void RegresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarLoginActionPerformed
        serializar();
        LoginVentana accederLogin = new LoginVentana();
        this.dispose();
    }//GEN-LAST:event_RegresarLoginActionPerformed
    
    //PROFESOR
    private void CrearProfesorButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfesorButtomActionPerformed
        CrearProfesor_Ventana accederCrearProfe = new CrearProfesor_Ventana();
    }//GEN-LAST:event_CrearProfesorButtomActionPerformed

    private void ActualizarProfesoresButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarProfesoresButtomActionPerformed
        ActualizarProfesor_Ventana accederActualizarProfe = new ActualizarProfesor_Ventana();
    }//GEN-LAST:event_ActualizarProfesoresButtomActionPerformed

    private void MasivaProfesorButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasivaProfesorButtomActionPerformed
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
                        int codigo_Profesor = Integer.parseInt(datos[0]);
                        String nombre_Profesor = datos[1];
                        String apellido_Profesor = datos[2];
                        String correo_Profesor = datos[3];
                        char genero_Profesor = datos[4].charAt(0);
                        Profesor p = new Profesor(codigo_Profesor, "1234",nombre_Profesor, apellido_Profesor, genero_Profesor, correo_Profesor);
                        // según el enunciado todos los usuarios cargados deben tener la clave 1234 por defecto
                        listadoProfesores.add(p);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error mientras se cargaban los datos", "Carga de Archivos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_MasivaProfesorButtomActionPerformed

    private void ActualizarTablaProfesorButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaProfesorButtomActionPerformed
        llenarTabla("profesor");
        generarGrafica("profesor");
    }//GEN-LAST:event_ActualizarTablaProfesorButtomActionPerformed

    private void EliminarProfesorButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProfesorButtomActionPerformed
        RemoverProfesor_Ventana accederRemoverProfesor = new RemoverProfesor_Ventana();
    }//GEN-LAST:event_EliminarProfesorButtomActionPerformed

    private void ExportarProfesorButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarProfesorButtomActionPerformed
        // Creamos carpeta para los reportes (si no existe)
        File carpeta = new File("./reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        String contenido = this.generarHTML("profesor");
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("./reportes/ListadoDeProfesores.html");
            fileWriter.write(contenido);
            fileWriter.close();            
            String mensaje = "Reporte de Profesores generado en la carpeta \"Reportes\" dentro del proyecto ";
            JOptionPane.showMessageDialog(this, mensaje, "alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_ExportarProfesorButtomActionPerformed
        
    //CURSOS
    private void ExportarCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarCursoButtomActionPerformed
        // Creamos carpeta para los reportes (si no existe)
        File carpeta = new File("./reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        String contenido = this.generarHTML("curso");
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("./reportes/ListadoDeCursos.html");
            fileWriter.write(contenido);
            fileWriter.close();            
            String mensaje = "Reporte de Cursos generado en la carpeta \"Reportes\" dentro del proyecto ";
            JOptionPane.showMessageDialog(this, mensaje, "alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_ExportarCursoButtomActionPerformed

    private void ActualizarTablaCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaCursoButtomActionPerformed
        llenarTabla("curso");
        generarGrafica("curso");
    }//GEN-LAST:event_ActualizarTablaCursoButtomActionPerformed

    private void eliminarCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCursoButtomActionPerformed
        RemoverAsignatura_Ventana accederRemoverAsignatura = new RemoverAsignatura_Ventana();
    }//GEN-LAST:event_eliminarCursoButtomActionPerformed

    private void MasivaCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasivaCursoButtomActionPerformed
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
                        int codigo_Curso = Integer.parseInt(datos[0]);
                        String nombre_Curso = datos[1];
                        int creditos_Curso = Integer.parseInt(datos[2]);
                        int profesor_Curso = Integer.parseInt(datos[3]);
                        listadoAsignaturas.add(new Asignatura(codigo_Curso, nombre_Curso, creditos_Curso, profesor_Curso));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error mientras se cargaban los datos", "Carga de Archivos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_MasivaCursoButtomActionPerformed
        
    private void actualizarCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCursoButtomActionPerformed
        ActualizarAsignatura_Ventana accederActualizarProfe = new ActualizarAsignatura_Ventana();
    }//GEN-LAST:event_actualizarCursoButtomActionPerformed

    private void crearCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCursoButtomActionPerformed
        CrearAsignatura_Ventana accederCrearAsignatura = new CrearAsignatura_Ventana();
    }//GEN-LAST:event_crearCursoButtomActionPerformed
    
    //ESTUDIANTES
    private void MasivaEstudiantesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasivaEstudiantesButtomActionPerformed
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
                        int codigo_Alumno = Integer.parseInt(datos[0]);
                        String nombre_Alumno = datos[1];
                        String apellido_Alumno = datos[2];
                        String correo_Alumno = datos[3];
                        char genero_Alumno = datos[4].charAt(0);
                        Estudiante es = new Estudiante(codigo_Alumno, "1234",nombre_Alumno, apellido_Alumno, genero_Alumno, correo_Alumno);
                        // según el enunciado todos los usuarios cargados deben tener la clave 1234 por defecto
                        listadoEstudiantes.add(es);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error mientras se cargaban los datos", "Carga de Archivos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_MasivaEstudiantesButtomActionPerformed

    private void ActualizarTablaEstudiantesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaEstudiantesButtomActionPerformed
        llenarTabla("estudiante");
        generarGrafica("estudiante");
    }//GEN-LAST:event_ActualizarTablaEstudiantesButtomActionPerformed

    private void ExportarEstudiantesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarEstudiantesButtomActionPerformed
        // Creamos carpeta para los reportes (si no existe)
        File carpeta = new File("./reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        String contenido = this.generarHTML("estudiante");
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("./reportes/ListadoDeAlumnos.html");
            fileWriter.write(contenido);
            fileWriter.close();            
            String mensaje = "Reporte de Alumnos generado en la carpeta \"Reportes\" dentro del proyecto ";
            JOptionPane.showMessageDialog(this, mensaje, "alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_ExportarEstudiantesButtomActionPerformed
    
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
            java.util.logging.Logger.getLogger(adminVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarProfesoresButtom;
    private javax.swing.JButton ActualizarTablaCursoButtom;
    private javax.swing.JButton ActualizarTablaEstudiantesButtom;
    private javax.swing.JButton ActualizarTablaProfesorButtom;
    private javax.swing.JButton CrearProfesorButtom;
    private javax.swing.JButton EliminarProfesorButtom;
    private javax.swing.JButton ExportarCursoButtom;
    private javax.swing.JButton ExportarEstudiantesButtom;
    private javax.swing.JButton ExportarProfesorButtom;
    private javax.swing.JButton MasivaCursoButtom;
    private javax.swing.JButton MasivaEstudiantesButtom;
    private javax.swing.JButton MasivaProfesorButtom;
    private javax.swing.JPanel PanelAlum;
    private javax.swing.JPanel PanelCursos;
    private javax.swing.JPanel PanelProf;
    private javax.swing.JButton RegresarLogin;
    private javax.swing.JTable TablaAsignaturas;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JTable TablaProfesor;
    private javax.swing.JButton actualizarCursoButtom;
    private javax.swing.JButton crearCursoButtom;
    private javax.swing.JButton eliminarCursoButtom;
    private javax.swing.JPanel graficaBarras;
    private javax.swing.JPanel graficaPanel;
    private javax.swing.JPanel graficaPanel1;
    private javax.swing.JPanel graficaPieEstudiantes;
    private javax.swing.JPanel graficaPieProfes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
