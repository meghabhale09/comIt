package practice;
public class Participants {
    int photoIdNumber;
    String sex;
    String job;
    int salary;

    public Participants(int photoIdNumber, String sex, String job, int salary) {
        this.photoIdNumber = photoIdNumber;
        this.sex = sex;
        this.job = job;
        this.salary = salary;
    }

    public int getPhotoIdNumber() {
        return photoIdNumber;
    }

    public void setPhotoIdNumber(int photoIdNumber) {
        this.photoIdNumber = photoIdNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}