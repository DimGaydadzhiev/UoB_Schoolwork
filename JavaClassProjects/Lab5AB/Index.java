package Lab5AB;

public class Index {

    public static void main(String[] args) {

        Student[] cohort = new Student[3];
        Course course = new Course("Mathematics", 4);

        cohort[0] = new Student("Vencislav Nachev", 24, "Paul Trundle", cohort[0].assignID());
        cohort[1] = new Student("Kostadin Durchov", 19, "Kiril Tomov", cohort[1].assignID());
        cohort[2] = new Student("Rand Paul", 42, "John Doe", cohort[2].assignID());



    }
}
