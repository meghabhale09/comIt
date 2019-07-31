package personWeight;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String name = (scan.nextLine());

        System.out.println("Please Enter Age:" );
        int age = (Integer.parseInt(scan.nextLine()));

        System.out.println("Please Enter Height (in Meters):" );
        float height = (Float.parseFloat(scan.nextLine()));

        System.out.println("Please enter weight (kg):" );
        int weight = (Integer.parseInt(scan.nextLine()));

        System.out.println("Please Enter gender:" );
        char gender = (scan.nextLine().toUpperCase().charAt(0));

        Person person1 = new Person(name,age,gender,weight,height);
        Person person2 = new Person("John",17,'M');
        Person person3 = new Person();

        setAttributes(person3,"Sam", 'M', 17,48,100);

        showResults(person1);
        showResults(person2);
        showResults(person3);
    }

    public static void showResults(Person p){
        System.out.println("" + p.getName() + " has " + calcWeight(p) );
        System.out.println("" + p.getName() + " has " + leagalAge(p) );

    }

    public static void setAttributes(Person person,String name, char gender, int age, int weight, int height){
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
        person.setWeight(weight);
        person.setHeight(height);
    }

    public static String calcWeight(Person p){
        int i = p.calculate();
        if(i>0) return "Over Weight";
        else if(i<0) return "Under Weight";
        else return "Ideal Weight";
    }

    public static String leagalAge(Person p){
        if(p.isOver()) return "legal age";
        return "Not legal age";
    }

}
