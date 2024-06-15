public class Bus extends Vehicle {
	private int passengers;
	
	
		
	public void setPassengers(int in)
	{
		passengers = in;
	}
	
	public int getPassengers()
	{
		return passengers;
	}
	
	public void stats()
	{
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle maker name is: " + make);
		System.out.println("Vehicle passenger capacity is: " + passengers); 
		System.out.println("Vehicle classification is:" + vclass);
		System.out.println(notes);
	}
}