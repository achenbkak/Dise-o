import javax.swing.border.EmptyBorder;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class tecladoNum extends JPanel {
    private InputMap mapa = getInputMap(WHEN_IN_FOCUSED_WINDOW);
    private ActionMap mapaAcciones = getActionMap();

    public tecladoNum(JTextField pantalla) {
        setLayout(new GridLayout(4, 3, 10, 10));
        setBorder(new EmptyBorder(0, 10, 0, 5));
        char[] teclas = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', 'C' };
        for (char t : teclas) {
            JButton boton = new JButton(String.valueOf(t));
            boton.setFont(new Font("Arial", Font.BOLD, 25));
            boton.setForeground(Color.WHITE);
            boton.setBackground(Color.ORANGE);
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(boton);
            setBinding(t, boton);
            boton.addActionListener(e -> {
                String texto = pantalla.getText();
                String pulsado = boton.getText();

                if (pulsado.equals("C")) {
                    pantalla.setText("0");
                } else if (pulsado.equals(".")) {
                    if (!texto.contains(".")) {
                        pantalla.setText(texto + ".");
                    }
                } else {
                    if (texto.equals("0")) {
                        pantalla.setText(pulsado);
                    } else {
                        pantalla.setText(texto + pulsado);
                    }
                }
            });

        }

    }

    private void setBinding(char c, final JButton boton) {
        KeyStroke teclaPres = KeyStroke.getKeyStroke(Character.toLowerCase(c));
        mapa.put(teclaPres, teclaPres.toString());
        mapaAcciones.put(teclaPres.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton.doClick();
            }
        });
    }

}
