import java.util.Scanner;

public class sbi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter Your PrimaryAge: ");
        int primaryAge = sc.nextInt();
        System.out.print("Enter Your AddonAge: ");
        int addonAge = sc.nextInt();
        System.out.print("Enter Your Income: ");
        int income = sc.nextInt();

        
        if (primaryAge >= 21 && primaryAge <= 60 && addonAge >= 18 &&
           income >= 300000) {

            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("Sorry. You are not eligible for SBI credit cards");
        }
    }
}
