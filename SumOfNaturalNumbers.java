import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number");
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println(sum);
        scan.close();

    }
}