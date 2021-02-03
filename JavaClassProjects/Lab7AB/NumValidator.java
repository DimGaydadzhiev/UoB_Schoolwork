package JavaClassProjects.Lab7AB;

public class NumValidator implements StringValidator {

    public boolean validate(String valString) {

        char[] tempChar = new char[valString.length()];

        for (int i = 0; i < valString.length(); i++) {
            tempChar[i] = valString.charAt(i);

            if (Character.isDigit(tempChar[i])) {
                return true;
            }
        }

        return false;

    }

}
