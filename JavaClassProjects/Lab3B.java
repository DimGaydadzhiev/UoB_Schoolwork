import java.util.Scanner;
import java.lang.Math;

public class Lab3B {

    static Scanner input = new Scanner(System.in);

    static void quest1() {

        String inputData;
        System.out.println("Input string");
        inputData = input.nextLine();
        String response = "", compr = "word";

        if (inputData.equalsIgnoreCase(compr)) {
            response = "MATCH";
            System.out.println(response);
        } else
            response = "NO MATCH";
        System.out.println(response);

    }

    static void quest2() {
        int inputVar;

        while (true) {
            inputVar = input.nextInt();

            if ((Math.abs(inputVar) - 10) < 0)
                break;

            System.out.println("Input valid value");
        }
        if (inputVar % 2 == 0)
            System.out.println("The target is even");
        else
            System.out.println("The target is odd");

        if (inputVar < 0)
            System.out.println("The target is negative");
        else if (inputVar > 0)
            System.out.println("The target is positive");
        else
            System.out.println("The target is 0");
    }

    static void quest3() { // THIS ISNT MY CODE, DON'T JUDGE ME FOR THIS.
        char inData;
        System.out.println("Enter a single character:");
        inData = input.next().charAt(0);
        switch (inData) {
            case 'a':
                System.out.println("The character was a");
                break;
            case 'b':
                System.out.println("The character was b");
                break;
            case 'c':
                System.out.println("The character was c");
                break;
            case 'd':
                System.out.println("The character was d");
                break;
            case 'e':
                System.out.println("The character was e");
                break;
            default:
                System.out.println("Unknown character!");
        }
    }

    static void quest4() { // I WAS FORCED TO WRITE THIS

        System.out.println("INPUT STRING: ");
        String inputString = input.nextLine();

        int strLen = inputString.length();

        switch (strLen) {
            case 10:
                System.out.print("3");
            case 9:
                System.out.print("5");
            case 8:
                System.out.print("6");
            case 7:
                System.out.print("2");
            case 6:
                System.out.print("9");
            case 5:
                System.out.print("5");
            case 4:
                System.out.print("1");
            case 3:
                System.out.print("4");
            case 2:
                System.out.print("1");
            case 1:
                System.out.print("3");
                break;

            default:
                System.out.print("WRONG STRING");
        }

    }

    public static void main(String[] args) {

        quest4();

    }
}
