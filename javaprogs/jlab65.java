class Jlab65


/* Student Name : 		Dylan Scully
   Student ID Number : 	C00207618
   Date :				07/03/2016
   
   Purpose : 			Implement a method called menu(while loop) for the options in the following program.
   						Write a method for the following conversions.
   						
   						1.Fahrenheit to celcius - fahrToCel()  
   						2.Celcius to Fahrenheit - celToFahr()
   						3.Inches to centimetres - inchToCent()
   						4.Centimetres to inches - centToInch()
   						5.Pounds to Kilograms   - poundToKilo()
   						6.Kilograms to Pounds   - kiloToPound()
   						7.Exit program
 */
{
	//menu Method
	public static int menu(int menuNum) 
    {  
    	System.out.println("1.Fahrenheit to celcius ");
    	System.out.println("2.Celcius to Fahrenheit ");
    	System.out.println("3.Inches to centimetres ");
    	System.out.println("4.Centimetres to inches ");
    	System.out.println("5.Pounds to Kilograms ");
    	System.out.println("6.Kilograms to Pounds ");
    	System.out.println("7.Exit program ");
    	
    
       	 
    }	
		
  	//fahrToCel = 1
	public static double fahrToCel(double menuNum) 
    {  
    	double cel;
    	double fahr; 
		
		cel = (fahr -  32) * 5/9 ;
    	
        return cel ;
       	 
    } 
    
    //celToFahr = 2
	public static double celToFahr(double menuNum) 
    {  
    	double fahr;
    	double cel;
    	 
		
		fahr = (cel * 9/5) + 32 ;
    	
        return fahr ;
       	 
    }
    
    //inchToCent = 3
	public static double inchToCent(double menuNum) 
    {  
    	double cent;
    	double inch;
    	 
		
		cent = inch  *  2.54 ;
    	
        return cent ;
       	 
    }
    
    //centToInch = 4
	public static double centToInch(double menuNum) 
    {  
    	double cent;
    	double inch;
    	 
		
		inch = cent  *  0.39 ;
    	
        return inch ;
       	 
    }
    
    //poundToKilo = 5
	public static double poundToKilo(double menuNum) 
    {  
    	double kilo;
    	double pound;
    	
		
		kilo = pound / 2.2 ;
    	
        return kilo ;
       	 
    }
    
    //kiloToPound = 6
	public static double kiloToPound(double menuNum)
	 
    {  
    	double kilo;
    	double pound; 
    	
		
		pound = kilo * 2.2 ;
    	
        return pound ;
       	 
    }
    
    	     
    //Main program begins (variables and input/output)
    public static void main(String[] args)
    {    
     
   		int menuNum;
   		double fahr;
   		double cel;
   		
   		System.out.print("what type of conversion would you like? "); 
    	menuNum = EasyIn.getInt(); 
    	
    	if (menuNum == 1)
    		{
    			System.out.println("Enter Fahrenheit: ");
				fahr = EasyIn.getDouble();
    			System.out.println("Result: " + fahrToCel(fahr));
    		}
    	else if (menuNum == 2)
    		{
    			System.out.println("Enter Celcius: ");
				cel = EasyIn.getDouble();
    			System.out.println("Result: " + celToFahr(cel));
    		}

    }
}

