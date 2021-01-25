package org.prakruti;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	private Point pointA;
	
	public Point getCentre() {
		return pointA;
	}

	public void setCentre(Point centre) {
		this.pointA = centre;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle!!");
		System.out.println("circle point is: " + pointA.getX() + " , " + pointA.getY());		
	}

	
}
