class Jlab62


/* Student Name : 		Dylan Scully
   Student Id Number : 	C00207618
   Date :				22/02/2016
   Purpose : 			Write a method called isAlpha() that takes a char as its argument.
   						- return true if it is an alphabetic character ie: A-Z / a-z 
 */
{
 
  	//Calc for Alphabetic character
	public static boolean isAlpha(char alpha) 
    {    
    	
        return (alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z');
          	 
    } 
    	     
    //Main program begins (variables and input/output)
    public static void main(String[] args)
    {    
     
   		char alpha;
   		
   		System.out.print("Please enter a character.. "); 
    	alpha = EasyIn.getChar(); 
    	
    	System.out.println("character is: " + isAlpha(alpha)); 
    	
    
 
    }
}

