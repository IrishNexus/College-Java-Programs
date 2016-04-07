class Jlab61


/* Student Name : 		Dylan Scully
   Student Id Number : 	C00207618
   Date :				22/02/2016
   Purpose : 			Write a method called isEven() that takes an integer as its argument.
   						- return true if the argument is an even number 
   						- return false otherwise  
 */
{
		
  	//Calc for even or Odd number
	public static boolean isEven(int num) 
    {    
    	
        return ((num % 2) == 0); 
     
    } 
    

    
     
    //Main program begins (variables and output)
    public static void main(String[] args)
    {    
     
   		int num;
   		
   		System.out.print("Please enter an integer.. "); 
    	num = EasyIn.getInt(); 
    	
    	System.out.println("Number is: " + isEven(num)  ); 
    	
    
 
    }
}

