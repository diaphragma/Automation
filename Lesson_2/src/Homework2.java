import java.util.Scanner;

public class Homework2 {

    public static void overloadMethod(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of numbers:" + sum);
    }

    public static void overloadMethod(String words) {
        String[] word = words.split(" ");
        String firstWord = word[0];
        String lastWord = word[1];
        int length = 0;
        length = length + word[0].length() + word[1].length();
        System.out.println("Sum of letters:" + length);
    }

    public static void overloadMethod(float num) {
        if (num > 0) {
            System.out.println(true);
        } else if (num <= 0) {
            System.out.println(false);
        } else System.out.println("You didn't enter a number.");
    }


    public static <string> void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your number?");
        int number = input.nextInt();
        overloadMethod(number);

        input.nextLine();

        System.out.println("\nEnter your two words: ");
        String words = input.nextLine();
        overloadMethod(words);

        System.out.println("\nEnter your number again: ");
        float num = input.nextFloat();
        overloadMethod(num);

    }
}
