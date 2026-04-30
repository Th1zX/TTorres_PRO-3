public class AuthModel {
    
    public boolean authenticate(String username, String password) {
        return "admin@uabcs.mx".equals(username) && "12345".equals(password);
    }
}