import java.util.*;
public class ques14 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int a=val.nextInt();
        int b=val.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
    }
    
}
