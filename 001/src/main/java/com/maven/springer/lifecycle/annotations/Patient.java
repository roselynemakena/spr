package com.maven.springer.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    @PostConstruct
    public void hi() {
        System.out.println("Inside init method:: ..... :)))");
    }

    @PreDestroy
    public void bye() {
        System.out.println("Inside destroy method:: ..... :(((");
    }
}
