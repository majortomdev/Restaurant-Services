package com.majortomdev.restaurantlisting.service;
//Created by Joek 10Apr24
import com.majortomdev.restaurantlisting.dto.RestaurantDTO;
import com.majortomdev.restaurantlisting.entity.Restaurant;
import com.majortomdev.restaurantlisting.mapper.RestaurantMapper;
import com.majortomdev.restaurantlisting.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        List<RestaurantDTO> restaurantDTOList = restaurants
                .stream()
                .map(restaurant -> RestaurantMapper
                        .INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
        return restaurantDTOList;
    }

    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
        Restaurant savedRestaurant = restaurantRepo
                .save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO));
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(savedRestaurant);
    }
}
