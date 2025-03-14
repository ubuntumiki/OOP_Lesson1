//Поля
//Прізвище - Амплуа - Вік - Кількість ігор - Кількість голів
//Визначити найкращого форварда, і вивести відомості про футболістів, які зіграли менше 5-ти ігор.

package com.example.practice.task1;

public class Forward {
    private String surname;
    private String role;
    private int age;
    private int gamesCount;
    private int golCount;

//    public Forward(){}

    public Forward(String surname, String role, int age, int gamesCount, int golCount) {
        this.surname = surname;
        this.role = role;
        this.age = age;
        this.gamesCount = gamesCount;
        this.golCount = golCount;
    }

    public static void main(String[] args) {
        Forward forward1 = new Forward("Popov", "forward", 27, 12, 5);
    }
}
