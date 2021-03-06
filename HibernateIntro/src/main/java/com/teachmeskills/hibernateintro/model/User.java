package com.teachmeskills.hibernateintro.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоматически генерируется id
    private long id;
    @Column(name = "NAME")
    private String name;
    private String lastName;
    private String address;
    private boolean isMarried;


    public User(){

    }

    public User(String name, String lastName, String address, boolean isMarried) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.isMarried = isMarried;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
