package com.maven.springer.lifecycle;

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

    public void init() {
        System.out.println("Inside init method:: ..... :)))");
    }

    public void destroy() {
        System.out.println("Inside destroy method:: ..... :(((");
    }
}
