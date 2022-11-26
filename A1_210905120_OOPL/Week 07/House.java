package com.course.structure;

public class House extends Building{
	private int bedrooms;
	private int baths;

	public void setBedrooms(int bedrooms){
		this.bedrooms = bedrooms;
	}
    public void setBaths(int baths){
    	this.baths = baths;
    } 
    public int getBedrooms(){
    	return bedrooms;
    }
    public int getBaths(){
    	return baths;
    }
}
