package org.prakruti;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point a = (" + pointA.getX() +"," + pointA.getY() + ")");
		System.out.println("Point b = (" + pointB.getX() +"," + pointB.getY() + ")");
		System.out.println("Point c = (" + pointC.getX() +"," + pointC.getY() + ")");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialising beans init method called for Triangle!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("clean up process for the triangle started!");
	}

	public void init() {
		System.out.println("spring independent init method for Triangle!");
	}
	
	public void cleanUp() {
		System.out.println("spring independent cleanUp method for Triangle!");
	}

}