package Lab5AB;

class Student {

    static int studentNum;
    Course[] crs;
    int numCourses = 1;

    String name;
    int age;
    String patTeach;
    int id;

    public Student(String name, int age, String patTeach, int id) {
        this.name = name;
        this.age = age;
        this.patTeach = patTeach;
        this.id = id;
    }

    public void printSInfo() {

        System.out.println("The student's name is: " + name);
        System.out.println("They are: " + age + " years old");
        System.out.println("Their PAT is: " + patTeach);
        System.out.println("The student's ID is: " + id);

    }

    public void progressYear() {
        int i = 0;
        while (i < crs.length) {
            crs[i].yearsOfStudy++;
            i++;
        }
    }

    public int assignID() {
        studentNum++;
        id = studentNum;

        return id;
    }

    public void assignCourse() {

    }
}