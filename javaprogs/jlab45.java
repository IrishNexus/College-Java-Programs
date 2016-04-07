
class jlab45
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				07/12/2015

  Purpose : 			Modify the program produced in (jlab41)
  						so that it writes out the user's input reversed (Joe Doe -> eoD eoJ).						
*/
				


{
    public static void main(String[] args)
    {
    
    		String name;
    		int noOfUppers=0;
    		int index;
    		
    		
			System.out.println("What is your full name?");  
			name = EasyIn.getString();
			
			for( index = name.length() -1 ; index >= 0 ; index--) 
		   		{
		   		 System.out.print(name.charAt(index)) ;
		   		 
				} 
				
				
				
    }
}

