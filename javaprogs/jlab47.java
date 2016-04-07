
class jlab47
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				09/12/2015

  Purpose : 			Modify the program produced in (jlab41)
  						so that it writes out the number of uppercase letters					
*/
				


{
    public static void main(String[] args)
    {
    
    		String name;
    		int index;
    		int character=0;
    		
    		
			System.out.println("What is your full name?");  
			name = EasyIn.getString();
    		
    		for(index = 0 ;index < name.length();index++ )
    			{
    			if(name.charAt(index) == 'A' || name.charAt(index) == 'a')	
    				{
    					character++ ;
    				}
    			}
    		System.out.println("Number of 'A' or 'a' characters: " + character  ) ;
				
				
				
    }
}

