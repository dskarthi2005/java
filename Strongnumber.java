import java.util.Scanner;

public class Strongnumber {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int num=val.nextInt();
        int temp=num;
      
        
        int ans=0;
        while(num>0){
            int fact = 1;
        int  digit=num%10;
          
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;  
       
        }
         num=num/10;
        ans=ans+fact;
        
        }
      
        if(ans==temp){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }       
      }
    }
    

