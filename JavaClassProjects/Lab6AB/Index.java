package Lab6AB;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        PetRecord usersPet = new PetRecord("Jane Doe");
        System.out.println("My records on your pet are inaccurate");
        System.out.println("Here is what they currently say:");
        usersPet.writeOutput();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the correct pet name:");
        String correctName = keyboard.nextLine();

        System.out.println("Please enter the correct pet age:");
        int correctAge = keyboard.nextInt();

        System.out.println("Please enter the correct pet weight:");
        double correctWeight = keyboard.nextDouble();

        usersPet.setAll(correctName, correctAge, correctWeight);
        System.out.println("My updated records now say:");
        usersPet.writeOutput();

        keyboard.close();
    }

}
