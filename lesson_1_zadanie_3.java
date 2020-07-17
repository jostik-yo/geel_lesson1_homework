package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        doHello();

        doScanA();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        doScanB();
        int b = scanner.nextInt();
        doScanC();
        int c = scanner.nextInt();
        doScanD();
        int d = scanner.nextInt();

        double result = doCalculation(a, b, c, d);
        System.out.println("Ответ = " + result);
    }

    static void doHello() {
        System.out.println("Привет! Сейчас мы посчитаем выражение вида (b + (c / d)) * a.");
    }
    static void doScanA() {
        System.out.println("Введите число a");
    }
    static void doScanB() {
        System.out.println("Введите число b");
    }
    static void doScanC() {
        System.out.println("Введите число c");
    }
    static void doScanD() {
        System.out.println("Введите число d");
    }
    public static double doCalculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
