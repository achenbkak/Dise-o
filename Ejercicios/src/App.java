import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JFrame frame = new JFrame("JAJAS"); 
        //Creación del frame o ventana 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //Salir al cerrar ventana frame.setSize(400, 300);
        frame.setSize(400,300);
        
        frame.setLayout(new FlowLayout());
        JTextField campoTexto = new JTextField(15);
        JButton boton = new JButton("HOLAAAA");
        JLabel etiqueta = new JLabel("");
        boton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                String texto = campoTexto.getText();
                etiqueta.setText("Escribiste: " + texto); 
            }

        });

        frame.add(campoTexto);
        frame.add(boton);
        frame.add(etiqueta);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
