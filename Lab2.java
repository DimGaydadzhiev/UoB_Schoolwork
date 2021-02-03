import java.io.IOException;

public class Lab2 {
    public static void main(String args[]) {
        int[] testArray = new int[10];
        try {
            System.out.println(testArray[11]);
            System.out.println("No IndexOutOfBoundsException");
            System.in.close();
            System.in.read();
            System.out.println("No IOException");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        System.out.println("Exit");
    }
}