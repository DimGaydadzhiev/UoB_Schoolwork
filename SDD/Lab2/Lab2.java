package SDD.Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int[] testArray = new int[10];
        int a = 1, b = 0;
        try {
            // System.out.println(testArray[11]);
            a = input.nextInt();
            a= a/b;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Input Exception: " + e.getMessage());
        }
        System.out.println("Exit");
    }
}