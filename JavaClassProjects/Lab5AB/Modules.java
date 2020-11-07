package Lab5AB;

import java.util.LinkedList;

public class Modules {

    static int moduleCount = 0;
    int moduleId;
    String moduleTitle;
    LinkedList<String> moduleTeachers= new LinkedList<String>();

    public Modules(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }
}