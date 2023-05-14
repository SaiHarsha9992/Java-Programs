abstract class Birds
{
	public abstract void sound();
	public abstract void eat();
	public void walk()
	{	
		System.out.println("walk...");
	}

}
class cuckoo extends Birds
{
	public void sound()
	{	
		System.out.println("Koo...");
	}
	public void eat()
	{	
		System.out.println("insects...");
	}
	public void sing()
	{
		System.out.println("Singing...");
	}
}
class duck extends Birds
{
	public void sound()
	{	
		System.out.println("Bakk...");
	}
	public void eat()
	{	
		System.out.println("insects,rice,etc...");
	}
	public void swim()
	{	
		System.out.println("Water is favourate...");
	}
}
class Mainclass
{
	public static void main (String args [])
	{
		cuckoo c = new cuckoo();
		System.out.println("Cuckoo..");
		c.sound();
		c.eat();
		c.sing();
		duck d = new duck();
		System.out.println("Duck..");
		d.sound();
		d.eat();
		d.swim();


	}

}