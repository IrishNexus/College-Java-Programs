
class jlab34

/*  Student Name : 		Dylan Scully
    Student Id Number : C00207618
    Date :				11/11/2015
    Purpose : 			- Write a program to find the largest, smallest and average
    					  value in a collection of N numbers. 
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
					
     }
 
			//average 
			average = sum / index	;
			
			System.out.println("The Min is :" + minimum ) ;
			System.out.println("The Max is :" + maximum ) ; 
			System.out.println("The Ave is :" + average ) ;  
			
		
			
    }
}

