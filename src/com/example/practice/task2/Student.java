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

    public static void main(String[] args) {
        Student student1 = new Student("Shevchenko", "9-V", 6, 5, 2);
        Student student2 = new Student("Venger", "10-V", 5, 1, 3);
        Student student3 = new Student("Oros", "10-A", 7, 5, 9);
        Student student4 = new Student("Usyko", "10-V", 10, 12, 11);

        Student[] arrStudent = {student1, student2, student3, student4};

        double averagePoints = 0;
        for (int i = 0; i < arrStudent.length; i++) {
            averagePoints = (double) (arrStudent[i].physics + arrStudent[i].informatics + arrStudent[i].history) / 3;
            System.out.println(arrStudent[i].lastname + " average score is - " + averagePoints);
        }
        System.out.println("*".repeat(40));

        for (int i = 0; i < arrStudent.length; i++) {
            averagePoints = (double) (arrStudent[i].physics + arrStudent[i].informatics + arrStudent[i].history) / 3;
            if (averagePoints > 4){
                System.out.println(arrStudent[i].lastname + " has an average score above 4.");
            }
        }
    }
}
