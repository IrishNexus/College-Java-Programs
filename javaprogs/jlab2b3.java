
class jlab2b3

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				19/10/2015
// Purpose :   	Write a program which asks the user 
//              to enter 3 different numbers.
//              The program then tells the user 
//              which number was the lowest number entered.			




{
    public static void main(String[] args)
    {
    	
    	//Variable declaration
    	int num1 ;
    	int num2 ;
    	int num3 ;
    	
    	//Prompt & Grabbing Variables
    	System.out.println("Enter number 1 "); 
    	num1 = EasyIn.getInt() ;
    	System.out.println("Enter number 2 "); 
    	num2 = EasyIn.getInt() ;
    	System.out.println("Enter number 3 "); 
    	num3 = EasyIn.getInt() ;
    	//Calculations
    
    	if      ((num1 < num2) && (num1 < num3)) 
    		    {
    		     	System.out.println(+ num1) ;
    	  	    }
    	else if ((num2 < num1) && (num2 < num3)) 
    		    {
    		     	System.out.println(+ num2) ;
    	  	    }
    	else 
    			{
    				System.out.println(+ num3) ;	
    			}
    		
    }
}

