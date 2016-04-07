
class jlab23

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				23/11/2015
// Purpose : A sample program 		




{
    public static void main(String[] args)
    {
    
    	int num1 ;       
    	int num2 ;       
    
    	
    
    	// Input
    	System.out.print("Enter  num1  :") ;  
	    num1 = EasyIn.getInt() ;
     	System.out.print("Enter  num2  :") ;  
	    num2 = EasyIn.getInt() ;
	    
	 
	    if(num1 % num2 == 0)
		    {
		    	System.out.println(num1  + " is divisible by " + num2 ) ;
		    }
	    else
	        {
		    	System.out.println(num1  + " is not divisible by " + num2 ) ;
		    }
	    

    }
}

