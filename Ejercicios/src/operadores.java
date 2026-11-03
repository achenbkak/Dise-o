import javax.swing.border.EmptyBorder;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;


public class operadores extends JPanel {
    private InputMap mapa = getInputMap(WHEN_IN_FOCUSED_WINDOW);
    private ActionMap mapaAcciones = getActionMap();

    public operadores(JTextField pantalla){
        setLayout(new GridLayout(5,1,10,10));
        setBorder(new EmptyBorder(0,10,0,5));
        char[] teclas = {'+','-','/','x','='};
        for(char t : teclas){
            JButton boton = new JButton(String.valueOf(t));
            boton.setFont(new Font("Arial", Font.BOLD, 25));
            boton.setForeground(Color.WHITE);
            Color naranColor = new Color(255, 151, 112);
            boton.setBackground(naranColor);
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(boton);
            setBinding(t,boton);
            boton.addActionListener(e -> {
                String texto = pantalla.getText();
                String pulsado = boton.getText();

                if (pulsado.equals("+")) {
                    if(!(texto.contains("+"))){
                        pantalla.setText(pantalla.getText()+" + ");
                    }
                }else if (pulsado.equals("-")) {
                    if(!(texto.contains("-"))){
                        pantalla.setText(pantalla.getText()+" - ");
                    }
                }else if (pulsado.equals("/")) {
                    if(!(texto.contains("/"))){
                        pantalla.setText(pantalla.getText()+" / ");
                    }
                }else if (pulsado.equals("x")) {
                    if(!(texto.contains("x"))){
                        pantalla.setText(pantalla.getText()+" x ");
                    }
                }else if (pulsado.equals("=")) {
                    if(!(texto.contains("="))){
                        pantalla.setText(pantalla.getText()+" = ");
                    }
                }
            });

        }
        
    }

        private void setBinding(char c, final JButton boton){
            KeyStroke teclaPres = KeyStroke.getKeyStroke(Character.toLowerCase(c));
            mapa.put(teclaPres, teclaPres.toString());
            mapaAcciones.put(teclaPres.toString(), new AbstractAction() {
                @Override 
                public void actionPerformed(ActionEvent e){
                    boton.doClick();
                }
            });
        }
}
