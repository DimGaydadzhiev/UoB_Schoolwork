package JavaClassProjects.Lab5AB;

public class Index {

    public static void main(String[] args) {

        Student[] cohort = new Student[5];
        Course[] course = new Course[5];

        course[0] = new Course("Maths", 0);
        course[1] = new Course("SEng", 1);
        course[2] = new Course("Physio", 1);
        course[3] = new Course("Medicine", 3);
        course[4] = new Course("Cryptology", 2);

        cohort[0] = new Student("Vencislav Nachev", 24, "Paul Trundle", Student.assignID());
        cohort[0].assignCourse(course[0]);

        cohort[1] = new Student("Kostadin Durchov", 19, "Kiril Tomov", Student.assignID());
        cohort[1].assignCourse(course[1]);

        cohort[2] = new Student("Rand Paul", 42, "John Doe", Student.assignID());
        cohort[2].assignCourse(course[2]);

        cohort[3] = new Student("Rob Paul", 42, "Jane Doe", Student.assignID());
        cohort[3].assignCourse(course[2]);

        cohort[4] = new Student("Press", 21, "Jane Ver", Student.assignID());
        cohort[4].assignCourse(course[4]);

        System.out.println(Student.courseCount(cohort, "Physio"));

    }
}
