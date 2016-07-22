import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		String title=s.nextLine();
		System.out.println(title+","+name.charAt(0));
		
	}
}
