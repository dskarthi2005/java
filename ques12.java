import java.util.*;

public class ques12 {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("Enter the Array size:");
        int size=val.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Array Store's Value:");
        for (int i = 0; i <size; i++) {
            arr[i] = val.nextInt();
        }        
        Arrays.sort(arr);
        System.out.println("Array is sorted");
        
      System.out.println("Decending order is:");
        for (int i =size-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
 }
