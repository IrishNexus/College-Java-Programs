class jlab21 


// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				28/9/2015
// Purpose : 			Establishing if a number is less or greater than 0





{
    public static void main(String[] args)
    {
    	int firstNumber ;
    	int outputOne ;
    	int outputTwo ;
    	
     
    System.out.println("Please input your number ");   
	firstNumber = EasyIn.getInt() ;
	
	if (firstNumber > 0)
		{
			System.out.println("That number is greater than 0");
		}
		
	else
	{
	    System.out.println("That number is less than 0 ");
	}
	
	
    }
}
