import java.util.Scanner;
public class arrselect {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the size is:");
        int size=val.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the search value is:");
        int select=val.nextInt();
        boolean found=false;

        for(int i=0;i<size;i++){
            arr[i]=val.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]==select){
                System.out.println("value is "+select+" found at position "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("value "+select+" not found");
        }

    }
    
}
