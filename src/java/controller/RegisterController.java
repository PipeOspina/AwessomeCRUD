/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author felipe.ospinah
 */
@Named(value = "registerController")
@Dependent
public class RegisterController extends LoginController {
    
    private String name;
    private String lastName;
    private String birthday;
    
    public RegisterController() {
    }
    
    public String doSignup(String email, String name, String lastName, String birthday, String pass, boolean accept) {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public Boolean getAccept() {
        return super.isRemember();
    }
    
    public void setAccept(boolean accept) {
        super.setRemember(accept);
    }
    
}
