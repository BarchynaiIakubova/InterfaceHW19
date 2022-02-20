package com.company;

public class Flat implements Utilities {
    private String address;
    private Person[] family;

    @Override
    public void utilities() {
        System.out.println("Payment for the utilities " + payUtilities + " soms");
    }

    public Flat(String address, Person[] family) {
        this.address = address;
        this.family = family;
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
        return "Address of the flat: " + address;
    }
}
