package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter shop = new Counter();

        Thread sh1 = new Thread(null, () -> shop.summa(shop.sales()), "Магазин 1");
        Thread sh2 = new Thread(null, () -> shop.summa(shop.sales()), "Магазин 2");
        Thread sh3 = new Thread(null, () -> shop.summa(shop.sales()), "Магазин 3");

        sh1.start();
        sh2.start();
        sh3.start();

        sh3.join();
        sh2.join();
        sh1.join();

        System.out.println("Общая выручка: "+shop.getSum());

    }
}
