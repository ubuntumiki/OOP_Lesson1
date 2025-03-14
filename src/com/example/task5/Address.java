//Завдання 5
//Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address.
// У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
// Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
// У поля екземпляра записати інформацію про поштову адресу. Виведіть на екран значення полів, що описують адресу.

package com.example.task5;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private int apartment;

    public Address(){
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setIndex(1);
        address1.setCountry("UA");
        address1.setCity("Kiev");
        address1.setStreet("Shevchenka");
        address1.setHouse("1A");
        address1.setApartment(12);

//        address1.viewAddress();
        System.out.println(address1.getIndex() + " " + address1.getCountry() + " " + address1.getCity() + " "
        + address1.getStreet() + " " + address1.getHouse() + "/" + address1.getApartment());
    }

//    public void viewAddress(){
//        System.out.println(country);
//    }
}
