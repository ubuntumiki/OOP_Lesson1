//Поля
//Продавець, Найменування, Кількість, Ціна, Дата_продажу
//Визначити кількість товарів, які продані менше року тому і вивести відомості про них.

package com.example.practice.task3;

public class Article {
    private String seller;
    private String name;
    private int count;
    private double price;
    private int saleDate;

    public Article(String seller, String name, int count, double price, int saleDate) {
        this.seller = seller;
        this.name = name;
        this.count = count;
        this.price = price;
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "seller='" + seller + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", saleDate=" + saleDate +
                '}';
    }

    public static void main(String[] args) {
        Article article1 = new Article("Rozetka", "notebook", 3, 34_000, 2023);
        Article article2 = new Article("Rozetka", "monitor", 5, 18_000, 2024);
        Article article3 = new Article("Comfy", "mouse", 50, 50_000, 2025);

        Article[] arrArticle = {article1, article2, article3};

        for (int i = 0; i < arrArticle.length; i++) {
            if (arrArticle[i].saleDate < 2025){
                System.out.println(arrArticle[i]);
            }
        }
    }
}
