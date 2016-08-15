package guviPro;

public class PangramChecker {

	public static void main(String[] args) {
		String string=args[0].toLowerCase();
		int count=0;
		
		for(char ch='a';ch<='z';ch++){
			String chr=ch+"";
			String[] split=string.split(chr);
			int len=split.length;
			
			if(len>=1){
				if(len>=2){
					count++;
				}
				else if((string.charAt(string.length()-1))==ch){
					count++;
				}
			}
		}
		
		if(count>=26){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}

