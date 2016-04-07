
class jlab35

/*  Student Name : 		Dylan Scully
    Student Id Number : C00207618
    Date :				16/11/2015
    Purpose : 			- Modify jlab34 so that it shows
    					  current highest
    					  current lowest 
    					  current average, after each number
*/

{
    public static void main(String[] args)
    {
    	
    int userInput ;
    int maximum =0 ;
    int minimum =0 ;
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
		
			//minimum
			minimum = userInput ;
	
			
			//maximum
			if(maximum < userInput )
				{
					maximum = userInput ;
				}
				
			average = sum / index ;
			
			System.out.println("The Min is :" + minimum ) ;
			System.out.println("The Max is :" + maximum ) ; 
			System.out.println("The Ave is :" + average ) ;		
     }  
						
    }
}

