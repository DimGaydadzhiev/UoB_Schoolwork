package JavaClassProjects;

import java.util.Random;

public class Lab4B {

    static Random randVal = new Random();

    /**
     * Scans array for max value, returns the sum of all elements. Prints the max
     * value, min val. index and max val. index.
     * 
     * @param testArra
     * @return int
     */
    public static int quest1(int[] testArra) {

        int sum = 0, i = -1, minIndex = 0, maxIndex = 0, minVal, maxVal;

        i = -1;
        minVal = testArra[0];
        maxVal = testArra[0];

        while (i++ < testArra.length - 1) {
            sum += testArra[i];

            if (maxVal < testArra[i]) {
                maxIndex = i;
                maxVal = testArra[i];
            }
            if (minVal > testArra[i]) {

                minVal = testArra[i];
                minIndex = i;
            }
        }

        System.out.println("Max val is: " + sum + " the min index is: " + minIndex + " the max index is: " + maxIndex);

        return sum;
    }

    /**
     * Sorts an array with the most basic implementation of swap sort.
     * 
     * @param testArra
     */
    public static void SwapSort1(int[] testArra) {

        int i = -1, tempVar;

        for (i = 0; i < testArra.length; i++) {

            for (int j = i + 1; j < testArra.length; j++) {

                if (testArra[i] > testArra[j]) {

                    tempVar = testArra[i];
                    testArra[i] = testArra[j];
                    testArra[j] = tempVar;

                }
            }
        }
    }

    /**
     * Sorts an array with a swap sort that only performs one swap per cycle.
     * 
     * @param testArra
     */
    public static void SwapSort2(int[] testArra) {

        int i = -1, tempVar;

        for (i = 0; i < testArra.length; i++) {
            int tempInd = i;

            for (int j = i + 1; j < testArra.length; j++) {

                if (testArra[j] < testArra[tempInd]) {
                    tempInd = j;
                }
            }

            if (i != tempInd) {
                tempVar = testArra[i];
                testArra[i] = testArra[tempInd];
                testArra[tempInd] = tempVar;
            }
        }
    }

    /**
     * Basic bubblesort. Nothing fancy.
     * 
     * @param testArra
     */
    public static void BubbleSort1(int[] testArra) {

        int tempVar;

        for (int k = 1; k < testArra.length; k++) {
            for (int j = 0; j < testArra.length - k; j++) {
                if (testArra[j] > testArra[j + 1]) {

                    tempVar = testArra[j];
                    testArra[j] = testArra[j + 1];
                    testArra[j + 1] = tempVar;

                }
            }
        }
    }

    /**
     * Basic bubblesort but it stops if the array is already sorted.
     * 
     * @param testArra
     */
    public static void BubbleSort2(int[] testArra) {

        int tempVar;
        boolean passAnew = true;
        while (passAnew) {
            passAnew = false;

            for (int i = 0; i < testArra.length - 1; i++) {

                if (testArra[i] > testArra[i + 1]) {

                    tempVar = testArra[i];
                    testArra[i] = testArra[i + 1];
                    testArra[i + 1] = tempVar;
                    passAnew = true;
                }
            }
        }
    }

    /**
     * Bubblesort but the range of scan decreases with every iteration. It stops if
     * already sorted.
     * 
     * @param testArra
     */
    public static void BubbleSort3(int[] testArra) {
        int range = testArra.length, tempVar;

        boolean runAnew = true;

        while (runAnew) {
            range--;
            runAnew = false;

            for (int i = 0; i < range; i++) {

                if (testArra[i] > testArra[i + 1]) {
                    tempVar = testArra[i];
                    testArra[i] = testArra[i + 1];
                    testArra[i + 1] = tempVar;

                    runAnew = true;
                }
            }
        }
    }

    /**
     * Bubble sort. Range of scan decreases every iteration. Stops if already
     * sorted. Only one swap per cycle.
     * 
     * @param testArra
     */
    public static void BubbleSort4(int[] testArra) {
        int currLowInd = 0, currHighInd = testArra.length - 1, tempVar;
        while (currLowInd < currHighInd) {

            int highInd = currHighInd;
            int lowInd = currLowInd;
            currLowInd = testArra.length;

            for (int i = lowInd; i < highInd; i++) {
                if (testArra[i] > testArra[i + 1]) {

                    tempVar = testArra[i];
                    testArra[i] = testArra[i + 1];
                    testArra[i + 1] = tempVar;

                    if (i < currLowInd) {
                        currLowInd = i - 1;
                        if (currLowInd < 0)
                            currLowInd = 0;

                    } else if (i > currHighInd)
                        currHighInd = i + 1;
                }
            }
        }
    }

    /**
     * @param testArra
     */
    public static void quest7(double[] testArra) {
        int arraCtr = 0;
        boolean subTen = true;

        double tempVar, avrSum = 0;

        for (int i = 0; i < testArra.length; i++) {
            int tempInd = i;

            for (int j = i + 1; j < testArra.length; j++) {

                if (testArra[j] < testArra[tempInd]) {
                    tempInd = j;
                }
            }
            if (i != tempInd) {
                tempVar = testArra[i];
                testArra[i] = testArra[tempInd];
                testArra[tempInd] = tempVar;
            }
        }

        while (subTen) {
            subTen = false;

            if (testArra[arraCtr] < 10.0) {
                arraCtr++;
                subTen = !(subTen);
            }
        }

        double sortedArra[] = new double[arraCtr];

        for (int k = 0; k < arraCtr; k++) {
            sortedArra[k] = testArra[k];
            avrSum = avrSum + sortedArra[k];
        }

        for (int k = 0; k < arraCtr; k++) {
            System.out.print(" " + sortedArra[k]);
        }

        System.out.println("\n" + avrSum);

    }

    public static void main(String[] args) {

        int testArra[] = new int[16];
        for (int i = 0; i < testArra.length; i++)
            testArra[i] = randVal.nextInt(1000);

        double testDArra[] = new double[16];
        for (int i = 0; i < testDArra.length; i++)
            testDArra[i] = randVal.nextInt(40);

        quest7(testDArra);

        // for (int i = 0; i < testArra.length; i++)
        // System.out.print(" " + testArra[i] + " ");
    }

}
