package com.akash.restaurant_onboarding_service.mapper;

import com.akash.restaurant_onboarding_service.dto.RestaurantDTO;
import com.akash.restaurant_onboarding_service.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author: akash
 * Date: 14/11/25
 */
@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
