import java.util.*;
public class arrayrotate {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        int arr[]=new int[size];
         System.out.println("Enter the Array value:");
        for(int i=0;i<size;i++){
           
              arr[i]=s.nextInt();
       
        }
          for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.print("Enter the rotate:");
        int rotate=s.nextInt();
        for(int j=1;j<=rotate;j++){
            int temp=arr[0];
            for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1]; 
            System.out.print(arr[i]);}
            arr[size-1]=temp;
            System.out.print(temp+"..");
        }
        

    }
}
