import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//holaquetasl


public class Calculadora_AlexanderChen {

    public static void main(String[] args) throws Exception {

        JFrame a = new JFrame("Ventana");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(600, 800);
        a.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new GridBagLayout());

        String[] opciones = {"Estándar","Científica"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        pantallaLcd pantalla = new pantallaLcd();
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridy = 0;
        gbc1.weighty = 1.0;

        gbc1.gridx = 0;
        gbc1.weightx = 0.1;
        gbc1.insets = new Insets(0, 10, 10, 10);
        panel.add(comboBox, gbc1);

        gbc1.gridx = 1;
        gbc1.weightx = 0.9;
        gbc1.insets = new Insets(0, 0, 10, 5);
        panel.add(pantalla, gbc1);
        a.add(panel, BorderLayout.NORTH);
      
        tecladoNum tecladoNum = new tecladoNum(pantalla);

        operadores operadores = new operadores(pantalla);
        

        JPanel centro = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weighty = 1.0;

        gbc.gridx = 0;
        gbc.weightx = 2.0;
        gbc.insets = new Insets(0, 0, 0, 10);
        centro.add(tecladoNum, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(0, 0, 0, 0);
        centro.add(operadores, gbc);

        a.add(centro, BorderLayout.CENTER);

        JTextField nose = new JTextField();

        nose.setFont(new Font("Arial", Font.BOLD, 25));
        nose.setEditable(false);
        nose.setHorizontalAlignment(JTextField.CENTER);
        nose.setText("Calculadora by DAM2");

        a.add(nose, BorderLayout.SOUTH);

        a.setLocationRelativeTo(null);
        a.setVisible(true);

    }
}
