class Jlab12

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				21/09/15
// Purpose : 			Calculating average miles per hour and the miles per gallon



{
	public static void main(String[] args)
	
	{
		
	double miles;
	double hours;
	double gallons;
	double milesPerHour;
	double gallonsPerHour;

		
	System.out.println("Please enter the distance travelled in miles ");
	miles = EasyIn.getDouble();
	System.out.println("Please enter the amount of time spent on the trip in hours ");
	hours = EasyIn.getDouble();
	System.out.println("Please enter the amount of gallons of petrol used ");
	gallons = EasyIn.getDouble();
	
	milesPerHour = miles / hours;
	gallonsPerHour = miles / gallons;
	
	System.out.println("Your average miles per hour " + milesPerHour);
	System.out.println("Your average miles per gallon " + gallonsPerHour);
		
		
		
		
	}
}