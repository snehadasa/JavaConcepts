package learning;

import java.util.Scanner;

public class ComparisionBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		 System.out.print( "Input first integer: " );       
	        num1 = input.nextInt();  
	 
	        System.out.print( "Input second integer: " );
	        num2 = input.nextInt();             
	        
		
		if (num1 == num2) {
			System.out.printf("%d == %d", num1, num2);
		}
		if ( num1 != num2 )          
            System.out.printf( "%d != %d\n", num1, num2 );  
        if ( num1 < num2 )          
            System.out.printf( "%d < %d\n", num1, num2 );  
        if ( num1 > num2 )          
            System.out.printf( "%d > %d\n", num1, num2 );  
        if ( num1 <= num2 )          
            System.out.printf( "%d <= %d\n", num1, num2 );  
        if ( num1 >= num2 )          
            System.out.printf( "%d >= %d\n", num1, num2 ); 
	}

}
