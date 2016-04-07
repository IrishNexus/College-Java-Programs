class Jlab63


/* Student Name : 		Dylan Scully
   Student Id Number : 	C00207618
   Date :				02/03/2016
   Purpose : 			Write a method called alphaCount() that takes a String as its argument.
   						- return number of alphabetic characters ie: A-Z / a-z 
 */
{
		
  	//Counting the number of numeric characters, to take from the length = number of chars
	public static int alphaCount(String alpha) 
    {    
    
    	int index ;
    	int noOfAlphas = 0 ;   
    	int noOfNums = 0 ;
    	
    	for(index = 0 ; index < alpha.length() ; index++)
    		{
    			if(Character.isDigit(alpha.charAt(index)))
    			noOfNums++ ;
    		}
    	
    	noOfAlphas = alpha.length() ;
    	noOfAlphas = noOfAlphas - noOfNums ;
    	
        return noOfAlphas ;
       	 
    } 
    
    //Counting the number of spaces, to take from the number of chars
	public static int countSpaces(String alpha)
    {    
        int numSp = 0 ;
        int spacePos ;
        
        spacePos = alpha.indexOf(" ") ;
        while(spacePos > -1)
        	{
        		numSp++ ;
        		 spacePos = alpha.indexOf(" ",spacePos+1) ;	
        	}
        return numSp ;
     
    }
    	     
    //Main program begins (variables and input/output)
    public static void main(String[] args)
    {    
     
   	String alpha;
   	int numOfAlphas;
   		
   	System.out.print("Please enter a string.. "); 
    alpha = EasyIn.getString(); 
    	
    //Taking the spaces from the number of chars to get actual number of chars
    numOfAlphas = alphaCount(alpha) - countSpaces(alpha); 
    	
    System.out.println("number of alpha chars: " + numOfAlphas); 
    	
    
 
    }
}

