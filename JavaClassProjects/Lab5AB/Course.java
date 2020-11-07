package Lab5AB;

import java.util.ArrayList;

class Course {

    ArrayList<Modules> modlList = new ArrayList<Modules>();

    String programmeName;
    int yearsOfStudy;

    public Course(String programmeName, int yearsOfStudy) {
        this.programmeName = programmeName;
        this.yearsOfStudy = yearsOfStudy;
    }

    public void yearPlus() {
        yearsOfStudy++;
    }
}