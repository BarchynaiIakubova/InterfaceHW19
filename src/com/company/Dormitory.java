package com.company;

public class Dormitory implements Rent {
    private String address;
    private Person[] family;

    public Dormitory(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    @Override
    public void hotelMethod() {

    }
    @Override
    public void dormitoryMethod() {
        System.out.println("Rent for the dormitory " + payDormitory + " soms");
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
        return "Address of the dormitory: " + address;
    }

}
