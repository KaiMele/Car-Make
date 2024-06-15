public class Car extends Vehicle {
	private int seating;
	
	
	public void setSeating(int in)
	{
		seating = in;
	}
	
	public int getSeating()
	{
		return seating;
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
		System.out.println("Vehicle classification is:" + vclass);
		System.out.println(notes);
	}
}