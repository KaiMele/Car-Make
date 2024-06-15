public class Vehicle {

	protected String model = "";
	protected int weight = 0;
	protected String color = "";
	protected double mpg = 0.0;
	protected int year = 0000;
	protected String make = "";
	protected String vclass = "";
	protected String notes = "System notes: \n";
	
	public Vehicle()
	{
	}
	
	public Vehicle(String inmodel,int inweight,String incolor,double inmpg,int inyear,String inmake,String invclass)
	{
		setModel(inmodel);
		setWeight(inweight);
		setColor(incolor);
		setMPG(inmpg);
		setYear(inyear);
		setMake(inmake);
		setVclass(invclass);
	}
	
	public  void setModel(String in)
	{
		model = in.toUpperCase();
	}
	
	public  String getModel()
	{
		return model;
	}
	
	public  void setWeight(int in)
	{
		if (in < 1000)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
	}
	public  int getWeight()
	{
		return weight;
	}
	public  void setColor(String in)
	{
		color = in;
	}
	public  String getColor()
	{
		return color;
	}
	
	public  void setYear(int in)
	{
		if (in < 1930)
		{
			notes += "The user entered an invalid year of " + in +  " for vehicle model year\n";
		}
		year = in;
	}
	public  int getYear()
	{
		return year;
	}
	public void setMake(String in)
	{
		make = in.toUpperCase();
	}
	public String getMake()
	{
		return make;
	}
	public void setVclass(String in)
	{
		vclass = in.toUpperCase();
	}
	public String getVclass()
	{
		return vclass;
	}
	public  void setMPG(double in)
	{
		mpg = in;
	}
	public  double getMPG()
	{
		return mpg;
	}
	
	public void stats(){
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
	
	
	
	
	
	

