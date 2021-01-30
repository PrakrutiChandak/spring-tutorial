package org.prakruti;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	private Point pointA;
	
	@Autowired
	private MessageSource messageSource;
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("greeting", null, "default greeting", null));
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "default drawing message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {pointA.getX(), pointA.getY()}, "default circle message", null));		
	}

}
