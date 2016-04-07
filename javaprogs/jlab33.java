
class jlab33

/*  Student Name : 		Dylan Scully
    Student Id Number : C00207618
    Date :				09/11/2015
    Purpose : 			- Write a program to read a list of integer values which will find and display 	
    				      the index of the first occurrence and the last occurrence of the number 12. 	 
    				    - Your program should print the Index values of 0 if the number 12 is not found. 
    				    - The index is the sequence number of the data item 12.
    				      eg: if 8th data item is the only 12,8 should be displayed as first and last occurrence.
*/

{
    public static void main(String[] args)
    {
     
    	
    		int input ;
    		int index =0;
    		int firstOcc =0;
    		int lastOcc = 0;
    		
			index = 0 ;
			System.out.print("Enter your first number : ") ;  
			input = EasyIn.getInt() ; 
			
			while (input != 0)
				{
					System.out.print("Enter another number :")  ;  
					 input = EasyIn.getInt() ; 
					 
				
					index ++ ;
					
				//last occ of 12
				if (input == 12)
			    	{
					lastOcc = index ;
					}
				//first occ of 12	
				if (input == 12 && firstOcc == 0)
					{
					firstOcc = index ;
					}	
					
			    	
			    	 
			    }
			    
			System.out.println("\n\n\nThe first occurance of 12 is : " + firstOcc) ;	
			System.out.println("\n\n\nThe last occurance of 12 is : " + lastOcc) ;
				
    }
}

