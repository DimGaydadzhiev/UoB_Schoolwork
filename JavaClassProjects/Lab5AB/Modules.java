package Lab5AB;

import java.util.ArrayList;

public class Modules {

    static int moduleCount = 0;
    int moduleId;
    String moduleTitle;
    ArrayList<String> moduleTeachers= new ArrayList<String>();

    public Modules(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }
}