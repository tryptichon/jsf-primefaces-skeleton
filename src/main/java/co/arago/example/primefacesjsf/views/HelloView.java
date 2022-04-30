package co.arago.example.primefacesjsf.views;


import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "hello")
@RequestScoped
public class HelloView {
    private String name;
    private String message;

    @PostConstruct
    public void init() {

    }

    public void createMessage() {
        message = "Hello, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
}
