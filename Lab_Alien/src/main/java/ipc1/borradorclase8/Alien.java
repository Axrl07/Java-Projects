package ipc1.borradorclase8;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author josed
 */
public class Alien implements Runnable {
    private ImageIcon alienIcon = new ImageIcon("src/main/java/Imagenes/alien.png"); 
    private JLabel alienLabel = new JLabel(alienIcon);
    private int ancho = alienIcon.getIconWidth();
    private int alto = alienIcon.getIconHeight();
    private JFrame tablero;
    
    private int posX = 0;
    private int posY = 0;
    int vida = 100;
    
    public Alien(JFrame tablero, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.alienLabel.setBounds(posX, posY, ancho, alto);
        this.tablero = tablero;
        this.tablero.add(alienLabel);
    }
    
    public JLabel getLabel() {
        return this.alienLabel;
    } 
    
    public int getAlto() {
        return this.alto;
    }
    
    public void recibirImpacto() {
        vida = 0;
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
    
    @Override
    public void run() {
        boolean derecha = true;
        while (estaVivo()) {
            
            if ( 
                (derecha && (posX + ancho + 10) > tablero.getWidth()) ||  
                (!derecha && (posX - 10) < 0)
            ) {
               derecha = !derecha;
            }
            
            if (derecha) {
                posX += 10;
            } else  {
                posX -= 10;
            }
            
            this.alienLabel.setLocation(posX, posY);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }

}
