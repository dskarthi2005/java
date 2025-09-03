
import java.util.Scanner;
  class invalidageexception extends Exception{
	public  invalidageexception(String msg ){
		  super(msg);
	  }
  }
  class agevalidator{
	  void checkage(int age) {
		  try {
		 
		  if(age<0 || age>150) {
			  throw new invalidageexception("valid");
			 
		  }else {
			  throw new invalidageexception("invalid");
		  }
	    }
		  catch(Exception e) {
			  System.out.println(e);
		  }
	  }
  }
  public class exception{
	  public static void main(String[]args) {
		  Scanner val=new Scanner(System.in);
		  int age=val.nextInt();
		  agevalidator s1=new agevalidator();
		 
		  s1.checkage(age);
		  val.close();
	  }
  }