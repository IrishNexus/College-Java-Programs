
class jlab2b6

/*/ Student Name : 		    Dylan Scully
    Student Id Number : 	C00207618
    Date :					02/11/2015
    Purpose : 			Re-Write a simple menu driven program 
						that will present the user with
 						the following conversion menu

						1.	Fahrenheit to celsius
						2.	Celcius to Fahrenheit
						3.	Inches to centimetres
						4.	Centimetres to inches
						5.	Pounds to Kilograms
						6.	Kilograms to Pounds			 
/*/

{
    public static void main(String[] args)
    {
    
    		int conversionType ;
    		double celsius ;
    		double fahrenheit ;
    		double inches ;
    		double centimetres ;
    		double pounds ;
    		double kilograms ;
     
    		System.out.println("What type of conversion would you like to do? ") ;  
			System.out.print(" \nEnter 1 to Convert Fahrenheit to celsius "  ) ;		
			System.out.print(" \nEnter 2 to Convert Celsius to Fahrenheit "  ) ;
			System.out.print(" \nEnter 3 to Convert Inches to centimetres "  ) ;
			System.out.print(" \nEnter 4 to Convert Centimetres to inches "  ) ;		
			System.out.print(" \nEnter 5 to Convert Pounds to Kilograms  "	) ;
			System.out.print(" \nEnter 6 to Convert Kilograms to Pounds  "	) ;
			System.out.print(" \n\nEnter 7 to Exit the program  "	) ;
			
		
			conversionType = EasyIn.getInt();
			
					{
 					  	switch (conversionType)
				  {
		     		case 1: // Fahrenheit to Celsius
		     				System.out.println("\nFahrenheit to Celsius");
		     				System.out.print(" \nEnter the temperature in Fahrenheit ") ;
		     				fahrenheit = EasyIn.getDouble(); 
		     				celsius = (fahrenheit -  32) * 5/9 ;
		     				System.out.println("\nThis conversion gives you " + celsius) ;
		     				break;
		     		case 2: // Celsius to Fahrenheit
		     				System.out.println("\nCelsius to Fahrenheit");
		     				System.out.print(" \nEnter the temperature in celsius ") ;
		     				celsius = EasyIn.getDouble(); 
		     				fahrenheit = (celsius * 9/5) + 32 ;
		     				System.out.println("\nThis conversion gives you " + fahrenheit) ;
		   					break;
		     		case 3: // Inches to centimetres
		     				System.out.println("\nInches to centimetres");
		     				System.out.print(" \nEnter the amount of inches you wish to convert ") ;
		     				inches = EasyIn.getDouble(); 
		     				centimetres = inches  *  2.54 ;
		     				System.out.println("\nThis conversion gives you " + centimetres) ;
		     				break;
		     		case 4: // Centimetres to inches
		     				System.out.println("\nCentimetres to inches");
		     				System.out.print(" \nEnter the amount of centimetres you wish to convert ") ;
		     				centimetres = EasyIn.getDouble(); 
		     				inches = centimetres  *  0.39 ;
		     				System.out.println("\nThis conversion gives you " + inches) ;
		     				break;
		     		case 5: // Pounds to Kilograms
		     				System.out.println("\nPounds to Kilograms");
		     				System.out.print(" \nEnter the number of pounds ") ;
		     				pounds = EasyIn.getDouble(); 
		     				kilograms = pounds / 2.2 ;
		     				System.out.println("\nThis conversion gives you " + kilograms) ;
		     				break;
		     		case 6: // Kilograms to Pounds
		     				System.out.println("\nKilograms to Pounds");
		     				System.out.print(" \nEnter the number of kilograms ") ;
		     				kilograms = EasyIn.getDouble(); 
		     				pounds = kilograms * 2.2 ;
		     				System.out.println("\nThis conversion gives you " + pounds) ;
		     				break;
		     		case 7: // Exit program
		     				System.out.println("\nExiting...");
		     				break;
		     				
		     		default:// If number outside of 1-6 is entered
							System.out.println("Please enter a number between 1 and 6!");
											
				  }
					}
    }
}

