package data.entity;

import data.Entity;

import java.util.UUID;

public class Order extends Entity {

    private UUID idReceipt;
    private UUID idPlates;

    private Receipt receipt = null;
    private Plate plate = null;

    public Order(UUID id, UUID idReceipt, UUID idPlates) {
        super(id);
        this.idReceipt = idReceipt;
        this.idPlates = idPlates;
    }

    public Order(UUID idReceipt, UUID idPlates) {
        super();
        this.idReceipt = idReceipt;
        this.idPlates = idPlates;
    }

    public UUID getIdReceipt() {
        return idReceipt;
    }

    public UUID getIdPlate() {
        return idPlates;
    }

    public void setIdReceipt(UUID idReceipt) {
        this.idReceipt = idReceipt;
    }

    public void setIdPlate(UUID idPlates) {
        this.idPlates = idPlates;
    }

    // for relationships
    public Receipt getReceipt() {
        return receipt;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Order{" + super.toString() +
                ", idReceipt=" + idReceipt +
                ", idPlates=" + idPlates +
                '}';
    }

}