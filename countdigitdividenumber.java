import java.util.*;
public class countdigitdividenumber{
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=val.nextInt();
        int temp=num;
        int count=0;
        while(temp>0){
           int digit=temp%10;
           if(digit!=0 && num%digit==0){
            count++;            
        }
        temp=temp/10;
    }
    System.out.println("That divide the number are: "+count);
    }
}