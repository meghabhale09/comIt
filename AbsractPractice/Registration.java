package AbsractPractice;

public class Registration {
    private int id;
    private int grade;

    public Registration(int id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
