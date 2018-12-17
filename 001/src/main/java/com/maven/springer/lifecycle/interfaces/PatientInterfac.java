package com.maven.springer.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PatientInterfac implements InitializingBean, DisposableBean {

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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside after Properties are set :: ");
    }
}
