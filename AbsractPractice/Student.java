package AbsractPractice;

import java.util.ArrayList;
import java.util.List;

public class Student extends Academic {
    public List<Registration> registrations;

    public Student(int id) {
        super(id);
        registrations = new ArrayList<>();
    }

    public  void add(Registration registration){
        registrations.add(registration);
    }

    public  void remove(int id){
        /*for (Registration r: registrations ) {

        }*/
        registrations.removeIf(registration -> registration.getId()==id);
    }

    public double calcAvg(){
        int sum = 0;
        for(Registration r : registrations){
            sum  += r.getGrade();
        }
        return sum/registrations.size();
    }

    public boolean isRegistered(Registration registration){
        return registrations.contains(registration);
    }

    @Override
    public String toString() {
        return "Student{" +
                "registrations=" + registrations +
                ", id=" + id +
                '}';
    }
}
