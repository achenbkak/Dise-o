import javax.swing.*;
import java.awt.*;

public class pantallaLcd extends JTextField {

    public pantallaLcd() {
        setFont(new Font("Arial", Font.BOLD, 50));
        setEditable(false);
        setFocusable(false);
        setHorizontalAlignment(JTextField.RIGHT);
        setText("0");
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }
}
