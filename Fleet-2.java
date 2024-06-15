import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Fleet{
	public static void main(String[] args) throws Exception
	{
	ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	Scanner kbd = new Scanner(System.in);
	System.out.println("Enter the name of your DB text file: ");
	String db = kbd.next();
	Scanner DBread = new Scanner(new File(db));
	while ( DBread.hasNext() )
	{
	 String VC = DBread.next();
		if (VC.equals("C"))
		{
			Car car = new Car();
			String cmake = DBread.next();
			car.setMake(cmake);
			String cmodel = DBread.next();
			car.setModel(cmodel);
			int cweight = DBread.nextInt();
			car.setWeight(cweight);
			String ccolor = DBread.next();
			car.setColor(ccolor);
			int cyear = DBread.nextInt();
			car.setYear(cyear);
			double cmpg = DBread.nextDouble();
			car.setMPG(cmpg);
			int cseating = DBread.nextInt();
			car.setSeating(cseating);
			car.setVclass("C");
			cars.add(car);
		}
		else if (VC.equals("T"))
		{
			Truck truck = new Truck();
			String tmake = DBread.next();
			truck.setMake(tmake);
			String tmodel = DBread.next();
			truck.setModel(tmodel);
			int tweight = DBread.nextInt();
			truck.setWeight(tweight);
			String tcolor = DBread.next();
			truck.setColor(tcolor);
			int tyear = DBread.nextInt();
			truck.setYear(tyear);
			double tmpg = DBread.nextDouble();
			truck.setMPG(tmpg);
			int tseating = DBread.nextInt();
			truck.setSeating(tseating);
			int thauling = DBread.nextInt();
			truck.setHauling(thauling);
			truck.setVclass("T");
			cars.add(truck);
		}
		else if (VC.equals("CT"))
		{
			CT ct = new CT();
			String ctmake = DBread.next();
			ct.setMake(ctmake);
			String ctmodel = DBread.next();
			ct.setModel(ctmodel);
			int ctweight = DBread.nextInt();
			ct.setWeight(ctweight);
			String ctcolor = DBread.next();
			ct.setColor(ctcolor);
			int ctyear = DBread.nextInt();
			ct.setYear(ctyear);
			double ctmpg = DBread.nextDouble();
			ct.setMPG(ctmpg);
			int ctseating = DBread.nextInt();
			ct.setSeating(ctseating);
			int cthauling = DBread.nextInt();
			ct.setHauling(cthauling);
			boolean ctiscombination = DBread.nextBoolean();
			ct.setIscombination(ctiscombination);
			ct.setVclass("CT");
			cars.add(ct);
		}
		else if (VC.equals("MC"))
		{
			Motorcycle motorcycle = new Motorcycle();
			String mmake = DBread.next();
			motorcycle.setMake(mmake);
			String mmodel = DBread.next();
			motorcycle.setModel(mmodel);
			int mweight = DBread.nextInt();
			motorcycle.setWeight(mweight);
			String mcolor = DBread.next();
			motorcycle.setColor(mcolor);
			int myear = DBread.nextInt();
			motorcycle.setYear(myear);
			double mmpg = DBread.nextDouble();
			motorcycle.setMPG(mmpg);
			motorcycle.setVclass("MC");
			cars.add(motorcycle);
		}
		else if (VC.equals("B"))
		{
			Bus bus = new Bus();
			String bmake = DBread.next();
			bus.setMake(bmake);
			String bmodel = DBread.next();
			bus.setModel(bmodel);
			int bweight = DBread.nextInt();
			bus.setWeight(bweight);
			String bcolor = DBread.next();
			bus.setColor(bcolor);
			int byear = DBread.nextInt();
			bus.setYear(byear);
			double bmpg = DBread.nextDouble();
			bus.setMPG(bmpg);
			int bpassengers = DBread.nextInt();
			bus.setPassengers(bpassengers);
			bus.setVclass("B");
			cars.add(bus);
		}
	}
		System.out.println("What vehicle class would you like to list?(C: Car, T: Truck, MC: Motorcycle, B: Bus, CT: Commercial Truck" );
		String search = kbd.next();
		int count = 0;
		for(Vehicle car : cars)
		{
			if (car.getVclass().equals(search))
			{
				count += 1;
				car.stats();
			}
		}
		System.out.println( count + " vehicles of the " + search + " class have been found and returned by your search");
		
	}
}