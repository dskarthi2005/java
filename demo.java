import java.util.Scanner;
public class demo{
public static void main(String[]args){
    Scanner val=new Scanner(System.in);
    int days=val.nextInt();
    int years=0;
    int month=0;
    int remdays=days;
    while(remdays>=365){
        years++;
        remdays-=365;
    }
    while(remdays>=365){
        month++;
        remdays-=30;
    }
    System.out.println(years+" Year");
     System.out.println(month+" Month");
      System.out.println(remdays+" Day");
    val.close();
} 
}