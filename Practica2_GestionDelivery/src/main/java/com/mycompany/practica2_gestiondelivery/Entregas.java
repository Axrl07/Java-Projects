package com.mycompany.practica2_gestiondelivery;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Entregas implements Runnable{
    
    public static DateFormat formatoFecha = new SimpleDateFormat("EEE, MMM d, yyyy");
    public static DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    
    // resturante y motos
    private JFrame hilosFrame;
    private String nombreMoto;

    // manejando hasta el domicilio
    private ImageIcon icono = new ImageIcon("src/main/java/com/mycompany/practica2_gestiondelivery/imagenes/motorista.png");
    private JLabel etiqueta = new JLabel(icono);

    // regresando al restaurante
    private ImageIcon iconoInvertido = new ImageIcon("src/main/java/com/mycompany/practica2_gestiondelivery/imagenes/invertido.png");
    private JLabel etiquetaInvertido = new JLabel(iconoInvertido);

    // configurando la moto
    private int ancho = icono.getIconWidth();
    private int alto = icono.getIconHeight();
    private int posX = 0;
    private int posY = 0;
    private String fechafin;
    private int velocidad;
    private boolean Entregado;
    
    //constructor
    public Entregas(JFrame ventana, int posX, int posY, String NombreMoto, int velocidad) {
        this.posX = posX;
        this.posY = posY;
        this.velocidad = velocidad;
        this.nombreMoto = NombreMoto;
        this.etiqueta.setBounds(posX, posY, ancho, alto);
        this.etiqueta.setVisible(true);
        this.etiquetaInvertido.setBounds(510, posY, ancho, alto);
        this.etiquetaInvertido.setVisible(false);
        this.hilosFrame = ventana;
        this.hilosFrame.add(etiqueta);
        this.hilosFrame.add(etiquetaInvertido);
        this.Entregado = false;
    }

    // getter del label
    public JLabel getLabel() {
        return this.etiqueta;
    }
    public int getAlto() {
        return this.alto;
    }
    public String getfechaFin() {
        return this.fechafin;
    }
    public boolean getEntregado(){
        return this.Entregado;
    }
    
    @Override
    public void run() {
        boolean derecha = true;
        boolean finEntrega = false;
        while (!finEntrega) {
            if (derecha && ((posX + ancho) > 540)) {
                derecha = !derecha;
                this.etiqueta.setVisible(false);
                this.etiquetaInvertido.setVisible(true);
                this.etiquetaInvertido.setLocation(posX, posY);
                String fecha = formatoFecha.format(Calendar.getInstance().getTime());
                String hrs = formatoHora.format(Calendar.getInstance().getTime());
                this.fechafin = fecha.concat("-" + hrs);
                this.Entregado = true;
            }
            if (!derecha && ((posX - 10) < 30)) {
                finEntrega = true;
            }
            if (derecha) {
                posX += this.velocidad;
                this.etiqueta.setLocation(posX, posY);
            } else {
                posX -= this.velocidad;
                this.etiquetaInvertido.setLocation(posX, posY);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.out.println(ex);
            }
        }
    }

}
