package Lab5AB;

public class Index {

    public static void main(String[] args) {

        Student[] cohort = new Student[3];
        Course course = new Course("Mathematics", 4);

        cohort[0] = new Student("Vencislav Nachev", 24, "Paul Trundle", 1);
        cohort[0].assignCourse(course);
        cohort[0].progressYear();

        cohort[0].printSInfo();

       // cohort[1] = new Student("Kostadin Durchov", 19, "Kiril Tomov", 1);
        //cohort[2] = new Student("Rand Paul", 42, "John Doe", 1);



    }
}
