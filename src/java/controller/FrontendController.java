/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author felipe.ospinah
 */
@ManagedBean(name = "frontendController", eager = true)
@Named(value = "frontendController")
@Dependent
public class FrontendController {
    
    @ManagedProperty(value = "#{title}")
    private String title;
    
    public String index() {
        this.title = "Bienvenido a AwessomeCRUD";
        return "home";
    }
    
    public String about() {
        this.title = "Acerca de AwessomeCRUD";
        return "about";
    }
    
    public String contact() {
        this.title = "Contactanos";
        return "contact";
    }
    
    public FrontendController() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
