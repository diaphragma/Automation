public class myClass {
    public static int myMethod(int a, int b) {
        int c = a + b; //sum of 2 numbers
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        myMethod(num1, num2);
    }
}