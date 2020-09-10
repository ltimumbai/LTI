package com.lti.circle.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path ("/circle")
public class CircleService {
	
	/**
	 * @param radius
	 * @return String
	 */
	@GET
	@Path ("/area/{radius}")
	public String getArea(@PathParam (value="radius") double radius) {
		double area = Math.PI * radius * radius;
		return String.valueOf(area);
	}
	
	/**
	 * @param radius
	 * @return String
	 */
	@GET
	@Path ("/perimeter/{radius}")
	public String getPerimeter(@PathParam (value="radius") double radius) {
		double perimeter = Math.PI * 2 * radius;
		return String.valueOf(perimeter);
	}

}
