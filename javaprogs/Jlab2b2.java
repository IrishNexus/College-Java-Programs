
class Jlab2b1

// Student Name : 		Dylan
// Student Id Number : 	C00207618
// Date :				28/06/2015
// Purpose : 			A Sample skeleton program
/* 
 *2.	Write a program to calculate credit card interest. 
 *Interest is charged at 12% for the first €500 and
 * at 18% for any remaining amount over €500
 **/

{
	
	
    public static void main(String[] args)
    {
    final double INTERESTRATE1 = 0.12  ;
    final double INTERESTRATE2 = 0.18  ;
    
    int amountBorrowed ;
    double interest= 0 ;
	  	
    // Input	
    System.out.print("\n\tEnter amountborrowed : ") ;  
	amountBorrowed = EasyIn.getInt() ;    	
	
	// Calculations
	if(amountBorrowed <= 500)
		{
			interest = amountBorrowed * INTERESTRATE1 ;
		}	
	else 
		{
			interest =   500 * INTERESTRATE1 + (amountBorrowed - 500)  * INTERESTRATE2 ;
		}
				
	// Report
	System.out.print("\n\n\tamountborrowed :" +  amountBorrowed) ;
	System.out.print("\n\n\tamointerest :" +  interest) ;
    System.out.print("\n\n\n") ;
    }
}

