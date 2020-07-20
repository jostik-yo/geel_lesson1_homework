package Homework_lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// задание № 1
        byte[] a = new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeNumber(a)));
// задание № 2
        int[] b = new int[8];
        System.out.println(Arrays.toString(fillArray(b)));
// задание № 3
        int[] c = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(changeNumber2(c)));
// задание № 4 - не смог решить самостоятельно
        fillArray2();
// задание № 5 - не смог решить самостоятельно
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMax(array);
        findMin(array);

    }
    private static byte[] changeNumber(byte[]a) {

        for (int i = 0; i<= a.length - 1; i++) {
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
        }
        return a;

    }

    public static int[] fillArray(int[]b) {

        for (int i = 0; i < b.length; i++) {
            b[i] = i*3;
        }
        return b;
    }

    private static int[] changeNumber2(int[]c) {

        for (int i = 0; i<= c.length - 1; i++) {
            if (c[i] < 6) c[i] = c[i] * 2;
            else c[i] = c[i];
        }
        return c;

    }

    static void fillArray2() {

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        }

        static void findMax(int[] array) {
            int maxIndex = 0;
            int max = array[maxIndex];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
            }

            System.out.println(String.format("Максимальный элемент [%d] с индексом [%d]", max, maxIndex));
        }
    static void findMin(int[] array) {
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println(String.format("Минимальный элемент [%d] с индексом [%d]", min, minIndex));
    }


    }

