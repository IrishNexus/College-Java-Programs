class Addition
//
// A Simple program that adds two numbers entered from the keyboard
// 
{  
      public static void main(String args[])
        {
  	int number1;
	int number2;
	int number3;
	int answer;

	System.out.print("What is your first number? ->  ");
        	number1 = EasyIn.getInt();
        	System.out.print("And your second number? ->  ");
        	number2 = EasyIn.getInt() ;
        	System.out.print("And your third number? ->   ");
        	number3 = EasyIn.getInt() ;
        	answer = number1 * number2 * number3;
        	System.out.println("If you multiply these three numbers, the answer is " + answer) ;
        }
}
