import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.print("Please enter a number");
        int num1 =  Integer.parseInt(scan.nextLine());

        System.out.print("Please enter a number");
        int num2 =  Integer.parseInt(scan.nextLine());

        System.out.print("Please enter a number");
        int num3 =  Integer.parseInt(scan.nextLine());

        usingLogicalOPerator(num1,num2,num3);
        scan.close();
    }

    public static  void usingNesetIf(int num1,int num2, int num3){
        int largestNum;
        if(num1>num2){
            if(num1>num3) largestNum = num1;
            else largestNum = num3;
        }else if (num2>num3){
            largestNum = num2;
        }else largestNum = num3;
        System.out.println("The lrgest number is " + largestNum);
    }

    public static  void  usingLogicalOPerator(int num1,int num2, int num3){
        int largestNum;
        if(num1>num2 && num1>num3)  largestNum = num1;
        else if (num2>num3) largestNum = num2;
        else    largestNum = num3;
        System.out.println("The lrgest number is " + largestNum);

    }

}
