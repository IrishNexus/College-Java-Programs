class Jlab64


/* Student Name : 		Dylan Scully
   Student Id Number : 	C00207618
   Date :				07/03/2016
   Purpose : 			Write a method called award() that takes a mark as its argument(DONE).
   						- return a string containing the values of either
   						- Distinction 70-100, 
   						- Merit1 63-69, 
   						- Merit2 55-62, 
   						- Pass 40-54, 
   						- Fail <40.
 */
{
		
  	//award Method
	public static String award(int mark) 
    {  
    	String markAward ; 
    
  		if 		(mark >= 70 && mark <= 100)
		{
				markAward ="Distinction ";
		}
		
	else if 	(mark >= 63 && mark <= 69)
		{
	     		markAward ="Merit1 ";
		}
	
	else if 	(mark >= 55 && mark <= 62) 
		{
	     		markAward ="Merit2 ";
		}
	
	else if	 	(mark >= 54 && mark <= 40)
		{
	     		markAward ="Pass ";
		}
	
	else if     (mark <= 40 && mark >= 0) 		
		{
	     		markAward ="Fail ";
		}
	else 
		{
				markAward ="Please enter a number between 1 and 100";
		}

				
    	
        return markAward ;
       	 
    } 
    	     
    //Main program begins (variables and input/output)
    public static void main(String[] args)
    {    
     
   		int mark;
   		
   		System.out.print("Please enter your mark.. "); 
    	mark = EasyIn.getInt(); 
    	
    	System.out.println(" " + award(mark));
    	
     
 
    }
}

