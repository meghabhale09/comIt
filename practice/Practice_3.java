package practice;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        printNumbers(1,3);
        System.out.println();

        printNumbers(1,9);
        System.out.println();

        printNumbers(1,10000);
        System.out.println();

        printNumbers(5,10);
        System.out.println();

        printSring(200,"Hello");
        System.out.println();

        squareNatural(30);
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = Integer.parseInt(scan.nextLine());
        sumNextHundredNaturalNum(num);
        System.out.println();

        tables(10);
    }

    public static void printNumbers(int beginNum, int endNum){
        for(int i = beginNum; i<=endNum; i++) System.out.print(i + "  ");
    }

    public static void printSring(int num, String value){
        for(int i=1;i<=num; i++) System.out.print(value + " ");
    }

    public static void squareNatural(int num){
        for(int i=1;i<=num; i++) System.out.print(i*i + " ");
    }

    public static void sumNextHundredNaturalNum(int num){
        int sum = 0;
        for(int i=num;i<=(num+100); i++) sum +=i;
            System.out.print("Sum is " + sum);
    }
    public static void tables(int num){
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }
    }


}
