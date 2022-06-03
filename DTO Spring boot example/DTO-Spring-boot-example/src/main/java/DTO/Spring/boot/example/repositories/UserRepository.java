package DTO.Spring.boot.example.repositories;

import DTO.Spring.boot.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
