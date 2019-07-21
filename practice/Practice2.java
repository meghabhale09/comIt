package practice;

import java.util.Scanner;
import static  java.lang.System.out;
public class Practice2 {
    public static  final  float CONVERSION_UNIT = 0.75f;
    public final int N = 20;
    public final double A = 30.5;

    public int findLargestNumber(int firstNum, int secondNum){
        if(firstNum>secondNum)  return firstNum;
        else return secondNum;
    }

    public float currencyConversion(float canadianDollar){
        return(CONVERSION_UNIT * canadianDollar);

    }

    public double add(){
        return((N + A) + (N - A));
    }

    public void isPositive(int num){
        if(num>=0)  out.println(num + "is positive");
        else out.println(num + " is negative");
    }

    public void salaryIncreament(int salary){
        if(salary<1000)
            salary += ((salary*15)/100);
        else    salary += ((salary*12)/100);
        out.println(salary);
    }


}
