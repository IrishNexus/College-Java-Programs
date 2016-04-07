class jlab51
/*
  Student Name : 		Dylan Scully
  Student Id Number : 	C00207618
  Date :				14/12/2015

  Purpose : 			Write a program which will input a string from the keyboard, and output the number of separate words,					
						where a word is one or more characters separated by spaces. 
						Your program should only count as words groups of characters in the ranges A..Z and a..z (no numbers)
*/			


{
    public static void main(String[] args)
    {
    
    		String str1; 
            int wordCount = 1;
            int index;
            
            System.out.print("Enter a string.. ");
            str1 = EasyIn.getString();
            
            for (index = 0; index < str1.length(); index++) 
            {
                if (str1.charAt(index) == ' ' && str1.charAt(index+1)!=' ') 
                {
                    wordCount++;
                } 
            }
            System.out.println("Word count is = " + wordCount);
    				
    }
}

