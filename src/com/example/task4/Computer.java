//Завдання 4
//Використовуючи IDEA, створіть проект із пакетом. Створити клас Computer,
// створити масив об'єктів Computers розміром 5.
// Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).

package com.example.task4;

public class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Apple", "MacBook Pro 16\" M4 Max", 225_999);
        computers[1] = new Computer("Asus", "ROG Zephyrus G16", 197_999);
        computers[2] = new Computer("HP", "ZBook Fury 16 G11", 179_199);
        computers[3] = new Computer("Dell", "Latitude 7350", 99_239);
        computers[4] = new Computer("Lenovo", "Legion 9 16IRX9", 204_639);

        for (Computer comp : computers){
            System.out.println("Brand: " + comp.brand + ", Model: " + comp.model + ", Price: " + comp.price + "грн.");
        }
    }
}
