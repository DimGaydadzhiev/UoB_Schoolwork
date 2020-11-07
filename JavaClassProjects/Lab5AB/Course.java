package Lab5AB;
import java.util.LinkedList;

class Course {

LinkedList<Modules> modlList= new LinkedList<Modules>();

    String programmeName;
    int yearsOfStudy;


    public Course(String programmeName, int yearsOfStudy) {
        this.programmeName = programmeName;
        this.yearsOfStudy = yearsOfStudy;
    }

    public void yearPlus(){
        yearsOfStudy++;
    }
}