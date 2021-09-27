package at.htl.restaurant.entity;

public class Product {

    private Long id;

    private String name;

    private double price;

    private Cook cook;

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

