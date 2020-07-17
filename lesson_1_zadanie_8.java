package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        doHello();

        Scanner scanner = new Scanner(System.in);
        doScanA();
        int a = scanner.nextInt();

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Введенный год " + a +" високосный!");
        } else {
            System.out.println("Введенный год " + a +" не является високосным!");
        }
        }



    static void doHello() {
        System.out.println("Привет! Сейчас мы выясним является ли введенный тобой год високосным. Я потратил около 4 часов на подбор условия и в итоге не заметил как оно само собой появилось в этом коде.");
    }
    static void doScanA() {
        System.out.println("Введите год");
    }



}

