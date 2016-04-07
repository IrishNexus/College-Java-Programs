
class forLoop
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				25/01/2015

  Purpose : 			Sample of a for loop	
*/



{
    public static void main(String[] args)
    {
    
    	int index;
    	int noOfNames;
    	String currentName;
    	
    	System.out.print("How many Names  ");
		noOfNames = EasyIn.getInt();
			
    	for (index = 1; index <= noOfNames; index ++)
   		{
       		System.out.print("Enter name " + index + " ");
			currentName = EasyIn.getString();
			System.out.println("Hello " + currentName);
   		}




    }
}

