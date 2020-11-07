package Lab5AB;

import java.util.ArrayList;

class Student {

    static int studentNum = 0;

    ArrayList<Course> crsList = new ArrayList<Course>();

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

    // STATIC METHODS
    public static int assignID() {
        studentNum++;

        return studentNum;
    }

    public static int studentCount() {

        return studentNum;
    }

    public static int courseCount(Student[] tempStdnt, String soughtCourse) {
        int count = 0;
        short i = 0;

        while (i < tempStdnt.length) {
            int j = 0;

            while (j < tempStdnt[i].crsList.size()) {
                if (soughtCourse.equals(tempStdnt[i].crsList.get(j).programmeName)) {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }

    public void printSInfo() {
        short i = 0;

        System.out.println("The student's name is: " + name);
        System.out.println("They are: " + age + " years old");
        System.out.println("Their PAT is: " + patTeach);
        System.out.println("The student's ID is: " + id);
        System.out.println("The student's course info is: ");
        while (i < crsList.size()) {
            System.out.println(crsList.get(i).programmeName);
            System.out.println("And their year of study is " + crsList.get(i).yearsOfStudy);
            i++;
        }

    }

    public void progressYear() {
        int i = 0;
        while (i < crsList.size()) {

            crsList.get(i).yearPlus();
            i++;
        }
    }

    public void assignCourse(Course newCourse) {
        crsList.add(newCourse);
    }
}