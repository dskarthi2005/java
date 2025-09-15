
class Person
{
	public String name;
	protected int age;
	private String social;
	void sum()
	{
	System.out.println(social);
	}
	String address;
	
	Person(String name,int age,String social,String address)
	{
		this.name=name;
		this.age=age;
		this.social=social;
		this.address=address;
		
	}
	
}
class Employee extends Person
{
	
	Employee(String name,int age,String social,String address) 
	{
		super(name,age,social,address);
		System.out.println("hello");
	}
	
}

public class call {
	public static void main(String[]args)
	{
		Employee nee=new Employee("karthi",19,"insta","paramakudi");
		
		System.out.println(nee.name);
		System.out.println(nee.age);
		nee.sum();
		System.out.println(nee.address);
		
		
		
	}

}
