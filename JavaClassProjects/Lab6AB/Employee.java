package JavaClassProjects.Lab6AB;

class Employee { // this is an exercise class

    private String jobTitle, name;
    private double salary; // Yes, it's a double, no using double to store money, I know

    public Employee(String jobTitle, String name, double salary) {
        this.jobTitle = jobTitle;
        this.name = name;
        this.salary = salary;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double incrementSalary() { // It increases the salary by 2% each time it's called.
        double temp = salary * 0.02;
        this.salary = this.salary + temp;
        return this.salary;
    }
}
