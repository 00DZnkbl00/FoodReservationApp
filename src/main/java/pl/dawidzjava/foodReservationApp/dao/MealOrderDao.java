package pl.dawidzjava.foodReservationApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidzjava.foodReservationApp.entities.MealOrder;
import pl.dawidzjava.foodReservationApp.entities.User;

public interface MealOrderDao extends JpaRepository<MealOrder,Long> {
}
