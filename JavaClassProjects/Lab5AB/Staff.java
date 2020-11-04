package Lab5AB;

import java.util.Scanner;

class Staff {

    static Scanner input = new Scanner(System.in);

    private int modulesTaughtN;
    private String[] modulesTaught = new String[modulesTaughtN];

    public Staff(int modulesTaughtN) {
        this.modulesTaughtN = modulesTaughtN;
    }

    public void setMTaught(String tModule) {

        for (int i = 0; i < modulesTaughtN; i++) {
            System.out.println("Input Module " + (i + 1) + "Name: ");
            modulesTaught[i] = input.nextLine();
        }

    }

    public void printMTaught() {
        for (int i = 0; i < modulesTaughtN; i++) {
            System.out.println(modulesTaught[i]);
        }
    }

}
