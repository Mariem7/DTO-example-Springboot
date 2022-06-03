package DTO.Spring.boot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import DTO.Spring.boot.example.entities.Location;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
