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
        Footballer player1 = new Footballer("Popov", "forward", 27, 7, 5);
        Footballer player2 = new Footballer("Ivanov", "defender", 25, 3, 1);
        Footballer player3 = new Footballer("Zubenko", "goalkeeper", 26, 9, 0);
        Footballer player4 = new Footballer("Shevchenko", "forward", 26, 4, 7);

        Footballer[] arrplayer = {player1, player2, player3, player4};

        Footballer bestForward = null;
        for (int i = 0; i < arrplayer.length; i++) {
//            System.out.println(arrplayer[i]);
            if (arrplayer[i].role.equals("forward")){
//                System.out.println(arrplayer[i]);
                if (bestForward == null || arrplayer[i].golCount > bestForward.golCount){
                    bestForward = arrplayer[i];
                }
            }
        }
        System.out.println("The best forward is - " + bestForward.surname);

        for (int i = 0; i < arrplayer.length; i++) {
            if (arrplayer[i].gamesCount < 5){
                System.out.println("Player " + arrplayer[i].surname + " played less than 5 games - " + arrplayer[i].gamesCount);
            }
        }
    }
}
