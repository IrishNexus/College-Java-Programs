
class jlab43
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				25/11/2015

  Purpose : 			Modify the program produced in (jlab41)
  						so that it writes out the number of characters							
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
			noOfChars = name.length();
			
			System.out.println("\nThe name is: " + name );
			System.out.println("\nThe number of characters: " + noOfChars );
			
			
			

    }
}

