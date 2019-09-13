package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//every fish has a color that is a color
	Color color;
	//every fish has a position (x,y) that are integers.
	int x;
	int y;
	
	public Fish(Color c, int startX, intstartY) {
		this.color = c; 
		this.x = startX;
		this.y = startY;
		
	}
	
	public void draw(Graphics2D g) {
		DrawFish.smallFacingLeft(g,  this.color, this.x, this.y);
	}
	public void swim() {
		this.x += 1; 
		this.y += 1;
	}
}
