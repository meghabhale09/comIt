import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.print("Please enter a number");
        int num =  Integer.parseInt(scan.nextLine());
        isEven(num);

        scan.close();
    }

    public static void isEven(int num){
        String result;
        if(num%2==0) result="Even";
        else result="Odd";
            System.out.println(num + " Is an "+ result +" number");
    }
}
