import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int avg = (a+b+c)/3;

		System.out.println("avg= " + avg);
		
		if (avg>a && avg>b && avg>c) {
			System.out.println("avg is higher than a,b,c");
		}else if (avg>a && avg>b) {
			System.out.println("avg is higher than a, b");
		}else if (avg>a && avg>c ) {
			System.out.println("avg higher than a, c");	
		}else if(avg >b && avg>c) {
			System.out.println("avg is higher than b,c");
		}else if(avg>a) {
			System.out.println("avg is just higher than a");	
		}else if(avg>b) {
			System.out.println("avg is just higher than b");	
		}else{
			System.out.println("avg is just higher than c");	
		}

}
}