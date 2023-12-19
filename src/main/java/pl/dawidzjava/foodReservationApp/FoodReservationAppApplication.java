package pl.dawidzjava.foodReservationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.dawidzjava.foodReservationApp.dao.RoleDao;
import pl.dawidzjava.foodReservationApp.dao.UserDao;
import pl.dawidzjava.foodReservationApp.entities.Role;
import pl.dawidzjava.foodReservationApp.entities.User;

import java.util.HashSet;

@SpringBootApplication
public class FoodReservationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodReservationAppApplication.class, args);
	}

	@Bean
	@Autowired
	public CommandLineRunner commandLineRunner(RoleDao roleDao, UserDao userDao) {
		return runner -> {
			System.out.println("Rozpoczynam działanie");
			Role parent = new Role("PARENT");
			Role worker = new Role("WORKER");
			Role admin = new Role("ADMIN");
			roleDao.save(parent);
			roleDao.save(worker);
			roleDao.save(admin);

			HashSet<Role> roles=new HashSet<>();
			roles.add(parent);
			userDao.save(new User("lul@wp.pl","anna","123",true,roles));

			roles.add(worker);
			userDao.save(new User("lua@wp.pl","jan","123",true,roles));

			roles.add(admin);
			userDao.save(new User("lue@wp.pl","adam","123",true,roles));

		};
	}

}
