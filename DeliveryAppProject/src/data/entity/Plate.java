package data.entity;

import data.Entity;

import java.util.List;
import java.util.UUID;

public class Plate extends Entity {

    private String name;
    private Cuisine cuisine;
    private double price;
    private String description;
    private UUID idRestaurant;

    private Restaurant restaurant = null;
    private List<Order> orders = null;

    public Plate(UUID id, String name, Cuisine cuisine, double price, String description, UUID idRestaurant) {
        super(id);
        this.name = name;
        this.cuisine = cuisine;
        this.price = price;
        this.description = description;
        this.idRestaurant = idRestaurant;
    }

    public Plate(String name, Cuisine cuisine, double price, String description, UUID idRestaurant) {
        super();
        this.name = name;
        this.cuisine = cuisine;
        this.price = price;
        this.description = description;
        this.idRestaurant = idRestaurant;
    }

    public String getName() {
        return name;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public UUID getIdRestaurant() {
        return idRestaurant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdRestaurant(UUID idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    // for relationships
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Plate{" + super.toString() +
                ", name='" + name + '\'' +
                ", cuisine=" + cuisine +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", idRestaurant=" + idRestaurant +
                '}';
    }

}