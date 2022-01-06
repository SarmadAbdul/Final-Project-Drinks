package com.example.springdrinks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdrinks.domain.Drink;

public interface DrinkRepo extends JpaRepository<Drink, Long> {

}
