import java.util.Scanner;

public class Inventory {

    public static final int NUMBER = 10;
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String usrChoice = "No";
        do {
            System.out.print("Enter product Type");
            String productType = scan.nextLine();

            System.out.print("Please enter the cost to us for each..");
            int cost = Integer.parseInt(scan.nextLine());

            System.out.print("Enter product Brand");
            String brandName = scan.nextLine();

            System.out.print("Please enter Number In Shipment.");
            int shipmentNumber = Integer.parseInt(scan.nextLine());

            System.out.println("Shipment Summary");
            System.out.println("Product Type" + productType);
            System.out.println(shipmentNumber + "Shipment from " + brandName);
            System.out.println("Total commercialValue of shipment was $  " + (shipmentNumber * cost));

            System.out.print("Do you want to enter second product");
            usrChoice = scan.nextLine();
        }   while(!usrChoice.equalsIgnoreCase("No"));



        /*Find largest number*/
      /*  Practice_2 practice = new Practice_2();
/*
        System.out.print("Please enter a number");
        int firstNum =  Integer.parseInt(scan.nextLine());

        System.out.print("Please enter a number");
        int secondNum =  Integer.parseInt(scan.nextLine());

        System.out.println(practice.findLargestNumber(firstNum,secondNum));

        System.out.print("Please Enter amount in CAD$ ");
        float cad$ =  Float.parseFloat(scan.nextLine());

        System.out.println(practice.currencyConversion(cad$));
*/
        /*System.out.println(practice.add());
        practice.isPositive(NUMBER);

        practice.salaryIncreament(2000);
*/
     /*   System.out.print("Please enter a number");
        int num =  Integer.parseInt(scan.nextLine());
        EvenNumber.isEven(num);*/
        scan.close();

    }
}
