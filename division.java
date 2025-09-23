import java.util.*;

public class division {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int value=val.nextInt();
        if(value%3==0 && value%5==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }   
}
