package com.company;

public class Hotel implements Rent {
    private String address;
    private Person[] family;

    public Hotel(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    @Override
    public void hotelMethod() {
        System.out.println("Rent for the hotel " + payHotel + " soms");
    }
    @Override
    public void dormitoryMethod() {

    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setFamily(Person[] family) {
        this.family = family;
    }
    public Person[] getFamily() {
        return family;
    }
    @Override
    public String toString() {
        return "Address of the hotel: " + address;
    }
}
