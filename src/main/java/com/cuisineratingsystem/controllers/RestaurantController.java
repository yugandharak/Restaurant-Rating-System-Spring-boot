package com.cuisineratingsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cuisineratingsystem.Constants;
import com.cuisineratingsystem.model.*;

import com.cuisineratingsystem.services.RestaurantService;



@RestController
public class RestaurantController {

	private RestaurantService restaurantService;

	@Autowired
	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@RequestMapping(path="/api/restaurants", method=RequestMethod.GET)
	public List<Restaurant> getAllRestaurant(){
		
		return restaurantService.getAllRestaurant();
	}
	
	@RequestMapping(path="/api/restaurants/{restid}", method=RequestMethod.GET)
	public Restaurant getRestaurantById(@PathVariable("restid") int restid){
	
		return restaurantService.getRestaurantById(restid);
	}

}