package za.co.myapplication.example.domain.dtos.customer;

import java.io.Serializable;

public class HelloWorldDto implements Serializable{
    private static final long serialVersionUID = 3725816060948965491L;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
