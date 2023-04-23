package com.geekster.govinda.Restaurant.controller;

import com.geekster.govinda.Restaurant.model.Restaurant;
import com.geekster.govinda.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RestaurantController {

    @Autowired

    private RestaurantService restaurantService;

    // get mapping


    @GetMapping("/show")

    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAll();
    }

    // post mapping


    @PostMapping("/show")

    public String getNewRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addNewRestaurant(restaurant);
        return "SuccessFully added new restaurant Details";
    }

    // for find  restaurant by id

    @GetMapping("/show/{id}")

        public Restaurant getById(@PathVariable int id) {

        return restaurantService.getById(id);
    }

    // put mapping

    @PutMapping("/show/{id}")

    public String updateRestaurantDetails(@RequestBody Restaurant restaurant , @PathVariable int id){
        restaurantService.updateNewDetails(restaurant,id);

        return "Restaurant Details return SuccessFully";
    }

    //delete mapping

    @DeleteMapping("/show/{id}")
    public String deleteRestaurant(@PathVariable int id){

        restaurantService.DeleteDetails(id);
        return "Restaurant Details  SuccessFully";
    }

}
