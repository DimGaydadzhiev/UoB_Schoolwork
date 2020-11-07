package Lab5AB;

import java.util.LinkedList;

class Staff {

    static int staffCount=0;

    LinkedList<Course> tCrsList = new LinkedList<Course>();

    public void assignCourse(Course newCourse) {
        tCrsList.add(newCourse);
    }

    public void printTModules() {

        for (int i = 0; i < tCrsList.size(); i++)
            System.out.println(tCrsList.get(i).programmeName);

    }

    static int setStaffID(){
        staffCount++;

        return staffCount;
    }
    
}
