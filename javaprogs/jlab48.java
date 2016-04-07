
class jlab48
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				09/12/2015

  Purpose : 			Modify the program produced in (jlab41)
  						so that it takes out a middle name if entered					
*/
				


{
    public static void main(String[] args)
    {
    
    		String name;
    		String noMiddle;
    		int index;
    		
			System.out.println("What is your full name?");  
			name = EasyIn.getString();
			
			noMiddle = name.substring(0,name.indexOf(" ")) + " " + name.substring(name.lastIndexOf(" ")+1) ;
	
			
			System.out.println("Your name without any middle name is: " + noMiddle);
			
    		
				
				
				
    }
}

