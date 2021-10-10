package at.htl.restaurant.boundary;

import at.htl.restaurant.entity.Cook;
import at.htl.restaurant.entity.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.time.LocalDate;
import java.util.List;

public class CookRepository implements PanacheRepository<Cook> {

    public Cook findyByLastname(String lastname) {
        return find("lastname", lastname).firstResult();
    }

    public List<Cook> findyByEntryDate(LocalDate entryDate) {
        return find("entryDate", entryDate).list();
    }

    public List<Cook> findyBySalary(Double salary) {
        return find("salary", salary).list();
    }
}
