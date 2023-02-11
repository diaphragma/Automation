import java.util.*;
import java.util.ArrayList;

public class Main {
    static int findMinDiff(int[] arr) {
        int diff = 100;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs((arr[i] - arr[j])) < diff) {
                    diff = Math.abs((arr[i] - arr[j]));
                }
            }
        }
        return diff;
    }

    static HashMap<Integer, String> convertListIntoHashMap(ArrayList<String> arrayList) {
        HashMap<Integer, String> bookhash = new HashMap<>();
        for (String bookTitle : arrayList) {
            int i = 0;
            bookhash.put(bookhash.size(), bookTitle);
        }
        return bookhash;
    }

    public static void main(String[] args) {
        int[] arr = {5, 11, 7, 20};
        System.out.println("Task #1");
        System.out.println("The minimum difference is: " + findMinDiff(arr));

        System.out.println("\nTask #2");
        ArrayList<String> books = new ArrayList<>(5);
        books.add("1984");
        books.add("The Lord of the Rings");
        books.add("Afterlives");
        books.add("A Heart That Works");
        books.add("Ancestor Trouble");
        System.out.println(convertListIntoHashMap(books));

        System.out.println("\nTask #3");

    }
}