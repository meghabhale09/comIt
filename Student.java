public class Student {
    private String studentName;
    private int height;

    public Student(String studentName, int height) {
        this.studentName = studentName;
        this.height = height;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getHeight() {
        return height;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
