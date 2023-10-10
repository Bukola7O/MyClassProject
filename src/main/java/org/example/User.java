package org.example;
import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String gender;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender) && Objects.equals(dob, user.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, dob);
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;

    }
}
