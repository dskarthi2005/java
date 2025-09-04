import java.util.Scanner;
public class amstrong{
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=val.nextInt();
        System.out.println("The number is "+num);
        int original,reman,result=0;
        original=num;
        while(original!=0){
            reman=original%10;
            result+=Math.pow(reman,3);
            original=original/10;
        }
        if(result==num){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not an Amstrong number");
            } 
            val.close();
        }
    }
