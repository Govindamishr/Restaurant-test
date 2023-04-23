package com.geekster.govinda.Restaurant.model;

public class Restaurant {

    private int id;

    private String name;

    private String address;

    private String number;

    private String specialty;

    private int totalStaffs;



    // default constructor

    public Restaurant(){

    }
    // parameterized constructor


    public Restaurant(int id, String name, String address, String number, String specialty, int totalStaffs) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.specialty = specialty;
        this.totalStaffs = totalStaffs;
    }

    // getter and  setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

}
