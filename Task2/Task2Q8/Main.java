import java.util.*;

public class Main {

     

    public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);

        System.out.println("Enter a character: ");

        char ch = in.next().toLowerCase().charAt(0);
	if (ch == 'r' || ch =='a' || ch == 'n' || ch =='d' || ch == 'o' || ch == 'm'){
		System.out.println("FOUND");
	}
	System.out.println("NOTFOUND");
}

}