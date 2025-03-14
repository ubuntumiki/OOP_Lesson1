//Поля
//Прізвище - Амплуа - Вік - Кількість ігор - Кількість голів
//Визначити найкращого форварда, і вивести відомості про футболістів, які зіграли менше 5 ігор.

package com.example.practice.task1;

public class Footballer {
    String surname;
    String role;
    int age;
    int gamesCount;
    int golCount;

//    public Forward(){}

    public Footballer(String surname, String role, int age, int gamesCount, int golCount) {
        this.surname = surname;
        this.role = role;
        this.age = age;
        this.gamesCount = gamesCount;
        this.golCount = golCount;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", gamesCount=" + gamesCount +
                ", golCount=" + golCount +
                '}';
    }

    public static void main(String[] args) {
        Footballer player1 = new Footballer("Popov", "forward", 27, 12, 5);
        Footballer player2 = new Footballer("Ivanov", "defender", 25, 10, 1);
        Footballer player3 = new Footballer("Zubenko", "goalkeeper", 26, 13, 0);
        Footballer player4 = new Footballer("Shevchenko", "forward", 26, 9, 7);

//        System.out.println(player1);

        Footballer[] arrplayer = {player1, player2, player3, player4};

        for (int i = 0; i < arrplayer.length; i++) {
            System.out.println(arrplayer[i]);
        }
    }
}
