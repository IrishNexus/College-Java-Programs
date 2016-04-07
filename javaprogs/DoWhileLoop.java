
class doWhileLoop
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				25/01/2015

  Purpose : 			Sample of a Do While loop(temp conversion)	
*/



{
    public static void main(String[] args)
    {
    
     double fahrenheit;
	 double centigrade;
	 char answer;
    	           	
		
	 	do		
 		 {	
 		  System.out.print("Enter the fahrenheit amount  ");
  		  fahrenheit = EasyIn.getDouble();
  		  centigrade = 5.0 / 9.0 * (fahrenheit - 32);
  		  System.out.println("The centigrade equivalent is " + centigrade);
  		  System.out.print("Run program again y/n ?  ");
  		  answer  = EasyIn.getChar(); //exit mechanism
  		 }
  		 
 	    while (answer == 'y');




    }
}

