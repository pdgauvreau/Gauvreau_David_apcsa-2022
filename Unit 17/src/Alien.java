//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,5);
	}

	public Alien(int x, int y)
	{
		//add code here
		this(x,y,30, 30, 5);
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 17/src/alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("No alien picture.");
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   //add code here
	   if (direction.equals("UP")) setY(getY() - getSpeed());
	   else if (direction.equals("DOWN")) setY(getY() + getSpeed());
	   else if (direction.equals("LEFT")) setX(getX() - getSpeed());
	   else if (direction.equals("RIGHT")) setX(getX() + getSpeed());
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
