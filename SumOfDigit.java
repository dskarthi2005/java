import java.util.*;
public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value is: ");
        int n = sc.nextInt();

        int sum= 0, temp = n;
        while (temp > 0) {
            sum += (temp % 10);
            temp /= 10;
        }

        System.out.println("The sum of Value is: "+sum);
    }
}

