public class CT extends Vehicle {
private int seating;
	
	public void setSeating(int in)
	{
		seating = in;
	}
	
	public int getSeating()
	{
		return seating;
	}
	private int passengers;
	
	
		
	public void setPassengers(int in)
	{
		passengers = in;
	}
	
	public int getPassengers()
	{
		return passengers;
	}
	
	
	private int hauling;
	
	public void setHauling(int inn)
	{
		hauling = inn;
	}
	
	public int getHauling()
	{
		return hauling;
	}
	private boolean iscombination;
	public void setIscombination(boolean in)
	{
		iscombination = in;
	}
	public boolean getIscombination()
	{
		return iscombination;
	}

	public void stats()
	{
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle maker name is: " + make);
		System.out.println("Vehicle seating capacity: " + seating); 
		System.out.println("Vehicle can haul: " + hauling);
		System.out.println("Vehicle is combinational: " + iscombination);
		System.out.println("Vehicle classification is:" + vclass);
		System.out.println(notes);
	}
}