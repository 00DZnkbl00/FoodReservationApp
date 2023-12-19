package pl.dawidzjava.foodReservationApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidzjava.foodReservationApp.entities.Role;

public interface RoleDao extends JpaRepository<Role,Long> {
}
