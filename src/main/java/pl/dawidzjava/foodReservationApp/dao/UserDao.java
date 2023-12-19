package pl.dawidzjava.foodReservationApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidzjava.foodReservationApp.entities.User;

public interface UserDao extends JpaRepository<User,Long> {

    User findByEmail(String userName);

}
