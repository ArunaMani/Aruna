public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer original=new StringBuffer(s.next());
		String result=original.reverse().toString();
		System.out.println(result);
	}

}
