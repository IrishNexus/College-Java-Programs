
class jlab36

/*  Student Name : 		Dylan Scully
    Student Id Number : C00207618
    Date :				16/11/2015
    Purpose : 			- Modify jlab35 so that it  tells the user if 
    					  max or min number has been entered more than once
    					  and if so, how many times.
*/

{
    public static void main(String[] args)
    {
    	
    int userInput ;
    int maximum =0 ;
    int timesMax =0 ;
    int minimum =0 ;
    int timesMin =0 ;
    double average =0 ;
    int index = 0 ;
    double sum = 0 ;
    
    
    
	System.out.print("Enter your first number : ") ;  
	userInput = EasyIn.getInt() ;
	
	while (userInput != 0)
	 {
		System.out.print("Enter another number :" + "(0 to quit)");  
		userInput = EasyIn.getInt() ;
		index++ ;
		sum+= userInput ;
		
			// Min
           if(minimum > userInput)
            	{
            		minimum = userInput ;
            		timesMin = 1 ;	
            	}
            else if(minimum == userInput)
            	{
	            	timesMin++  ;	
            	}
          
            // Max
           if(maximum < userInput)
            	{
            		maximum = userInput ;
            		timesMax = 1 ;	
            	}
            else if(maximum == userInput)
            	{
	            	timesMax++  ;	
            	}
          
			average = sum / index ;
			
			System.out.println("The Min is :" + minimum ) ;
			System.out.println("The number of times min was present :" + timesMin ) ;
			System.out.println("The Max is :" + maximum ) ;
			System.out.println("The number of times max was present :" + timesMax ) ; 
			System.out.println("The Ave is :" + average ) ;		
     }  
						
    }
}

