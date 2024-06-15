public class Motorcycle extends Vehicle {
	
	public  void setWeight(int in)
	{
		
		if (in < 200)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
		
		
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void stats()
	{
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle maker name is: " + make);
		System.out.println("Vehicle classification is:" + vclass);
		System.out.println(notes);	
	}
}