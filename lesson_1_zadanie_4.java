package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        doHello();

        Scanner scanner = new Scanner(System.in);
        doScanA();
        int a = scanner.nextInt();
        doScanB();
        int b = scanner.nextInt();


        int result = doCalculation(a, b);
        if ((result <= 20) && (result >= 10)) {
            System.out.println(true);
        }
        else {
            System.out.println(!true);
        }

    }

    static void doHello() {
        System.out.println("Привет! Сейчас мы посчитаем выражение вида (a + b). Если их сумма лежит в пределах от 10 до 20(включительно) выведем true, в противном случае – false");
    }
    static void doScanA() {
        System.out.println("Введите число a");
    }
    static void doScanB() {
        System.out.println("Введите число b");
    }

    public static int doCalculation(int a, int b) {
        return a + b;
    }
}
