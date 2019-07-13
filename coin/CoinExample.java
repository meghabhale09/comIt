import java.util.Scanner;

public class CoinExample {
    public static void main(String[] args) {
        Coin loonie = new Coin("loonie", 1);
        Coin twoonie = new Coin("twoonie", 2);
        Coin quarter = new Coin("quarter", 25);
        Coin dime = new Coin("dime", 10);
        Coin nickel = new Coin("nickel", 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter amount");

        float amt = Integer.parseInt(sc.nextLine());

        System.out.println("Do you need " + amt + " cents or Dollors");

        boolean isCent = (sc.nextLine().charAt(0)=='c');

        if((amt%5) != 0)    amt -= (amt%5);

        if(!isCent){
            System.out.println("Numbers of twoonies required" + (amt/twoonie.getValue()) + " Numbers of loonies " + (amt%twoonie.getValue()));
        }else{
            System.out.println("Require Numbers of Quarters " + (amt/quarter.getValue()) + "  dime " + ((amt%quarter.getValue())/dime.getValue() +
                    "  Nickel(s)" + ((amt%quarter.getValue())%dime.getValue())/nickel.getValue()));
        }

    }
}
