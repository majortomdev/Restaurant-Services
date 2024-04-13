package com.majortomdev.order.repository;

import com.majortomdev.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
}
