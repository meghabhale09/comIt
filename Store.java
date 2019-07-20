import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String[] prodName = {"Guitars", "Pianos", "Keyboards", "Trumpets", "Sexophones", "Drums", "Banjos", "Maracas", "Flutes", "Xylophones"};
        int[] price = {750, 1400, 600, 550, 700, 1200, 500, 70, 325, 175};
        int[] quantity = new int[prodName.length];

        Scanner sc = new Scanner(System.in);
        String usrChoice = "No"; int sum = 0;
        do {
            for(int i = 0;i< prodName.length; i++){
                System.out.println(i + ". " + prodName[i] + "  $" + price[i]);
            }

            System.out.println("Please enter the number you want to buy");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter Quantity of " + prodName[id]);
            int qty = Integer.parseInt(sc.nextLine());
            quantity[id] = qty;
            System.out.println(prodName[id] + "  " + quantity[id] + " * " + price[id] + " totals $" + (quantity[id] * price[id]));

            System.out.println("Do you want to continue yes/No");
            usrChoice = sc.nextLine();
        }while(!usrChoice.equalsIgnoreCase("No"));

        for(int i=0;i<quantity.length;i++){
            if(quantity[i]!=0){
                System.out.println(prodName[i] + "  " + quantity[i] + " * " + price[i] + " totals $" + (quantity[i] * price[i]));
                sum += (quantity[i] * price[i]);
            }
        }
    System.out.println("Total $" + sum);
    sc.close();

    }
}
