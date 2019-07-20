package coin;

import java.util.Scanner;

public class CoinOperation {

    public static void main(String[] args) {
        final Coin loonie = new Coin("loonie", 1);
        final Coin twoonie = new Coin("twoonie", 2);
        final Coin quarter = new Coin("quarter", 25);
        final Coin dime = new Coin("dime", 10);
        final Coin nickel = new Coin("nickel", 5);

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

    public int requredCoins(Scanner sc){
        System.out.println(" Please enter a value");
        int value = sc.nextInt();

        int tempVal = value, numNickel, numDime, numQuarter, numlooney,numtwonnie;
        while(tempVal>0){

        }
        return 0;
    }
}
