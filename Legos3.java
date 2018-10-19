package cs622.Homework3b;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Legos3 extends JFrame{
	private int startX; // The x coordinate of the rectangle to be filled.
	private int startY; // The y coordinate of the rectangle to be filled.
	private int legoWidth; // The width of the rectangle to be filled.
	private int legoHeight; // The height of the rectangle to be filled.
	private int baseLength; // This represents the number of blocks in the bottom row.
	
	// Default Constructor
	Legos3(){
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;
	}
	
	// Constructor 
	public Legos3(int startX, int startY, int legoWidth, int legoHeight, int baseLength) {
		this.startX = startX;
		this.startY = startY;
		this.legoWidth = legoWidth;
		this.legoHeight = legoHeight;
		this.baseLength = baseLength;
	}
	
	 // paint function
	 public void paint(Graphics g) {
		 
		 // array of Color objects and initialize the array with the colors
		 Color[] colors = {Color.red, Color.blue, Color.yellow, Color.green, Color.pink,Color.black, Color.magenta, Color.orange, Color.cyan};
		 Random rand = new Random();
		 
		// initialize the counter and temp values
		 int counter = 0;
		 int temp_r = 10;
		 
		// Nest loop to output the result
		 for(int row = 10; row > 0; row--) {
			 for (int col = 0; col < row; col++) {
				 int r = rand.nextInt(8); // generate a random number from 0 - 8
				 
				 // if the current random number is equal to previous random number, generate another random number
				 while(r == temp_r) {
					 System.out.println("Find the same: r = " + r + " temp_r = " + temp_r);
					 r = rand.nextInt(8);
				 }
				 g.setColor(colors[r]);  // Set random color
				 g.fillRoundRect((startX + 50*col + counter*25), (startY - counter*20), legoWidth, legoHeight, 2, 2);  
				 temp_r = r; // save the current random number to temp_r
			 }
			 counter++;  // increment the counter
		 }
		  
	 }
}
