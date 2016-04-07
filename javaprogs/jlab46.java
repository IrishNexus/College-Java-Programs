
class jlab46
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				09/12/2015

  Purpose : 			Modify the program produced in (jlab41)
  						so that it writes out the names reversed (Joe Doe -> Doe Joe).						
*/
				


{
    public static void main(String[] args)
    {
    
    		String name;
    		String reverse;
    		int index;
    		
			System.out.println("What is your full name?");  
			name = EasyIn.getString();
			
			reverse = name.substring(name.indexOf(" ")+1) + " " + name.substring(0,name.indexOf(" ")) ;
	
			
			System.out.println("Your name in reverse order is : " + reverse);
			
    		
				
				
				
    }
}

