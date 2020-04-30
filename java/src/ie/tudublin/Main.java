package ie.tudublin;

import c18459302.Trippy;
import example.RotatingAudioBands;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new RotatingAudioBands());	
	}

	public void trippy()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Trippy());	
	}
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.trippy();			
	}
}