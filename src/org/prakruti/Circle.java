package org.prakruti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point centre;
	
	public Point getCentre() {
		return centre;
	}

//	@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle!!");
		System.out.println("circle point is: " + centre.getX() + " , " + centre.getY());		
	}

	
}
