package org.td2.prog_3.Model;

public class Collectivity {

    private Long id;
    private String name;
    private String city;
    private String specialty;
    private String creationDate;

    public Collectivity(Long id, String name, String city, String specialty, String creationDate) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.specialty = specialty;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}