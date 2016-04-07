class jlab11 


// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program





{
    public static void main(String[] args)
    {
    	double distance ;
    	double time ;
    	double petrol ;
    	double mph ;
    	double mpg ;
     
    System.out.println("Please enter the distance travelled in miles ");   
	distance = EasyIn.getDouble() ;
    System.out.println("Please enter the time spent travelling in hours");   	
	time = EasyIn.getDouble() ;
	System.out.println("Please enter the amount of petrol used in Gallons ");   
	petrol = EasyIn.getDouble() ;
	mph = distance / time ;
	mpg = distance / petrol ;
	
	System.out.println("The average miles per hour is " + mph) ;
	System.out.println("The miles per gallon is " + mpg) ;   
    }
}

