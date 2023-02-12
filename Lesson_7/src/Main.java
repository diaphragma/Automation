import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int[] array(int arr[]) {
        int[] res = new int[10];
        try {
            for (int i = 0; i < arr.length; i++) {
                res[i] = arr[i] / 0;
            }
        } catch (ArithmeticException arithmetic) {
            System.out.println("Caught arithmetic exception");
        }
        return res;
    }

    public static List<String> uaPhoneValidation(List<String> phones) {
        String regex = "^\\+[38]{2}[0-9]{10}$";
        Pattern number = Pattern.compile(regex);
        for (String valid : phones) {
            Matcher matcher = number.matcher(valid);
            System.out.println(valid + " : " + matcher.matches());
        }
        return phones;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Task #1");
        System.out.println("Divided array: " + Arrays.toString(array(arr)));

        System.out.println("\nTask #2");
        List<String> numbers = new ArrayList<>();
        numbers.add("+380675143284");
        numbers.add("+38");
        numbers.add("");
        numbers.add("0965143284");
        numbers.add("+380483902840932");
        numbers.add("+380965143284");
        numbers.add("+38096F143284");
        numbers.add("+480965143284");
        uaPhoneValidation(numbers);
    }
}