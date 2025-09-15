import java.util.Scanner;
public class arrinsert {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.print("Enter the Size:");
        int size=val.nextInt();
        int arr[]=new int [size];
        System.out.print("Enter the Elements:");
        int insert=val.nextInt();
        System.out.print("Enter the Position:");
        int pos=val.nextInt();
         System.out.println("Enter the array value");
        for(int i=0;i<size;i++){
            
            arr[i]=val.nextInt();
        }
        for(int i=size;i>pos;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
