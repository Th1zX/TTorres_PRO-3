import java.awt.event.ActionEvent;

public class AuthController {
    private AuthView view;
    private AuthModel model;

    public AuthController(AuthView view, AuthModel model) {
        this.view = view;
        this.model = model;
        
        this.view.getLoginButton().addActionListener(this::handleLogin);
    }

    public void init() {
        view.setVisible(true);
    }

    private void handleLogin(ActionEvent e) {
        String username = view.getUsername();
        String password = view.getPassword();
        
        if (username.isEmpty() || password.isEmpty()) {
            view.showMessage("Por favor, ingrese usuario y contraseña.", true);
            return;
        }

        boolean isValid = model.authenticate(username, password);
        
        if (isValid) {
            view.showMessage("Inicio de sesión exitoso.", false);
        } else {
            view.showMessage("Credenciales incorrectas.", true);
        }
    }
}