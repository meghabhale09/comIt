import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = calculator(scan);
        System.out.println(result);

        findHighestSalary(scan);

        salaryCalculation(scan);

        scan.close();
    }

    public static int calculator(Scanner scan){
        int firstOperand = 0, secondOperand = 0, result = 0;
        String operator;

        try {
            System.out.println("Please enter first Operand");

            firstOperand = Integer.parseInt(scan.nextLine());
            //exitProgram(String.valueOf(firstOperand));

            System.out.println("Please enter second Operand");
            secondOperand = Integer.parseInt(scan.nextLine());
            //exitProgram(String.valueOf(secondOperand));
        }catch (NumberFormatException e){
            System.exit(0);
        }
        System.out.println("Please enter operator");
        operator = scan.nextLine();

        switch (operator.toLowerCase()){
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "no": case "n":
                System.exit(0);

        }
        return  result;
    }

    public static void exitProgram(String input){
        if(input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n"))
            System.exit(0);
    }

    public static void findHighestSalary(Scanner scan){
        System.out.println("ENter total number of employees");
        int[] totalEmployees = new int[Integer.parseInt(scan.nextLine())];

        int max = 0;
        for (int i = 0; i < totalEmployees.length; i++) {
            System.out.println("Please enter Employee " + (i+1) + " salary");
            totalEmployees[i] = Integer.parseInt(scan.nextLine());
            if(totalEmployees[i]>max)  max = totalEmployees[i];
        }
        System.out.println("Highest salary is  2"+ max);
    }

    public static void salaryCalculation(Scanner scan){
        System.out.println("ENter total number of employees");
        int[] totalEmployees = new int[Integer.parseInt(scan.nextLine())];
        int[] increamentedSalary = new int[totalEmployees.length];
        for(int i=0;i<totalEmployees.length;i++){
            System.out.println("Please enter Employee" + (i+1) + "salary");
            totalEmployees[i] = Integer.parseInt(scan.nextLine());
            if(totalEmployees[i]<1000)  increamentedSalary[i] = totalEmployees[i] + (totalEmployees[i] * 15)/100;
            else    increamentedSalary[i] = totalEmployees[i] + (totalEmployees[i] * 12)/100;
        }

        for (int sal:increamentedSalary) {
            System.out.println(sal);
        }
    }

}
