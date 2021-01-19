import java.util.*;

public class Main {
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	        int input=0;
        	while(input>=0){
            	System.out.print("Enter a input: ");
            	input = sc.nextInt();

	        if(num%2 !=0){
                	System.out.println("NEW");
            	}else if(num>=2 && num <=5){
                    	System.out.println("OLD");
                }else if(num>=6 && num <=30){
                    	System.out.println("NEW");
                }else if(input>30){
                    	System.out.println("OLD");
                }
            	}
        	}
}
}