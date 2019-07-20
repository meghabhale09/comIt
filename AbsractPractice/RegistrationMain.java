package AbsractPractice;

public class RegistrationMain {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1);
        Instructor instructor2 = new Instructor(2);

        Student student1 = new Student(11);
        Student student2 = new Student(12);
        Student student3 = new Student(13);
        Student student4 = new Student(14);

        Course java = new Course(1,"Java", "OOP Language", new Instructor(1));
        Course c = new Course(2,"C", "Structural Language", new Instructor(2));
        Course html = new Course(3,"HTML", "Markup Language", new Instructor(1));

        java.register(student1,200);
        System.out.println(student1 +"       " );

        java.register(student3,300);

        System.out.println(student3+ "       ");

        c.register(student2, 100);

        System.out.println(student2+ "       " );
        c.deregister(student2);
        System.out.println(student2);
        java.deregister(student1);
        System.out.println(student1);
        java.deregister(student4);

    }


}
