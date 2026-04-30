import java.awt.*;
import javax.swing.*;

public class AuthView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public AuthView() {
        setTitle("Inicio de Sesión (MVC)");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        panel.add(new JLabel("Usuario:"));
        usernameField = new JTextField();
        panel.add(usernameField);
        
        panel.add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);
        
        loginButton = new JButton("Iniciar sesión");
        panel.add(new JLabel("")); 
        panel.add(loginButton);
        
        add(panel);
    }
    
    public String getUsername() {
        return usernameField.getText().trim();
    }
    
    public String getPassword() {
        return new String(passwordField.getPassword()).trim();
    }
    
    public JButton getLoginButton() {
        return loginButton;
    }
    
    public void showMessage(String message, boolean isError) {
        int messageType = isError ? JOptionPane.ERROR_MESSAGE : JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(this, message, "Autenticación", messageType);
    }
}