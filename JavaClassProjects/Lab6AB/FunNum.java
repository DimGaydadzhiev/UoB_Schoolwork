package Lab6AB;

import java.lang.Math;

public class FunNum {

    static private boolean oddEven(int num) {

        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    static private boolean primeCheck(int num) {

        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static private boolean fibIntCheck(int num) {

        int fibInt1 = 0, fibInt2 = 1, fibSum = 0;

        while (fibSum <= num) {
            fibSum = fibInt1 + fibInt2;
            fibInt1 = fibInt2;
            fibInt2 = fibSum;

            if (num == fibSum)
                return true;

        }
        return false;
    }

    static public void fun(int num) {

        // Check if the number is odd
        if (oddEven(num))
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

        // Check if the number is a prime
        if (primeCheck(Math.abs(num)))
            System.out.println("The number is prime");
        else
            System.out.println("The number is composite");

        // Check if the number is part of the fibonacci sequence
        if (fibIntCheck(num))
            System.out.println("The number is fibonacci");
        else
            System.out.println("The number is not fibonacci");

        if (num < 0)
            System.out.println("The number is negative");

    }

}
