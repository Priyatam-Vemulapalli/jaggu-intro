package com.ShoppingWebsiteBackend.ShoppingWebsiteBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;

@Entity
public class Student {
    @Id
    int id;
    String name;
    String course;
    @OneToMany
    ArrayList<Laptop> laptops;

}
