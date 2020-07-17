package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        doHello();

        Scanner scanner = new Scanner(System.in);
        doScanA();
        int a = scanner.nextInt();


        if (a >= 0) {
            System.out.println("Введено положительное число");
        }
        else {
            System.out.println("Введено отрицательное число");
        }

    }

    static void doHello() {
        System.out.println("Привет! Сейчас мы выясним - введенное число положительное или отрицательное?");
    }
    static void doScanA() {
        System.out.println("Введите число");
    }
}
