class jlab24

// Student Name : 		Dylan Scully
// Student Id Number : 	C00207618
// Date :				23/11/2015
// Purpose : A sample program 		




{
    public static void main(String[] args)
    {
    
    	int num1 ;       
    	int num2 ;
    	int num3 ;      
    
    	
    
    	// Input
    	System.out.print("Enter num1: ") ;  
	    num1 = EasyIn.getInt() ;
     	System.out.print("Enter num2: ") ;  
	    num2 = EasyIn.getInt() ;
	    System.out.print("Enter num3: ") ;
	    num3 = EasyIn.getInt() ;
	    
	 
	    if(num1 % num2 == 0 && num1 % num3 == 0)
		    {
		    	System.out.println(num1  + " is divisible by " + num2 + " and " + num3 ) ;
		    }
	    else if ( num1 % num2 == 0)
	        {
		    	System.out.println(num1  + " is not divisible by " + num2 ) ;
		    }
   		else if ( num1 % num3 == 0)
	        {
		    	System.out.println(num1  + " is not divisible by " + num3 ) ;
		    }
		else 
	        {
		    	System.out.print(num1  + " is not divisible by " + num2 + " or " + num3 ) ;
		    }
	    

    }
}

