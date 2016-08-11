package guviPro;

public class FindingLeastNumber {

	public static void main(String[] args) {
		
		int num=23111995;
		int len=String.valueOf(num).length();
		char[] digits=String.valueOf(num).toCharArray();
		int least=num;
		int tlen=len;		
		for(int i=0;i<len-1;i++){
			for(int j=tlen-1;j>0;j--){
				int com=((Character.getNumericValue(digits[i]))*10)+Character.getNumericValue(digits[j]);
				if(least>com){
					least=com;
				}
			}
			tlen--;
		}
		System.out.println(least);
	}

}
