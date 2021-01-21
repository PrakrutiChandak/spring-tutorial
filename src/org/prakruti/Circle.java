package org.prakruti;

public class Circle implements Shape{

	private Point centre;
	
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle!!");
		System.out.println("circle point is: " + centre.getX() + " , " + centre.getY());		
	}

	
}
