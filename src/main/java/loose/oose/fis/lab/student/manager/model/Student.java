package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.meanGrade, meanGrade) != 0) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(meanGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


