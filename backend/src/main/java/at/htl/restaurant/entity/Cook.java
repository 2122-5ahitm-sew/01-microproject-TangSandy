package at.htl.restaurant.entity;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "RE_COOK")
@Entity
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID")
    private Long id;

    @Column(name = "CO_FIRSTNAME")
    @JsonbProperty("firstName")
    private String firstName;

    @Column(name = "CO_LASTNAME")
    @JsonbProperty("lastName")
    private String lastName;

    @Column(name = "CO_SALARY")
    @JsonbNumberFormat("salary")
    double salary;

    @Column(name = "CO_DATE")
    @JsonbDateFormat("entryDate")
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
