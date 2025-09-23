import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }

        if (sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
