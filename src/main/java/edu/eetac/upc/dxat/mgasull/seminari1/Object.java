package edu.eetac.upc.dxat.mgasull.seminari1;

public class Object {

	public int index;
	public String name;
	
	public Object(){}
	
	public Object(int index, String name)
	{
		this.index = index;
		this.name=name;
	}
	
	public Object Get()
	{
		this.index = 1;
		this.name= "marti";
		
		return this;
	}
	
}
