//Завдання 2
//
//Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Rectangle.
// У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
// Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
// і периметр прямокутника - double perimeterCalculator (double side1, double side2).
// Написати програму, яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.

package com.example.task2;

import java.util.Scanner;

public class Rectangle {
    static double side1;
    static double side2;

    static double areaCalculator(double side1, double side2){
        return side1 * side2;
    }

    static double perimeterCalculator(double side1, double side2){
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть першу сторну прямокутника - ");
        side1 = in.nextDouble();
        System.out.print("Введіть другу сторну прямокутника - ");
        side2 = in.nextDouble();

        System.out.println("площа прямокутника становить - " + areaCalculator(side1, side2));
        System.out.println("периметр прямокутника становить - " + perimeterCalculator(side1, side2));
    }
}
