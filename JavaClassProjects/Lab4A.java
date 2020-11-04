import java.util.Scanner;

public class Lab4A {

    static Scanner input = new Scanner(System.in);

    public static void quest1() {

        int i = 10;
        while (i++ < 23) {
            System.out.println(i);
        }

    }

    public static void quest2() {

        int i = 65;
        while (i++ < 99) {
            System.out.print(" " + i + " ");
        }

    }

    public static void quest3() {

        int i = -10;
        do {
            System.out.print(" " + i + " ");
        } while (i++ < 123);

    }

    public static void quest4() {

        String sInput = "";
        int num = 0, sum = 0, i = 0;

        while (i < 10) {
            System.out.println("Please Input Num: ");
            sInput = input.nextLine();
            if (Integer.parseInt(sInput) == -1)
                break;
            num = Integer.parseInt(sInput);
            sum += num;
            i++;
        }

        int average = sum / i;

        System.out.println("Average value is: " + average);
    }

    public static void quest5() {

        System.out.println("Input Number to multiply: ");
        int num = input.nextInt(), i = -1, result;

        while (i++ < 10) {

            result = num * i;

            System.out.println(num + " times " + i + " is: " + result);

        }

    }

    public static void quest6() {
        String inputData;
        int age;

        while (true) {  
            System.out.println("Input your age: ");
            inputData = input.nextLine();

            if (inputData.equalsIgnoreCase("STOP"))
                break;

            if (inputData.equalsIgnoreCase("STUDENT")){
                System.out.println("Student Rate");
                break;
            }

            age = Integer.parseInt(inputData);

            if (age <= 17)
                System.out.println("Child Rate");
            else if (age <= 5)
                System.out.println("Toddler Rate");
            else if (age >= 60)
                System.out.println("Senior Rate");
            else
                System.out.println("Adult Rate");
        }
    }

    public static void main(String[] args) {
        quest6();
    }

}