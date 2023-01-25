package random;

import java.util.Random;

// Random class is used to generate any random no: with or with out in a bound
public class RandomDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        int n1 = obj.nextInt();
        System.out.println("number1: " + n1);

        long n2 = obj.nextLong(100);
        System.out.println("number2: " + n2);
    }
}
