class Jlab53

/* Student Name : 		Dylan Scully
   Student Id Number : 	C00207618
   Date :				08/02/2016
   Purpose : 			Modify the program jlab52 so that it outputs the number of words(done), 
 					    with the average(done), minimum and maximum number of characters in the words.
 
 
 
 */
{		
  	//Counting the number of spaces, method  
	public static int countspaces(String  str)
    {    
        int numSp = 0 ;
        int spacePos ;
        
        spacePos = str.indexOf(" ") ;
        while(spacePos > -1)
        	{
        		numSp++ ;
        		 spacePos = str.indexOf(" ",spacePos+1) ;	
        	}
        return numSp ;
     
    } 
    
    //Counting the number of words, method 
	public static int countwords(String  str)
    {    
        int numWds = 0 ;
        int spacePos ;
        String fstWord ;
        
        System.out.print("\n\t") ;
        
        //Now remove leading & trailing spaces then add a space at the end
        str = str.trim() + " " ;
        spacePos = str.indexOf(" ") ;
        while(spacePos > -1)
        	{
        		numWds++ ;
        		fstWord = str.substring(0,spacePos) ;
        		System.out.print(fstWord + ", ") ;
        		//Now remove the first word
        		str = str.substring(spacePos+1) ;
        		spacePos = str.indexOf(" ") ;
        	}
        return numWds ;
     
    } 
    
     
  //Main program begins (variables and output)
    public static void main(String[] args)
    {    
    String str;
    int noOfChars;
    int maxChars;
    int minChars;
    double aveNoOfChars;
    
    System.out.print("Please enter a string.. "); 
    str = EasyIn.getString();
    
  //finding number of chars minus spaces to get number of chars that make up words
    noOfChars = str.length();
    noOfChars = noOfChars - countspaces(str);
  //average calc
    aveNoOfChars = noOfChars / countwords(str);
    
    
				
    System.out.println("Number of chars :" + noOfChars) ;
    System.out.println("Average Number of chars :" + aveNoOfChars) ;
    System.out.println("Number of words :" + countwords(str)) ;
    
 
    }
}

