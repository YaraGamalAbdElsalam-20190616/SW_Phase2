package pack;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Order {
    FavouritreAreasStore storeFA=new FavouritreAreasStore();
    AllRidesStore storeAR = new AllRidesStore();
	
	private String sourceArea ;
    private String distinationArea ;
    private int numOfPassenger ;
    
    public Order() {};

    public Order(String sourceArea, String distinationArea , int numOfPassenger ) {
        this.sourceArea = sourceArea;
        this.distinationArea = distinationArea;
        this.numOfPassenger = numOfPassenger ;
    }
    
	public String getSourceArea() {
		return sourceArea;
	}
	public void setSourceArea(String sourceArea) {
		this.sourceArea = sourceArea;
	}
	public String getDistinationArea() {
		return distinationArea;
	}
	public void setDistinationArea(String distinationArea) {
		this.distinationArea = distinationArea;
	}
    
	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger ;
	}
	
	public int getNumOfPassenger() {
		return numOfPassenger;
	}
	
	public void checkRide(Order order)
        {
            for(int i=0;i<storeFA.FavouritreAreas.size();i++)
            {
                if(storeFA.displayFavouritreAreas(i).equals(order.sourceArea))
                {
                   storeAR.AddAllRides(order);
                }
            }
        }
        

}
