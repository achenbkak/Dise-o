import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class aaa {
    public static void main(String[] args) throws Exception {
        JFrame a = new JFrame("Ventana");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(600,800);
    

        JTextField pantalla = new JTextField();
        pantalla.setFont(new Font("Arial", Font.BOLD, 50));
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setText("0");
        pantalla.setForeground(Color.white);
        pantalla.setPreferredSize(new Dimension(600,100));
        pantalla.setLayout(null);
        pantalla.setBackground(Color.BLACK);
        JPanel tecladoNum = new JPanel();
        tecladoNum.setPreferredSize(new Dimension(400,500));
        tecladoNum.setLayout(new GridLayout(4, 3, 10, 10));
        JPanel operadores = new JPanel();
        operadores.setPreferredSize(new Dimension(150,500));
        operadores.setLayout(new GridLayout(5,1,10,10)); 
        JTextField nose = new JTextField();
        nose.setFont(new Font("Arial", Font.BOLD, 25));
        nose.setEditable(false);
        nose.setHorizontalAlignment(JTextField.CENTER);
        nose.setText("Calculadora by DAM2");
        nose.setPreferredSize(new Dimension(600, 100));
        a.add(pantalla, BorderLayout.NORTH);
        a.add(tecladoNum, BorderLayout.WEST);
        a.add(operadores, BorderLayout.EAST);
        a.add(nose, BorderLayout.SOUTH);

       

        JButton uno = new JButton("1");
        uno.setFont(new Font("Arial", Font.BOLD, 25));
        uno.setBackground(Color.orange);
        JButton dos = new JButton("2");
        dos.setFont(new Font("Arial", Font.BOLD, 25));
        dos.setBackground(Color.orange);
        JButton tresButton = new JButton("3");
        tresButton.setFont(new Font("Arial", Font.BOLD, 25));
        tresButton.setBackground(Color.orange);
        JButton cuatrButton = new JButton("4");
        cuatrButton.setBackground(Color.orange);
        cuatrButton.setFont(new Font("Arial", Font.BOLD, 25));
        JButton cincButton = new JButton("5");
        cincButton.setFont(new Font("Arial", Font.BOLD, 25));
        cincButton.setBackground(Color.orange);
        JButton seisButton = new JButton("6");
        seisButton.setFont(new Font("Arial", Font.BOLD, 25));
        seisButton.setBackground(Color.orange);
        JButton sieteButton = new JButton("7");
        sieteButton.setFont(new Font("Arial", Font.BOLD, 25));
        sieteButton.setBackground(Color.orange);
        JButton ochButton = new JButton("8");
        ochButton.setFont(new Font("Arial", Font.BOLD, 25));
        ochButton.setBackground(Color.orange);
        JButton nueveButton = new JButton("9");
        nueveButton.setFont(new Font("Arial", Font.BOLD, 25));
        nueveButton.setBackground(Color.orange);
        JButton cerButton = new JButton("0");
        cerButton.setFont(new Font("Arial", Font.BOLD, 25));
        cerButton.setBackground(Color.orange);
        JButton punt = new JButton(".");
        punt.setFont(new Font("Arial", Font.BOLD, 25));
        punt.setBackground(Color.orange);
        punt.setForeground(Color.white);
        uno.setForeground(Color.white);
        dos.setForeground(Color.white);
        tresButton.setForeground(Color.white);
        cerButton.setForeground(Color.white);
        cuatrButton.setForeground(Color.white);
        cincButton.setForeground(Color.white);
        seisButton.setForeground(Color.white);
        sieteButton.setForeground(Color.white);
        ochButton.setForeground(Color.white);
        nueveButton.setForeground(Color.white);
        


        tecladoNum.add(uno);
        tecladoNum.add(dos);
        tecladoNum.add(tresButton);
        tecladoNum.add(cuatrButton);
        tecladoNum.add(cincButton);
        tecladoNum.add(seisButton);
        tecladoNum.add(sieteButton);
        tecladoNum.add(ochButton);
        tecladoNum.add(nueveButton);
        tecladoNum.add(cerButton);
        tecladoNum.add(punt);

        Color naranColor = new Color(255,151,112);

        JButton sum = new JButton("+");
        sum.setFont(new Font("Arial", Font.BOLD, 25));
        sum.setForeground(Color.white);
        sum.setBackground(naranColor);
        JButton rest = new JButton("-");
        rest.setFont(new Font("Arial", Font.BOLD, 25));
        rest.setForeground(Color.white);
        rest.setBackground(naranColor);
        JButton mult = new JButton("x");
        mult.setFont(new Font("Arial", Font.BOLD, 25));
        mult.setForeground(Color.white);
        mult.setBackground(naranColor);
        JButton div = new JButton("/");
        div.setFont(new Font("Arial", Font.BOLD, 25));
        div.setForeground(Color.white);
        div.setBackground(naranColor);
        JButton IG = new JButton("=");
        IG.setFont(new Font("Arial", Font.BOLD, 25));
        IG.setForeground(Color.white);
        IG.setBackground(naranColor);


        operadores.add(sum);
        operadores.add(rest);
        operadores.add(mult);
        operadores.add(div);
        operadores.add(IG);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        

        
    }


}
