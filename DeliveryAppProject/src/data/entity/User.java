package data.entity;

import data.Entity;

import java.util.List;
import java.util.UUID;

public class User extends Entity {

    private String name;
    private String surname;
    private String birth;
    private String email;

    private List<Receipt> receipts = null;

    public User(UUID id, String name, String surname, String birth, String email) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.email = email;
    }

    public User(String name, String surname, String birth, String email) {
        super();
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // for relationships
    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipt) {
        this.receipts = receipt;
    }

    @Override
    public String toString() {
        return "User{" + super.toString() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}