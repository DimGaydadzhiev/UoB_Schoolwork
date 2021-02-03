package JavaClassProjects;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class testClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        LinkedList<Integer> testList = new LinkedList<Integer>();
        int indexA = 0, indexB = 0, sum = 0;
        int valA = 0, valB, cntr;
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {

            testList.add(i);

        }

        for (int j = 1; j < n; j++) {

            cntr = testList.size() - 1;

            indexA = rand.nextInt(cntr);
            valA = testList.get(indexA);
            testList.remove(indexA);

            cntr = testList.size() - 1;

            if (cntr < 1) {
                sum = Math.abs(valA - testList.get(0));
                break;

            }

            indexB = rand.nextInt(cntr);
            valB = testList.get(indexB);
            testList.remove(indexB);

            sum = Math.abs(valA - valB);

            testList.add(sum);

        }

        System.out.println(sum);
    }

}