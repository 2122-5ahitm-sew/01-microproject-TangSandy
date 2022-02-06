package at.htl.restaurant.boundary;

import at.htl.restaurant.entity.Cook;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
@ApplicationScoped
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
