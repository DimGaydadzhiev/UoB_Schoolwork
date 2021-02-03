package JavaClassProjects.Lab5AB;

import java.util.ArrayList;

public class Modules {

    static int moduleCount = 0;
    int moduleId;
    String moduleTitle;
    ArrayList<String> moduleTeachers = new ArrayList<String>();

    public Modules(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public Modules() {
    }

    public Modules(int moduleId, String moduleTitle, ArrayList<String> moduleTeachers) {
        this.moduleId = moduleId;
        this.moduleTitle = moduleTitle;
        this.moduleTeachers = moduleTeachers;
    }

    public int getModuleId() {
        return this.moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleTitle() {
        return this.moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }
    
}