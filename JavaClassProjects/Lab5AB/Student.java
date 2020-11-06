package Lab5AB;

import java.util.LinkedList;
import java.util.Iterator;

class Student {

    static int studentNum;

    LinkedList<Course> crsList = new LinkedList<Course>();
        Iterator it= crsList.iterator();

    String name;
    int age;
    String patTeach;
    int id;

    public Student(String name, int age, String patTeach, int id, int numCourses) {
        this.name = name;
        this.age = age;
        this.patTeach = patTeach;
        this.id = id;
        this.numCourses = numCourses;
    }

    public void printSInfo() {

        System.out.println("The student's name is: " + name);
        System.out.println("They are: " + age + " years old");
        System.out.println("Their PAT is: " + patTeach);
        System.out.println("The student's ID is: " + id);

    }

    public void progressYear() {
      
        while(it.hasNext()){
            crsList.set(it, crsList);

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