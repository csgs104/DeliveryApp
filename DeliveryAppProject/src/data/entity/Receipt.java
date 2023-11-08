package data.entity;

import data.Entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Receipt extends Entity {

    private UUID idUser;
    private UUID idRestaurant;
    private String location;
    private LocalDateTime due;
    private LocalDateTime arrive;

    private User user = null;
    private Restaurant restaurant = null;
    private List<Order> orders = null;

    public Receipt(UUID id, UUID idUser, UUID idRestaurant, String location, LocalDateTime due, LocalDateTime arrive) {
        super(id);
        this.idUser = idUser;
        this.idRestaurant = idRestaurant;
        this.location = location;
        this.due = due;
        this.arrive = arrive;
    }

    public Receipt(UUID idUser, UUID idRestaurant, String location, LocalDateTime due, LocalDateTime arrive) {
        super();
        this.idUser = idUser;
        this.idRestaurant = idRestaurant;
        this.location = location;
        this.due = due;
        this.arrive = arrive;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public UUID getIdRestaurant() {
        return idRestaurant;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDue() {
        return due;
    }

    public LocalDateTime getArrive() {
        return arrive;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public void setIdRestaurant(UUID idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDue(LocalDateTime due) {
        this.due = due;
    }

    public void setArrive(LocalDateTime arrive) {
        this.arrive = arrive;
    }

    // for relationships
    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Receipt{" + super.toString() +
                ", idUser=" + idUser +
                ", idRestaurant=" + idRestaurant +
                ", location='" + location + '\'' +
                ", due=" + due +
                ", arrive=" + arrive +
                '}';
    }

}