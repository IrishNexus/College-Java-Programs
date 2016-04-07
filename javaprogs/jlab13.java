class jlab13 


// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program





{
    public static void main(String[] args)
    {
    	int sum ;
    	int product ;
    	double average ;
    	int first ;
    	int second ;
    	int third ;
    	
     
    System.out.println("Please input your first number ");   
	first = EasyIn.getInt() ;
	System.out.println("Please input your second number ");   
	second = EasyIn.getInt() ;
	System.out.println("Please input your third number ");   
	third = EasyIn.getInt() ;
	sum = first + second + third ;
	product = first * second * third ;
	average = sum / 3 ;
	
	System.out.println("The sum of your three number is " + sum) ;
	System.out.println("The product of your three numbers is " + product) ;  
	System.out.println("The average of your three numbers is " + average) ; 
    }
}

