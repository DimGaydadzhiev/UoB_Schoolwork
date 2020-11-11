public class Lab3A {

    public static void vArgTest(Object... number) {
        int i = 0;
        while (i < number.length) {
            System.out.println(number[i]);
            i++;
        }
    }

    public static int fibbonaci(int fibInt) {

        int fibInt1 = 0, fibInt2 = 1, fibIntFinal = 0, i = 0;

        while (i < fibInt) {
            i++;

            fibIntFinal = fibInt1 + fibInt2;
            fibInt1 = fibInt2;
            fibInt2 = fibIntFinal;
        }
        return fibIntFinal;
    }

    public static void main(String[] args) {

        // int testInt = 209;
        // byte testByte = (byte) testInt;
        // String s1 = String.format("%8s", Integer.toBinaryString(testByte &
        // 0xFF)).replace(' ', '0');
        // vArgTest((testByte & 0xFF), testInt, s1);
        vArgTest(fibbonaci(9));
    }

}
