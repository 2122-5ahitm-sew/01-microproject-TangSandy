package at.htl.restaurant.entity;

import java.time.LocalDate;

public class Cook {

    private Long id;

    private String firstName;

    private String lastName;

    double salary;

    LocalDate entryDate;

    public Cook() {

    }

    public Cook(String firstName, String lastName, double salary, LocalDate entryDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.entryDate = entryDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
