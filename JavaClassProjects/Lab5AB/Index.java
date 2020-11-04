package Lab5AB;

public class Index {

    public static void main(String[] args) {
        // Student st1= new Student("Herbert", 19,"Cybersecurity","Robert
        // David","Faculty of Informatics", 2, 214 );
        // System.out.print("\n");
        // st1.printSInfo();

        Student[] cohort = new Student[3];
        Course course = new Course("Mathematics", 4);

        for (int i = 0; i < 3; i++) {

            System.out.print("\n\n");
            cohort[i] = new Student("Herbert", 19, "Robert David", 214);
            cohort[i].crs = course;
            cohort[i].printSInfo();
            System.out.println("Their course is: " + cohort[i].crs.programmeName);
            System.out.print("\n\n");

        }
    }

}
