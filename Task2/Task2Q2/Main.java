import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println(" Choose an option from 1 to 5, Enter 1 for addition, 2 for subtraction, 3 for division, 4 for multiplication, 5 for average: ");
		int option = in.nextInt();
		
		System.out.println("Enter two numbers to performing Arithmatic operation: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		
		if(option==5) {
			System.out.println("Enter two more numbers for performing average: ");
			int c = in.nextInt();
			int d = in.nextInt();
		}
		
		switch(option) {
			case 1:
				
				int add = a + b;
				if(add<0) {
					System.out.println("SOlution is a negative number");
				}

				System.out.println("The addition of 2 numbers is: "+add);
				break;
				
			case 2:
				
				int sub = a-b;
				if(sub<0) {
					System.out.println("Solution is a negative number");
				}
				
				System.out.println("The two numbers are subtracted, the answer is: " + subtraction);
				break;
				
			case 3:
				
				int div = a/b;
				if(div<0) {
					System.out.println("the solution is a negative/NAN number");
				}

				System.out.println("The two numbers are divided, the answer is: " + division);
				break;
				
			case 4:
				
				int mult = a*b;
				if(mult<0) {
					System.out.println("the soluiton is a negative number");
				}

				System.out.println("The two numbers are multiplied, the answer is: "+ multiplication);				
				break;
				
			case 5:
				
				double avg = (a+b+c+d)/4;
				if(avg<0) {
					System.out.println("the soluiton is a negative number");
				}

				System.out.println("The average of the four numbers is : "+ average);				
				break;
		}
		
}

}