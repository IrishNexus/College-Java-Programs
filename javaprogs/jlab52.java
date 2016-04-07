class jlab52
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				14/12/2015

  Purpose : 			Modify the program jlab51 so that it outputs the user input in reverse order.
 					    ("This word is 3 chars" --> "chars 3 is word This")
*/						


{
    public static void main(String[] args)
    {
    
    		String str1; 
    		String reverse;
    		String lstWd ;
            int index;
            int spPos ;
            
            System.out.print("Enter a string.. ");
            str1 = EasyIn.getString();
            
            System.out.print("\n\t") ;
            spPos = str1.lastIndexOf(" ") ;
            
            while(spPos > -1)
            	{
            		lstWd = str1.substring(spPos+1) ;
            		System.out.print(lstWd + " " ) ;
            		//Now remove the last word
            		str1 = str1.substring(0,spPos) ;
            	    spPos = str1.lastIndexOf(" ") ;
            	
            	}
     
     		System.out.println("\nThose are the words in reverse.. ");			
    }
}

