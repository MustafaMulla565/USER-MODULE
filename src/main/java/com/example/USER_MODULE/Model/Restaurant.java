package com.example.USER_MODULE.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String cuisine;
    private String phoneNumber;


    @OneToMany(mappedBy = "restaurant")
    private List<MenuItem> menuItems;

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

        // Getter and Setter for location
        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        // Getter and Setter for cuisine
        public String getCuisine() {
            return cuisine;
        }

        public void setCuisine(String cuisine) {
            this.cuisine = cuisine;
        }

        // Getter and Setter for phoneNumber
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }





