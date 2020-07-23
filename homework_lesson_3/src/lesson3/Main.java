package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        guessNumber();
        guessWord();

    }

    static void guessNumber() {
        Random random = new Random();
        Scanner enteredNumber = new Scanner(System.in);

        int guessedNumber = 100;
        int hiddenNumber = random.nextInt(10);

        while (guessedNumber != hiddenNumber) {
            System.out.print("Угадай номер от 0 до 9 ");
            guessedNumber = enteredNumber.nextInt();
            if (hiddenNumber < guessedNumber) {
                System.out.println("Загаданное число меньше");
            } else if (hiddenNumber > guessedNumber) {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Ты выйграл!!!");
    }

    static void guessWord() {
        Random random = new Random();
        Scanner enteredWord = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int numberOfWords = words.length;
        int numberWord = random.nextInt(numberOfWords + 1);

        String hiddenWord = words[random.nextInt(25)];
        int a = hiddenWord.length();
        System.out.println(a);
        System.out.println(hiddenWord);
        String guessedWord = "kolobok";
        System.out.print("Угадай загаданное слово из apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea, peanut, pear, pepper, pineapple, pumpkin, potato" + "\n");


        while (guessedWord != hiddenWord) {

            guessedWord = enteredWord.next();
            if (guessedWord != hiddenWord) {
                for (int i = 0; i < a; i++) {
                    if (hiddenWord.charAt(i) == guessedWord.charAt(i)) {

                        char[] newWord = {hiddenWord.charAt(i)};
                        System.out.println(newWord);

                    } else {
                        System.out.println("*");}

                }

            } else {System.out.println("Угадал!!!");}
        }



    }



}
