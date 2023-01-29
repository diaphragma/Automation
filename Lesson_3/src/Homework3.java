import java.util.Scanner;

public class Homework3 {
    public static void longestWord(String w1, String w2, String w3) {
        String longword = "";
        if (w1.length() > w2.length() && w1.length() > w3.length()) {
            longword = w1;
            System.out.println(longword + " is the longest word with " + longword.length() + " characters. \n");
        } else if (w2.length() > w1.length() && w2.length() > w3.length()) {
            longword = w2;
            System.out.println(longword + " is the longest word with " + longword.length() + " characters. \n");
        } else if (w3.length() > w1.length() && w3.length() > w1.length()) {
            longword = w3;
            System.out.println(longword + " is the longest word with " + longword.length() + " characters. \n");
        } else System.out.println("There is no the longest word");
    }

    public static void christmasTree1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void christmasTree2() {
        for (int i = 1; i <= 6 - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6 - 1; k >= i; k--) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void christmasTree3() {
        for (int i = 1; i <= 6 - 1; i++) {
            for (int k = 6 - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();

        System.out.println("Enter third word: ");
        String thirdWord = input.nextLine();

        longestWord(firstWord, secondWord, thirdWord);

        System.out.println("\nEnter your number of Month: ");
        int numberOfMonth = input.nextInt();
        Month.selectMonth(numberOfMonth);

        christmasTree1();
        christmasTree2();
        christmasTree3();
    }
}
