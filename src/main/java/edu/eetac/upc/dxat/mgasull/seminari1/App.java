package edu.eetac.upc.dxat.mgasull.seminari1;

import org.apache.log4j.Logger;

public class App {
	
	private static final Logger logger = Logger.getLogger(App.class);
		
	public static void main(String[] args) {
		
			System.out.println("Hello World!");
			int res=0;
			
			res = suma(3, 5);
			System.out.println(res);
				//logger.error("This is an error message.");
				//logger.warn("This is a warning message.");
				logger.info("This is an informational message.");				
	}
	
	public static int suma(int x, int y)
	{
		return x+y;
	}
}
