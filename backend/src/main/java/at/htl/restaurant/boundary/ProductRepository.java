package at.htl.restaurant.boundary;

import at.htl.restaurant.entity.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

public class ProductRepository implements PanacheRepository<Product> {

    public Product findyByName(String name) {
        return find("name", name).firstResult();
    }

    public List<Product> findyByPrice(double price) {
        return find("price", price).list();
    }

    public List<Product> findyByCook(Long cookId) {
        return find("id", cookId).list();
    }

    public List<Product> findyByGuest(Long guestId) {
        return find("id", guestId).list();
    }
}
