import java.util.Scanner;

public class Homework3 {
    public static void longestWord(String sentence) {
        String[] word = sentence.split(" ");
        String longword = "";
        for(int i = 0; i < word.length; i++) {
            if (word[i].length() > longword.length()) {
                longword = word[i];
            }
        }
        System.out.println(longword + " is the longest word with " + longword.length() + " characters. \n");
    }
    public static void christmasTree1(){
        System.out.println("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.println("*");
        System.out.println("*");
    }
    public static void christmasTree2(){
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print(" *");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("  *");
        System.out.print("*");
        System.out.println("*");
        System.out.print("   *");
        System.out.println("*");
        System.out.println("    *");
    }
    public static void christmasTree3(){
        System.out.println("    *");
        System.out.print("   *");
        System.out.println("*");
        System.out.print("  *");
        System.out.print("*");
        System.out.println("*");
        System.out.print(" *");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        longestWord(sentence);

        System.out.println("\nEnter your number of Month: ");
        int numberOfMonth = input.nextInt();
        Month.selectMonth(numberOfMonth);

        christmasTree1();
        christmasTree2();
        christmasTree3();
    }
}
