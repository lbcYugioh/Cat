import java.awt.Color;

public class Lion extends Cat
{
	private Color colorMain;
	public Lion()
	{
		getManeColor();
	}
	public void roar()
	{
		System.out.println(getName() + " just roared");
	}
	public void setManeColor(Color c)
	{
		colorMain = c;
	}
	public Color getManeColor()
	{
		return colorMain;
	}
	
}