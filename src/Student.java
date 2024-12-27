import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int nextID = 1;
    private int ID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.ID = nextID++;
        this.grades = new ArrayList<>();
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
        return super.toString() + " I am a student with ID " + this.ID + " and average grade " + getAverageGrade();
    }
}
