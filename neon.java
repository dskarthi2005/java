import java.util.Scanner;

public class neon {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int ans;
        int digit=0;
        ans=num*num;
        while(ans>0){
            digit+=(ans%10);
            ans/=10;
        }
        if(num==digit){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not Neon Number");
        }
    }
    
}
