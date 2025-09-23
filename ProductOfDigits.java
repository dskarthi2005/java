import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value is: ");
        int n = sc.nextInt();

        int product = 1, temp = n;
        while (temp > 0) {
            product *= (temp % 10);
            temp /= 10;
        }

        System.out.println("The Product value is: "+product);
    }
}
