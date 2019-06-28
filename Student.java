public class Student_Height_Data {
    private String studentName;
    private int height;

    public Student_Height_Data(String studentName, int height) {
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
