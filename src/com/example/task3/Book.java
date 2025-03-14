//Завдання 3
//Використовуючи IDEA, створіть проєкт із пакетом. Потрібно: Створити клас Book (Main).
// Створити класи Title, Author та Content, кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

package com.example.task3;

import java.util.Scanner;

public class Book {
    private Author author;
    private Content content;
    private Title title;

    public Book(String author, String content, String title){
        this.author = new Author(author);
        this.content = new Content(content);
        this.title = new Title(title);
    }

    public void show(){
        author.show();
        content.show();
        title.show();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String author = in.next();
        String content = in.next();
        String title = in.next();
        Book book1 = new Book(author, content, title);
        book1.show();
    }
}
