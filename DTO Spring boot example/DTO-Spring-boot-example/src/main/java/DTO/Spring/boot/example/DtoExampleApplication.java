package DTO.Spring.boot.example;

import DTO.Spring.boot.example.entities.User;
import DTO.Spring.boot.example.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import DTO.Spring.boot.example.entities.Location;
import DTO.Spring.boot.example.repositories.UserRepository;

@SpringBootApplication
public class DtoExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args){
		Location location = new Location();
		location.setPlace("Paris");
		location.setDescription("Paris is a great place");
		location.setLongitude(40.5);
		location.setLatitude(52);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Rayen");
		user1.setLastName("Khouildi");
		user1.setEmail("mary@gdjfnizr.com");
		user1.setPassword("hekk");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Raya");
		user2.setLastName("Khouildi");
		user2.setEmail("mary@g.com");
		user2.setPassword("hekk");
		user2.setLocation(location);
		userRepository.save(user2);




	}
}
