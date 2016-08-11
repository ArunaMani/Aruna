package guviPro;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s = new String[args.length];
		for(int i=0;i<args.length;i++){
			s[i]=args[i];
		}
		int[] len = new int[s.length];
		int small = s[0].length();
		int large = 0;

		for (int i = 0; i < s.length; i++) {
			len[i] = s[i].length();
			large = len[i];
			if (len[i] < small) {
				small = len[i];
			}
		}
		int count = 0;
		String prefix="";
		
		for (int k = small; k > 0; k--) {
			count = 0;
			for (int j = 0; j < s.length-1; j++) {
				if ((s[j].substring(0, k)).equals((s[j + 1].substring(0, k)))) {
					count++;
					if(count==s.length-1){
						prefix=s[j].substring(0, k);
					}
				}
				else {
					break;
				}
			}
			if(count==s.length-1){
				break;
			}
		}
		
		System.out.println(prefix);
	}

}
