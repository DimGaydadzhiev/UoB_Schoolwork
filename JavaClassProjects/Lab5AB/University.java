package JavaClassProjects.Lab5AB;

import java.util.ArrayList;

public class University {

    ArrayList<Student> stdntList = new ArrayList<Student>();
    ArrayList<Staff> stffList = new ArrayList<Staff>();
    ArrayList<Course> taughtCourses = new ArrayList<Course>();

    static int stdntCount() {
        return Student.studentNum;
    }

    static int stffCount() {
        return Staff.staffCount;
    }

    int moduleLeadSearch(String module, String course) {        // THIS IS MADNESS

        for (int i = 0; i < taughtCourses.size(); i++) {    //Look through taught courses

            if (course.equals(taughtCourses.get(i).programmeName)) {    //If it's the course we're searching for
                for (int j = 0; j < taughtCourses.get(i).modlList.size(); j++) {   //Look through modules in course

                    if (module.equals(taughtCourses.get(i).modlList.get(j).moduleTitle)) {  //If it's the right module
                        for (int k = 0; k < taughtCourses.get(i).modlList.get(j).moduleTeachers.size(); k++) { //Print list of teachers.

                            System.out.print(" " + taughtCourses.get(i).modlList.get(j).moduleTeachers.get(k));
                        }
                        return 0;           //Cut it short as it's way too slow as is
                    }
                }
            }
        }
        return 1;       
    }
}
