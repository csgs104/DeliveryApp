package data.entity;

import data.Entity;

import java.util.List;
import java.util.UUID;

public class Restaurant extends Entity {

    private String name;
    private String location;
    private String email;

    private List<Plate> plates = null;
    private List<Receipt> receipts = null;

    public Restaurant(UUID id, String name, String location, String email) {
        super(id);
        this.name = name;
        this.location = location;
        this.email = email;
    }

    public Restaurant(String name, String location, String email) {
        super();
        this.name = name;
        this.location = location;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // for relationships
    public List<Plate> getPlates() {
        return plates;
    }

    public List<Receipt> getOrders() {
        return receipts;
    }

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }

    public void setOrders(List<Receipt> orders) {
        this.receipts = orders;
    }

    @Override
    public String toString() {
        return "Restaurant{" + super.toString() +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}