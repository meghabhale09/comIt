import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number");
        int n = Integer.parseInt(scan.nextLine());

        int num1 = 0, num2=1;

        int i =1;
        while(i<=n){
            System.out.print(" " + num1  + " ");
            int sum = num1 + num2;
            num1=num2;
            num2 = sum;
            i++;
        }
        scan.close();

    }
}
