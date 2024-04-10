package com.majortomdev.restaurantlisting.repository;
//Created by Joek 10Apr24


import com.majortomdev.restaurantlisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
}
