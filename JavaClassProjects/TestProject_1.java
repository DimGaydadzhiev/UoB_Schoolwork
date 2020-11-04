
import java.util.Scanner;

public class TestProject_1 {

    static Scanner input = new Scanner(System.in);

    static double quest1(double a, double b) {

        if (a < b)
            return a;
        else
            return b;
    }

    static double quest2() {
        double currNumb, sum = 0;
        int ctrVar = 0;

        while (ctrVar < 10) {
            currNumb = input.nextDouble();
            sum = sum + currNumb;
            ctrVar++;
        }
        return sum;
    }

    static double quest3(int iterationsNum) {
        double resultVar = 1;

        while (iterationsNum > 0) {
            resultVar = resultVar * 2;
            iterationsNum--;
        }

        return resultVar;
    }

    static double quest4 (int iterationsNum){
        double currNumb, biggestNumb=0;
        int ctrVar=0;

        while (ctrVar< iterationsNum){
            currNumb= input.nextDouble();
                if(ctrVar== 0) biggestNumb= currNumb;

            if(biggestNumb < currNumb) biggestNumb= currNumb;

            ctrVar++;
        }
        return biggestNumb;
    }

    public static void main(String[] args) {

        System.out.print(quest3(10));


        

    }
}
