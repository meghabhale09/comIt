package assignmentPassword;

import java.util.Scanner;

public class PasswordMain {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter array size");
        int len = Integer.parseInt(scan.nextLine());
        Password[] passArray = new Password[len];
        boolean[] isStrongPasswordArray = new boolean[len];

        for(int i=0; i< len;i++){
            System.out.println("Please enter password length");
           try {
               int passLen = Integer.parseInt(scan.nextLine());
               passArray[i] = new Password(passLen);
               isStrongPasswordArray[i] = passArray[i].isStrong(passArray[i].getPassword());
           }catch (Exception e)
           {
               e.printStackTrace();
           }
        }

        for(int i = 0; i< len; i++) {
            System.out.println(passArray[i].getPassword() +" is strong "+ isStrongPasswordArray[i]);
        }
        scan.close();
    }
}
