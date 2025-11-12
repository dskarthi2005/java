import java.util.*;
public class addsingledigit{
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the value:");
        int num=val.nextInt();
        while(num>=10){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        num=sum;
    }
    System.out.println(num);
}
}