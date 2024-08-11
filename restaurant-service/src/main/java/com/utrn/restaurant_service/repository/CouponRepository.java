package com.utrn.restaurant_service.repository;

import com.utrn.restaurant_service.model.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouponRepository extends MongoRepository<Coupon , String> {
}
