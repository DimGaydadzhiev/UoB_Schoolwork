package Lab5AB;

class Course {

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