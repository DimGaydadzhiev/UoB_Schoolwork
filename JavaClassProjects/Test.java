import java.util.Random;

class Test {

    static Random rand = new Random();

    public static void main(String[] args) {

        int j = 0;

        while (j < 72) {
            int i = rand.nextInt(17);

            System.out.println(i);
            j++;
        }

    }

}