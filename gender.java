import java.util.*;
public class gender {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the gender code: ");
        int gencode=val.nextInt();
        System.out.print("Enter the age: ");
        int age=val.nextInt();
        if(gencode==1){
            System.out.println("Male");
            if(age<25){
                System.out.println("Group one");
            }else if(age<45){
                System.out.println("Group Three");
            }

        }if(gencode==2){
            System.out.println("Female");
             if(age<25){
                System.out.println("Group two");
            }else if(age<45){
                System.out.println("Group Four");
            }


        }else if(age>45){
            System.out.println("Group Five");
        }
        else{
            System.out.println("Program is end");
        }
        
    }
    
}
