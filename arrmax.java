import java.util.Scanner;
public class arrmax {
   public static void main(String[] args) {
    Scanner val=new Scanner(System.in);
    System.out.print("Enter the size:");
    int size=val.nextInt();
    int arr[]=new int[size];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<size;i++){
      arr[i]=val.nextInt();
      if(max<arr[i])
      max=arr[i];
    }
    System.out.println("Enter the value is:"+max);
   }
}