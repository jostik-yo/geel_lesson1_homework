package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        doHello();

        Scanner scanner = new Scanner(System.in);
        doScanA();
        String a = scanner.next();

        System.out.println("Привет, " + a + "!");
        }



    static void doHello() {
        System.out.println("Как тебя зовут?");
    }
    static void doScanA() {
        System.out.println("Введите ваше имя");
    }
}

