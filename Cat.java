public class Cat
{
	private String name;
	private int age;
	private String owner;
	
	public Cat()
	{
		getName();
		getAge();
		getOwner();
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String o)
	{
		owner = o;
	}
	
	public void eat(String food)
	{
		System.out.println(name + " just ate " + food);
	}
	
}