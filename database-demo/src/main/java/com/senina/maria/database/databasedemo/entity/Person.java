package com.senina.maria.database.databasedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
// By default, class Person would get mapped to a table called "person". Use @Table(name="xxx") to change.
public class Person {
    @Id
    @GeneratedValue
    private int id;

    // Use @Column(name = "xxx") to map to a column with a different name
    private String name;
    private String location;
    private LocalDateTime birthDate;

    // We have to have a no-args constructor
    public Person() {
    }

    // A constructor to allow JPA to generate an ID for us
    public Person(String name, String location, LocalDateTime birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person(int id, String name, String location, LocalDateTime birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
