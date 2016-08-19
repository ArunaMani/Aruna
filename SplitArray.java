package guviPro;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int[] arr = {3,2,1,2,2};
		int t = arr.length;
		int total = 0;
		int[] ans1;
		int[] ans2;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		
		int j=0;
		for(int i=0;i<t;i++){
			int[] split = Arrays.copyOfRange(arr, j, i+1);
			int temp=0;
			for (int k = 0; k < split.length; k++) {
				temp += split[k];
			}
			if (split.length > 0 && (t-split.length) >0) {
				if (((float)(temp) / split.length) == ((float)(total - temp) / (t - split.length))) {
					ans1 = new int[split.length];
					ans2 = new int[t - (split.length)];
					ans1 = Arrays.copyOf(split, (split.length) );
					ans2 = Arrays.copyOfRange(arr, (split.length), t );
					
					System.out.println("First array");
					for(int a1=0;a1<ans1.length;a1++){
						System.out.print(ans1[a1]+" ");
					}
					System.out.println("\nSecond array");
					for(int a2=0;a2<ans2.length;a2++){
						System.out.print(ans2[a2]+" ");
					}
					count++;
					break;
				}
			}
		}
		if(count==0){
			System.out.println("Not possible");
		}
	}

}
