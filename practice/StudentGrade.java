package practice;
import java.util.Scanner;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        int num = 5, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter? ");
        //num = Integer.parseInt(sc.nextLine());

        int[] grades = new int[Integer.parseInt(sc.nextLine())];

        for(int i=0;i<grades.length; i++){
            System.out.println("Please Enter element " + (i+1));
            grades[i] = Integer.parseInt(sc.nextLine());
            sum += grades[i];
        }
        System.out.println("Average of Grades is" + sum/num);
    }

}