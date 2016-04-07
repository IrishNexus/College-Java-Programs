
class jlab41
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				25/11/2015

  Purpose : 			Prompt the user to enter their name, 
  						read in the name, and write to the screen just the surname.							
*/



{
    public static void main(String[] args)
    {
    
    		String name;
    		String surname;
    		int noOfChars;
    		int space;
    		
			System.out.println("What is your full name?");  
			name = EasyIn.getString();
			
			space = name.indexOf(" ");
			surname = name.substring(space + 1);
			noOfChars = surname.length();
			
			System.out.println("\nThe surname is: " + surname );
			System.out.println("\nThe number of characters is: " + noOfChars );
			
			
			

    }
}

