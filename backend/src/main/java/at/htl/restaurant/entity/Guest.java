package at.htl.restaurant.entity;

import javax.persistence.*;

@Table(name = "RE_GUEST")
@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GU_ID")
    private Long id;

    @Column(name = "GU_FIRSTNAME")
    private String firstName;

    @Column(name = "GU_LASTNAME")
    private String lastName;

    @Column(name = "GU_TELEFONNUMBER")
    private String telefonNumber;

    public Guest() {
    }

    public Guest(String firstName, String lastName, String telefonNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telefonNumber = telefonNumber;
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

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                '}';
    }

}
