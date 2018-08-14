package controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import model.Users;

@Named(value = "loginController")
@Dependent
public class LoginController {

    private String email;
    private String pass;
    private boolean remember = true;
    private boolean isLoged = false;
    private UsersController usrCtrl;
    private Users user;
    private boolean emailErr;
    private boolean passErr;
    private boolean usrErr;
    
    private final String REGEX = "^\\s*$";

    public String doLogin(String email, String pass, boolean remember) {
        if (email.isEmpty() || email.replaceAll(REGEX, "null").equals("null")) {
            this.emailErr = true;
            return "faces/err/index.xhtml";
        } else {
            if (pass.isEmpty() || pass.replaceAll(REGEX, "null").equals("null")) {
                this.passErr = true;
                return "faces/err/index.xhtml";
            } else {
                if (email.equals("root@root.com")) {
                    return "faces/admin/index.html";
                } else {
                    this.user = usrCtrl.getUsers(email);
                    if (this.user != null) {
                        if (this.user.getPass().equals(pass)) {
                            return "faces/profile/index.xhtml";
                        } else {
                            this.usrErr = true;
                            return "";
                        }
                    }
                }
            }
        }
        
        return "";
    }

    public LoginController() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public boolean isIsLoged() {
        return isLoged;
    }

    public void setIsLoged(boolean isLoged) {
        this.isLoged = isLoged;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public boolean isEmailErr() {
        return emailErr;
    }

    public void setEmailErr(boolean emailErr) {
        this.emailErr = emailErr;
    }

    public boolean isPassErr() {
        return passErr;
    }

    public void setPassErr(boolean passErr) {
        this.passErr = passErr;
    }

    public boolean isUsrErr() {
        return usrErr;
    }

    public void setUsrErr(boolean usrErr) {
        this.usrErr = usrErr;
    }

}
