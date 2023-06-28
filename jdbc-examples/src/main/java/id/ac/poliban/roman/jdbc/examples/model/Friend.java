/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.poliban.roman.jdbc.examples.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author roman
 */
public class Friend implements Serializable{
    private int id;
    private final String name;
    private final LocalDate birthday;
    private final String address;
    private final String phone;

    public Friend(int id, String name, LocalDate birthday, String address, String phone) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public Friend(String name, LocalDate birthday, String address, String phone) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, birthday: %tF, address: %s, phone: %s", getId(), getName(), getBirthday(), getAddress(), getPhone());
    }
    
}
