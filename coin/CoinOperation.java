import java.util.Scanner;

public class CoinOperation {

    public static void main(String[] args) {
        Coin loonie = new Coin("loonie", 1);
        Coin twoonie = new Coin("twoonie", 2);
        Coin quarter = new Coin("quarter", 25);
        Coin dime = new Coin("dime", 10);
        Coin nickel = new Coin("nickel", 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter amount");

        Float amt = Float.parseFloat(sc.nextLine());

        int intValue = amt.intValue();

        int precisionValue =(int) ((amt - intValue) * 100);

        if(amt >= 1) {
            System.out.println("Numbers of twoonie(s) required " + (intValue / twoonie.getValue()) + " Numbers of loonie(s) " + (intValue % twoonie.getValue()));
        }


        if((precisionValue%5) != 0.0)    precisionValue = (precisionValue - precisionValue%5);

        System.out.println("Require Numbers of Quarter(s) " + (precisionValue/quarter.getValue()) + "  dime(s) " + ((precisionValue%quarter.getValue())/dime.getValue() +
                "  Nickel(s)" + ((precisionValue%quarter.getValue())%dime.getValue())/nickel.getValue()));


    }
}
