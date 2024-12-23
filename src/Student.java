import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int ID = 1;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.ID = ID++;
        this.grades = new ArrayList<Integer>();
    }
    public void addGrade(int grade) {
            this.grades.add(grade);
    }
    public double getAverageGrade() {
        double sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + "I am a student with ID " + this.ID ;
    }
}