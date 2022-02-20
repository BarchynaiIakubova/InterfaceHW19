package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Eliz", (byte) 25, "daughter");
        Person person2 = new Person("Jhony", (byte) 29, "son");
        Person person3 = new Person("Anna", (byte) 22, "daughter");
        Person person4 = new Person("Rose", (byte) 50, "mother");
        Person person5 = new Person("Mary", (byte) 51, "mother");
        Person person6 = new Person("Benedict", (byte) 49, "father");
        Person person7 = new Person("Joseph", (byte) 60, "father");
        Person[] family1 = {person1, person4, person6, person2};
        Person[] family2 = {person6, person5, person2};
        Person[] family3 = {person3, person7};

        Flat flat = new Flat("Elebaev street 7.", family1);
        Hotel hotel = new Hotel("Frunze street 3", family2);
        Dormitory dormitory = new Dormitory("microdistrict Jal", family3);

        System.out.println(flat);
        flat.utilities();
        System.out.println("There are " + family1.length + " persons in the family. They are:");
        for (Person a : family1) {
            System.out.println(a);
        }

        System.out.println("\n" + hotel);
        hotel.hotelMethod();
        System.out.println("There are " + family2.length + " persons in the family. They are:");
        for (Person a : family2) {
            System.out.println(a);
        }

        System.out.println("\n" + dormitory);
        dormitory.dormitoryMethod();
        System.out.println("There are " + family3.length + " persons in the family. They are:");
        for (Person a : family3) {
            System.out.println(a);
        }
    }
}
