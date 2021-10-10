package at.htl.restaurant.boundary;

import at.htl.restaurant.entity.Guest;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.time.LocalDate;
import java.util.List;

public class GuestRepository implements PanacheRepository<Guest> {

    public Guest findyByLastname(String lastname) {
        return find("lastname", lastname).firstResult();
    }

    public Guest findyByTelefonNumber(String telefonNumber) {
        return find("telefonNumber", telefonNumber).firstResult();
    }

}
