package com.geekster.govinda.Restaurant.service;

import com.geekster.govinda.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class RestaurantService {

    private static List<Restaurant> list=new ArrayList<>();

    static{
        list.add(new Restaurant(1,"Lush","Madhava Nagar,Bengaluru 560001 India","6398452589","Indian and American food",200
)); }

// for get all data store in list
    public List<Restaurant>getAll(){
        return list;
    }

    // for add new Restaurant

    public Restaurant addNewRestaurant(Restaurant resto) {

        list.add(resto);
        return resto;
    }
    // set for getting restaurant details  by id

    public Restaurant getById(int id){
        Restaurant  restaurant=null;

        restaurant =list.stream().filter(e ->e.getId()==id).findFirst().get();
        return restaurant;
    }

    //for update Restaurant Details


    public void updateNewDetails(Restaurant restaurant, int id) {

        list=list.stream().map(R ->{
            if(R.getId() == id) {
                R.setName(restaurant .getName());
                R.setAddress(restaurant.getAddress());
                R.setNumber(restaurant.getNumber());
                R.setSpecialty(restaurant.getSpecialty());
                R.setTotalStaffs(restaurant.getTotalStaffs());

            }
            return R;

        }).collect(Collectors.toList());

    }
    // for delete details of restaurant

    public void DeleteDetails(int id) {

        list=list.stream().filter(e -> e.getId()!= id ).collect(Collectors.toList());
    }
}
