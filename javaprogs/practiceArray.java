class Examtest
 
/* 1. Write a program which allows the user to enter 4 strings into an array of strings.
   2. Search the array and output to the screen the string with its first and second characters being the same along with its index position.
   3. You cannot use self-made methods.
*/   

{
	public static void main(String args[])
 
 {
    	String[] stringArray;
    	String userString = "";
    	int index;
    	String storeString = "";
    	int storeIndex = 0;
   
    	stringArray = new String [4];
   
    	for (index=0;index<4;index++)
    		{
        		System.out.println("Enter string");
        		userString = EasyIn.getString();
        		stringArray[index] = userString;
    		}
   
    	for(index=0;index<4;index++)
    		{
       		if (stringArray[index].charAt(0) == stringArray[index].charAt(1))
        		{
            			storeString = stringArray[index];
            			storeIndex = index;
        		}
    		}

    		if (storeIndex !=0)
    			{
   				System.out.println(storeString + " at index position " + storeIndex + " starts with double characters. " );
    			}
    		else
    			{
        			System.out.println("No word began with double letters");
    			}
 }  
   
}      