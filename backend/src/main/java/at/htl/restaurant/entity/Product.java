package at.htl.restaurant.entity;

import javax.persistence.*;

@Table(name = "RE_PRODUCT")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PR_ID")
    private Long id;

    @Column(name = "PR_NAME")
    private String name;

    @Column(name = "PR_PRICE")
    private double price;

    @ManyToOne
    @JoinColumn(name = "PR_COOK_ID")
    private Cook cook;

    @ManyToOne
    @JoinColumn(name = "PR_GUEST_ID")
    private Guest guest;

    public Product(String name, double price, Cook cook, Guest guest) {
        this.name = name;
        this.price = price;
        this.cook = cook;
        this.guest = guest;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cook=" + cook +
                ", guest=" + guest +
                '}';
    }

}

