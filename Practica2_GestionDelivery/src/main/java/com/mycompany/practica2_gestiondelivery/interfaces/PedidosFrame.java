package com.mycompany.practica2_gestiondelivery.interfaces;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.practica2_gestiondelivery.AppState;
import com.mycompany.practica2_gestiondelivery.Practica2_GestionDelivery;
import com.mycompany.practica2_gestiondelivery.Producto;
import com.mycompany.practica2_gestiondelivery.Vehiculo;
import java.util.ArrayList;

public class PedidosFrame extends javax.swing.JFrame {
    
    // variables y metodos static
    public static Producto productoDisponible;
    public static Producto productoPedido;
    
    // variables y metodos clase
    int contadorPedidos = 0;
    private float acumulado = 0;
    private String[] motosDisponibles = {"Motocicleta 1", "Motocicleta 2", "Motocicleta 3"};
    private String[] motosOcupadas = new String[3];
    private void llenadoTablas(String NombreTabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        if (NombreTabla.equalsIgnoreCase("productos")) {
            modelo.addColumn("Producto");
            modelo.addColumn("Precio (En Q)");
            for (Producto p : Producto.listadoProductos) {
                Object[] fila = {p.getNombre(), p.getCosto()};
                modelo.addRow(fila);
            }
            ProductosTable.setModel(modelo);
        } else {
            modelo.addColumn("Producto");
            modelo.addColumn("Precio (En Q)");
            for (Producto c : Producto.compras) {
                Object[] fila = {c.getNombre(), c.getCosto()};
                modelo.addRow(fila);
            }
            ComprasTable.setModel(modelo);
        }
    }
    private void labelTrabajo(float ingreso, boolean sumar) {
        String nuevoAcumuladoLabel;
        if (sumar == true) {
            this.acumulado += ingreso;
            nuevoAcumuladoLabel = Float.toString(this.acumulado);
            this.acunuladoLabel.setText(nuevoAcumuladoLabel);
        } else {
            this.acumulado -= ingreso;
            nuevoAcumuladoLabel = Float.toString(this.acumulado);
            this.acunuladoLabel.setText(nuevoAcumuladoLabel);
        }
    }
    private void llenadoComboBox() {
        ComboBox.removeAllItems();
        for (int i = 0; i < this.motosDisponibles.length; i++) {
            if(this.motosDisponibles[i] != null){
                ComboBox.addItem(this.motosDisponibles[i]);
            }
        }
    }
    private void ocuparMoto(String name){
        for (int i = 0; i < this.motosOcupadas.length; i++) {
            if(this.motosOcupadas[i] == null){
                this.motosOcupadas[i] = name;
                for (int j = 0; j < this.motosDisponibles.length; j++) {
                    if(name.equalsIgnoreCase(this.motosDisponibles[i])){
                        this.motosDisponibles[i] = null;
                        break;
                    }
                }
                break;
            }
        }
    }
    private boolean motoDisponible(String name){
        for (int i = 0; i < this.motosOcupadas.length; i++) {
            if(name.equalsIgnoreCase(this.motosOcupadas[i])){
                return true;
            }
        }
        return false;
    }
    
