package model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "welcome")
@RequestScoped
public class Welcome {

    private String text;
    private String title = "Inicializando la variable desde la declaración :O";

    public Welcome() {
        this.text = "Inicializando la variable desde el constructor :)";
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
}
