
class jlab2b4

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				19/10/2015
// Purpose :   	Write a program which asks the user 
//              to enter 3 different numbers.
//              The program then tells the user 
//              which number was the lowest number entered.	

//				Mods 4.	Modify the program in 3 above 
//				so it gives you the numbers in ascending order, 
//				i.e. lowest, middle, highest 
		




{
    public static void main(String[] args)
    {
    	
    	//Variable declaration
    	int num1 ;
    	int num2 ;
    	int num3 ;
    	int smallest ;
    	int middle =0 ;
    	int largest =0 ;
    	
    	//Prompt & Grabbing Variables
    	System.out.println("Enter number 1 "); 
    	num1 = EasyIn.getInt() ;
    	System.out.println("Enter number 2 "); 
    	num2 = EasyIn.getInt() ;
    	System.out.println("Enter number 3 "); 
    	num3 = EasyIn.getInt() ;
    	
    	//Smallest
    
    	if      ((num1 < num2) && (num1 < num3)) 
    		    {
    		     	smallest = num1 ;
    	  	    }
    	else if ((num2 < num1) && (num2 < num3)) 
    		    {
    		     	smallest = num2 ;
    	  	    }
    	else 
    			{
    				smallest = num3 ;	
    			}
    			
    	//Largest
    	
    	if      ((num1 > num2) && (num1 > num3)) 
    		    {
    		     	largest = num1 ;
    	  	    }
    	else if ((num2 > num1) && (num2 > num3)) 
    		    {
    		     	largest = num2 ;
    	  	    }
    	else 
    			{
    				largest = num3 ;	
    			}
    			
    	//Middle
    	
    	if      ((num1 < num2) && (num1 > num3)) 
    		    {
    		     	middle = num1 ;
    	  	    }
    	else if ((num2 < num1) && (num2 > num3)) 
    		    {
    		     	middle = num2 ;
    	  	    }
    	else 
    			{
    				middle = num3 ;	
    			}
    			
    System.out.print(" \n\tThe Smallest number is : "	 + smallest) ;		
	System.out.print(" \n\tThe Middle number is : "	 + middle) ;
	System.out.print(" \n\tThe Largest number is : "	 + largest) ;
	
	//Press Any Key to Continue
	System.out.print("\n\n\n") ;
    	
    	
    		
    }
}

