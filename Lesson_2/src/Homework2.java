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

    public static void overloadMethod(String w1, String w2) {
        int length = 0;
        length = length + w1.length() + w2.length();
        System.out.println("Sum of letters:" + length);
    }

    public static boolean overloadMethod(float num) {
        if (num > 0) {
            System.out.println(true);
            return true;
        } else if (num <= 0) {
            System.out.println(false);
            return false;
        } else System.out.println("You didn't enter a number.");
        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your number?");
        int number = input.nextInt();
        overloadMethod(number);

        input.nextLine();

        System.out.println("\nEnter your first word: ");
        String firstWord = input.nextLine();
        System.out.println("\nEnter your second word: ");
        String lastWord = input.nextLine();
        overloadMethod(firstWord, lastWord);

        System.out.println("\nEnter your number again: ");
        float num = input.nextFloat();
        overloadMethod(num);

    }
}
