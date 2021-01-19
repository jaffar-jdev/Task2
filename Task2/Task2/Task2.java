import java.util.*;

public class Task2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number of your choice");
		int a = in.nextInt();
		
		if (a%3==0 && a%5==0 ) {
			System.out.println("Consultadd JAVA Training");
		}else if (a%5==0) {
			System.out.println("JAVA Training");	
		}else if (a%3==0) {
			System.out.println("Consultadd");	
		}


}

}