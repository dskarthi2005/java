import java.util.*;
public class prime {
    public static void main(String[] args) {
 int count=0;
 int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        int arr[]=new int[size];
         System.out.println("Enter the Array value:");
     
        for(int i=0;i<size;i++){
              arr[i]=s.nextInt();
        }
          for(int i=0;i<size;i++) {
          
for(int j=2;j<arr[i];j++) {
    if(arr[i]%j==0){
        flag=1;
        
    }
}
    
if(flag==0){
    count++;
}

          }
          System.out.print("Total count is : "+count+" ");
        }
    }
