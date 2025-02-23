package com.example.USER_MODULE.Model;

import jakarta.persistence.*;

@Entity
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    @ManyToOne
    @JoinColumn (name="restaurant_id")
    private Restaurant restaurant;

        // Getter and Setter for id
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }




