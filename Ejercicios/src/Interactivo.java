import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Interactivo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi ventana");

        

        
        JTextField pantalla = new JTextField();
        pantalla.setBounds(50, 50, 250, 30);

        pantalla.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == '1') {
                pantalla.setText(pantalla.getText() + "nya");
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }   

        @Override
        public void keyReleased(KeyEvent e) {
        }
    });
        
        ventana.add(pantalla);

        ventana.setSize(350, 250);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
}


