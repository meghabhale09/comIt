package AbsractPractice;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private String description;
    private Instructor instructor;
    private List<Registration> registrations;

    public Course(int id, String name, String description, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instructor = instructor;
        this.registrations = new ArrayList<>();
    }

    public void register(Student student,int grade){
        Registration registration = new Registration((int)(5*Math.random()),grade);
        registrations.add(registration);
        student.registrations.add(registration);
    }

    public boolean deregister(Student student){
       return registrations.removeIf(registration -> student.isRegistered(registration));
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", instructor=" + instructor +
                ", registrations=" + registrations +
                '}';
    }
}
