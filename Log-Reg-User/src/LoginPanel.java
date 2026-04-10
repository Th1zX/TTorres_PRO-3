import java.awt.*;
import javax.swing.*;

public class LoginPanel extends JPanel {
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final ventMain main;

    public LoginPanel(ventMain main) {
        this.main = main;
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 250));

        JPanel mainCenterPanel = new JPanel();
        mainCenterPanel.setLayout(new BorderLayout());
        mainCenterPanel.setBackground(new Color(245, 245, 250));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245, 245, 250));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 50));
        centerPanel.setMaximumSize(new Dimension(400, Integer.MAX_VALUE));

        JLabel logImageLabel = new JLabel();
        ImageIcon logIcon = new ImageIcon("src/dascl.png");
        Image logImg = logIcon.getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH);
        logImageLabel.setIcon(new ImageIcon(logImg));
        logImageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(logImageLabel);
        centerPanel.add(Box.createVerticalStrut(20));

        JLabel title = new JLabel("Inicio de sesion");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(title);
        centerPanel.add(Box.createVerticalStrut(30));

        JLabel emailLabel = new JLabel("Correo electronico");
        emailLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(emailLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        emailField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        emailField.setPreferredSize(new Dimension(400, 35));
        emailField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        emailField.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(emailField);
        centerPanel.add(Box.createVerticalStrut(15));

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(passwordLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        passwordField.setPreferredSize(new Dimension(400, 35));
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT); 
        centerPanel.add(passwordField);
        centerPanel.add(Box.createVerticalStrut(15));

        JCheckBox rememberCheck = new JCheckBox("Recordar contraseña");
        rememberCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        rememberCheck.setBackground(new Color(245, 245, 250));
        centerPanel.add(rememberCheck);
        centerPanel.add(Box.createVerticalStrut(20));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBackground(new Color(245, 245, 250));
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); 
        
        JButton accessButton = new JButton("Ingresar");
        accessButton.setPreferredSize(new Dimension(140, 38));
        accessButton.setBackground(Color.BLACK);
        accessButton.setForeground(Color.WHITE);
        
        JButton registerButton = new JButton("Registrarse");
        registerButton.setPreferredSize(new Dimension(140, 38));
        
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(accessButton);
        buttonPanel.add(Box.createHorizontalStrut(20));
        buttonPanel.add(registerButton);
        buttonPanel.add(Box.createHorizontalGlue());
        
        centerPanel.add(buttonPanel);
        centerPanel.add(Box.createVerticalStrut(15));

        JLabel hint = new JLabel("usuario: admin@uabcs.mx  contraseña: 12345");
        hint.setFont(new Font("Arial", Font.PLAIN, 12));
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(hint);
        centerPanel.add(Box.createVerticalGlue());

        mainCenterPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(new Color(245, 245, 250));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        JLabel infoImageLabel = new JLabel();
        ImageIcon infoIcon = new ImageIcon("src/infodasclog.jpg");
        Image infoImg = infoIcon.getImage().getScaledInstance(350, 640, Image.SCALE_SMOOTH);
        infoImageLabel.setIcon(new ImageIcon(infoImg));
        infoImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        rightPanel.add(infoImageLabel);

        mainCenterPanel.add(rightPanel, BorderLayout.EAST);
        add(mainCenterPanel, BorderLayout.CENTER);

        accessButton.addActionListener(e -> validateLogin());
        registerButton.addActionListener(e -> main.showRegistro());
    }

    private void validateLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        boolean emailValid = !email.isEmpty();
        boolean passwordValid = !password.isEmpty();
        emailField.setBorder(BorderFactory.createLineBorder(emailValid ? Color.GREEN : Color.RED, 2));
        passwordField.setBorder(BorderFactory.createLineBorder(passwordValid ? Color.GREEN : Color.RED, 2));

        if (!emailValid || !passwordValid) {
            JOptionPane.showMessageDialog(this, "Verifique sus credenciales", "Error de validacion", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (email.equals("admin@uabcs.mx") && password.equals("12345")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso", "Autenticacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Fallo la autenticacion", JOptionPane.ERROR_MESSAGE);
        }
    }
}