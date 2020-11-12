
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class testClass {

    public static void main(String[] args) {

        LinkedList<Integer> testList = new LinkedList<Integer>();
        int a, b, sumab = 0;
        int e, c;

        for (int i = 1; i <= 49; i++) {
            testList.add(i);

        }

        while (testList.size() > 0) {

            Random rand = new Random(0 - testList.size());

            a = rand.nextInt();
            b = rand.nextInt();

            e = testList.get(a);
            c = testList.get(b);

            if (a == b) {
                testList.remove(a);

            } else {
                testList.remove(a);
                testList.remove(b);

            }

            sumab = a + b + sumab;

        }

    }

}