//Поля
//Прізвище - Група - Фізика - Інформ -Історія
//Визначити середній бал оцінок з всіх предметів,
// і вивести відомості про студентів, середній бал яких більший за 4.

package com.example.practice.task2;

public class Student {
    private String lastname;
    private String group;
    private int physics;
    private int informatics;
    private int history;

    public Student(String lastname, String group, int physics, int informatics, int history) {
        this.lastname = lastname;
        this.group = group;
        this.physics = physics;
        this.informatics = informatics;
        this.history = history;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getInformatics() {
        return informatics;
    }

    public void setInformatics(int informatics) {
        this.informatics = informatics;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}
