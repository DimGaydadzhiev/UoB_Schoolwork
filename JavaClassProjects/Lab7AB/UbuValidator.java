package JavaClassProjects.Lab7AB;

public class UbuValidator implements StringValidator {

    public boolean validate(String valString) {     //I was out of ideas, don't judge!

        String smallString = "UBU";

        if (valString.contains(smallString))
            return true;
        else
            return false;

    }

}
