package com.B08CollectionInjection;

import java.util.List;

public class Triangle {
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void show()
	{
		for(Point p : points)
		{
			System.out.println(p.getX() +" "+p.getY());
		}
	}
}
