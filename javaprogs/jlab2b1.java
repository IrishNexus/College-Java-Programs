class jlab2b1

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				12/10/2015
// Purpose : 			Write a program which calculates the insurance premium for the coming year. 




{
    public static void main(String[] args)
    {
    	//Constants
    	final double increaseRate = 0.05 ;
    	final double discountRate = 0.40 ; 
    	final double ratePerClaim = 0.20 ; 
    	
    	//Variables
    	int lastYearsPremium ;
    	int numberOfClaims ;
    	double nextYearsPremium =0 ;
       	double increase ;
    	double discount ;
    	double costOfClaims ;
    	
    	
    	//Prompt & Grabbing Variables
    	System.out.println("Enter last years premium ");  
		lastYearsPremium = EasyIn.getInt() ;
		System.out.println("Enter your number of claims ");  
		numberOfClaims = EasyIn.getInt() ;
		
		increase = lastYearsPremium * increaseRate;
		
		if (numberOfClaims == 0)
			{
				
				discount = increase * discountRate;
				nextYearsPremium = lastYearsPremium + (increase - discount) ;
				System.out.println("next years premium " + nextYearsPremium) ;
				
							
			}
		else if (numberOfClaims > 0)
		    {
				costOfClaims = increase * numberOfClaims * ratePerClaim ;
				nextYearsPremium = lastYearsPremium + increase + costOfClaims ;
				
				
				System.out.println("next years premium " + nextYearsPremium) ;					
		    }
		    
		
	
    
    }
}

