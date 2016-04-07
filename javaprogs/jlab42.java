
class jlab42
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				25/11/2015

  Purpose : 			Modify the program produced at (jlab41) 
  						so output is the number of characters in input.		
*/



{
    public static void main(String[] args)
    {
    
    		String name;
    		String firstName;
    		int space;
    
    		System.out.println("What is your full name?");  
			name = EasyIn.getString();
			
			space = name.indexOf(" ");
			firstName = name.substring(0, space);
			
			System.out.println("The first name is: " + firstName );
			
			
			
			

    }
}

