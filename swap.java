import java.util.*;
public class swap {
    public static void main(String[]args){
        //int i=0;
         Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        int arr[]=new int[size];
         System.out.println("Enter the Array value:");
        for(int i=0;i<size;i++){
           
              arr[i]=s.nextInt();
       
        }
      
        int i=0,j=size-1;
         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
          
    }
}


