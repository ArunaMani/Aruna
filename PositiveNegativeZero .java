public class PositiveNegativeZero {

	public static void main(String[] args) {
		if(Integer.parseInt(args[0])==0){
			System.out.println("Zero");
		}
		else if(Integer.parseInt(args[0])>0){
			System.out.println("Positive");
		}
		else{
			System.out.println("negative");
		}
	}

}
