package pt.iefp.tis08;

/**
 *
 * @author Eduardo
 * @author Pedro
 */
public class LoginClass {
    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean validar(){
    return user.equals("admin")&& pass.equals("admin");
    }
    public static void main(String[] args) {
        
    }
}
