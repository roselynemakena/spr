package com.maven.springer.lifecycle.annotations;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {

    private String name;
    private int id;
    private List<String> medicines;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", medicines=" + medicines +
                '}';
    }
}