    // iniciador de ventana
    public PedidosFrame() {
        // indispensables
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Ventana de Pedidos");
        this.setDefaultCloseOperation(PedidosFrame.EXIT_ON_CLOSE);

        // listener de tabla Productos
        ProductosTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int filaSeleccionada = ProductosTable.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String nombreP = (String) ProductosTable.getValueAt(filaSeleccionada, 0);
                    productoDisponible = Producto.getProducto(nombreP, Producto.listadoProductos);
                }
            }
        });
        // listener de tabla Compras
        ComprasTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int filaSeleccionada = ComprasTable.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String nombreC = (String) ComprasTable.getValueAt(filaSeleccionada, 0);
                    productoPedido = Producto.getProducto(nombreC, Producto.compras);
                }
            }
        });

        // rellenado de datos
        AppState.deserializar();
        llenadoComboBox();
        llenadoTablas("productos");
        llenadoTablas("compras");
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComprasTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductosTable = new javax.swing.JTable();
        eliminarButtom = new javax.swing.JButton();
        agregarButtom = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DistanciaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ConfirmarButtom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        acunuladoLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RegresarButtom = new javax.swing.JButton();
        envioButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pedido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Productos");

        ComprasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane1.setViewportView(ComprasTable);

        ProductosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane2.setViewportView(ProductosTable);

        eliminarButtom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eliminarButtom.setForeground(new java.awt.Color(0, 0, 0));
        eliminarButtom.setText("Eliminar producto del pedido");
        eliminarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtomActionPerformed(evt);
            }
        });

        agregarButtom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agregarButtom.setForeground(new java.awt.Color(0, 0, 0));
        agregarButtom.setText("Agregar Producto al pedido");
        agregarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vehiculo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Distancia a Viajar:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("km");

        ConfirmarButtom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmarButtom.setForeground(new java.awt.Color(0, 0, 0));
        ConfirmarButtom.setText("Confirmar Pedido");
        ConfirmarButtom.setToolTipText("");
        ConfirmarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarButtomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Costo total del pedido:");

        acunuladoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        acunuladoLabel.setForeground(new java.awt.Color(0, 0, 0));
        acunuladoLabel.setText("00.00");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Q");

        RegresarButtom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegresarButtom.setForeground(new java.awt.Color(0, 0, 0));
        RegresarButtom.setText("Regresar al menú principal");
        RegresarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtomActionPerformed(evt);
            }
        });

        envioButtom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        envioButtom.setForeground(new java.awt.Color(0, 0, 0));
        envioButtom.setText("Realizar envio");
        envioButtom.setToolTipText("");
        envioButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envioButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(DistanciaField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(agregarButtom)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButtom)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(acunuladoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ConfirmarButtom)
                            .addGap(18, 18, 18)
                            .addComponent(envioButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegresarButtom)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RegresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acunuladoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DistanciaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfirmarButtom)
                    .addComponent(envioButtom))
                .addGap(25, 25, 25))
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
    
    // boton AGREGAR
    private void agregarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtomActionPerformed
        if (Producto.compras.contains(productoDisponible)) {
            JOptionPane.showMessageDialog(null, "El producto ya está en el pedido", "Existencia", JOptionPane.WARNING_MESSAGE);
        } else {
            Producto.compras.add(productoDisponible);
            labelTrabajo(productoDisponible.getCosto(), true);
            llenadoTablas("compras");
        }
    }//GEN-LAST:event_agregarButtomActionPerformed
    // boton ELIMINAR
    private void eliminarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtomActionPerformed
        Producto.compras.remove(productoPedido);
        if (!Producto.compras.contains(productoPedido)) {
            labelTrabajo(productoPedido.getCosto(), false);
            llenadoTablas("compras");
        } else {
            JOptionPane.showMessageDialog(null, "El producto ta fue removido del pedido", "Existencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarButtomActionPerformed
    // boton REGRESAR
    private void RegresarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarButtomActionPerformed
        Producto.compras.clear();
        this.dispose();
        AdminFrame principal = new AdminFrame();
    }//GEN-LAST:event_RegresarButtomActionPerformed
    // boton CONFIRMAR
    private void ConfirmarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarButtomActionPerformed
        int distancia;
        String NombreVehiculo;
        boolean ocupado;
        float total = this.acumulado;
        try {
            if (!DistanciaField.getText().isEmpty() && !DistanciaField.getText().isBlank()) {
                if (contadorPedidos < 3) {
                    distancia = Integer.parseInt(DistanciaField.getText());
                    NombreVehiculo = (String) ComboBox.getSelectedItem();
                    ocupado = this.motoDisponible(NombreVehiculo);
                    if (distancia > 0 && distancia <= 10) {
                        if (total > 0) {
                            if(!ocupado){
                                this.ocuparMoto(NombreVehiculo);
                                String creacionFecha = Practica2_GestionDelivery.fechaHora();
                                Vehiculo.AddVehiculo(new Vehiculo(NombreVehiculo, distancia, total, creacionFecha), Vehiculo.viajesTemporales);
                                contadorPedidos += 1;
                                this.acumulado = 0;
                                this.acunuladoLabel.setText("00.00");
                                this.DistanciaField.setText("");
                                Producto.compras.clear();
                                llenadoTablas("compras");
                                llenadoComboBox();
                            }else{
                                JOptionPane.showMessageDialog(null, "El Repartidor de la "+NombreVehiculo+" ya tiene a su cargo un pedido, por favor seleccione otro repartidor.", "Repartidor", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Realice su pedido, por favor", "Total a pagar", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La distancia deben ser unicamente números enteros desde 1 hasta 10", "Distancia", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no hay Repartidores disponibles, realice el envio de los repartidores", "Falta de Personal", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una distancia coherente, por favor.", "Distancia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "La distancia deben ser unicamente números enteros y no debe contener letras", "Insersión Datos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarButtomActionPerformed
    // boton ENVIO
    private void envioButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envioButtomActionPerformed
        if (contadorPedidos == 3) {
            Producto.compras.clear();
            this.contadorPedidos = 0;
            this.acunuladoLabel.setText("00.00");
            this.dispose();
            HilosFrame ejecutarHilos = new HilosFrame();
        }
    }//GEN-LAST:event_envioButtomActionPerformed

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
            java.util.logging.Logger.getLogger(PedidosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTable ComprasTable;
    private javax.swing.JButton ConfirmarButtom;
    private javax.swing.JTextField DistanciaField;
    private javax.swing.JTable ProductosTable;
    private javax.swing.JButton RegresarButtom;
    private javax.swing.JLabel acunuladoLabel;
    private javax.swing.JButton agregarButtom;
    private javax.swing.JButton eliminarButtom;
    private javax.swing.JButton envioButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
