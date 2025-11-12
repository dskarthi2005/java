import java.util.*;
public class moveszeroend {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int nums=val.nextInt();
        int arr[]=new int[nums];
        System.out.println("Enter the elements:");
        for(int i=0;i<nums;i++){
            arr[i]=val.nextInt();
        }
    
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        System.out.println("Array after moving zeros to the end:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
