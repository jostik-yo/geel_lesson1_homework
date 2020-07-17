package home_work_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Сейчас мы создадим несколько типов данных");

        System.out.println("Тип byte (8-битное знаковое целое число). Введите число в диапазоне от -128 до 127");
        byte a = scanner.nextByte();



        System.out.println("Тип short (16-битное знаковое целое число). Введите число в диапазоне от -32768 до 32767");
        short b = scanner.nextShort();


        System.out.println("Тип int (32-битное знаковое целое число). Введите число в диапазоне от -2147483648 до 2147483647");
        int c = scanner.nextInt();


        System.out.println("Тип long (64-битное знаковое целое число). Введите число в диапазоне от -9223372036854775808 до 9223372036854775807");
        long d = scanner.nextLong();


        System.out.println("Тип float (32-битное знаковое число с плавающей запятой одинарной точности). Введите число вида 12.23f");
        float e = scanner.nextFloat();


        System.out.println("Тип double (64-битное знаковое число с плавающей запятой двойной точности). Введите число вида 123.123");
        double f = scanner.nextDouble();


        System.out.println("Тип char (16-битный тип данных, предназначенный для хранения символов в кодировке Unicode\n). Введите число в диапазоне от '\\u0000' или 0 до '\\uffff' или 65,535");
        char g = (char) scanner.nextInt();


        System.out.println("Тип boolean (логический тип данных). Введите false или true");
        boolean h = (boolean) scanner.nextBoolean();


    }
}
