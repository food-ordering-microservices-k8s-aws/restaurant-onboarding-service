package com.akash.restaurant_onboarding_service.repository;

import com.akash.restaurant_onboarding_service.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: akash
 * Date: 14/11/25
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
