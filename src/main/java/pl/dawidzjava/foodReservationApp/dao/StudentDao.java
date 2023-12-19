package pl.dawidzjava.foodReservationApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidzjava.foodReservationApp.entities.Student;
import pl.dawidzjava.foodReservationApp.entities.User;

public interface StudentDao extends JpaRepository<Student,Long> {
}
