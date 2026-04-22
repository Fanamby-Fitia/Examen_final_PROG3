package org.td2.prog_3.Model;

public class Member {

    private Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;
    private Long collectivityId;

    public Member(Long id, String firstName, String lastName, String birthDate, String gender, Long collectivityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.collectivityId = collectivityId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getCollectivityId() {
        return collectivityId;
    }

    public void setCollectivityId(Long collectivityId) {
        this.collectivityId = collectivityId;
    }
}