class jlab22 


// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				30/9/2015
// Purpose : 			Getting the average of three Marks and establishing
//						if they got Distinction, merit1, merit2, pass, fail





{
    public static void main(String[] args)
    {
    	int programming ;
    	int maths ;
    	int hardware ;
    	double average ;
    	
     
    System.out.println("Please input your Programming mark");   
	programming = EasyIn.getInt() ;
	System.out.println("Please input your Maths mark");   
	maths = EasyIn.getInt() ;
	System.out.println("Please input your Hardware mark");   
	hardware = EasyIn.getInt() ;
	
	average = (programming + maths + hardware) / 3 ;
	
	if 			((average >= 70))
		{
				 System.out.println("Distinction");
		}
		
	else if 	((average >=63 ) && (average <= 69)) 
		{
	     		System.out.println("Merit1 ");
		}
	
	else if 	((average >=55) && (average <= 62)) 
		{
	     		System.out.println("Merit2 ");
		}
	
	else if	 	((average >= 54) && (average <= 40)) 
		{
	     		System.out.println("Pass ");
		}
	
	else if 	((average <= 40))
		{
	     		System.out.println("Fail ");
		}
	else  	(average >100))
	
				System.out.printIn("Please enter a number between 0-100 ");
	
	
	
	
    }
}
