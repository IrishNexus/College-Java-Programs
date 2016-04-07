class jlab01


// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program





{
    public static void main(String[] args)
    {
    	double fahrenheit;
    	double celsius;
    
    System.out.println("Please enter the temperature in Degrees Fahrenheit ");   
	fahrenheit = EasyIn.getDouble() ;
	celsius = 5.0 / 9 * (fahrenheit - 32) ;
	System.out.println("The temperature in Degrees Celsius is " + celsius) ;
    }
}

