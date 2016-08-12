package guviPro;

public class SortingByBinary {

	public static void main(String[] args) {
		int[] decimal=new int[args.length];
		int len=decimal.length;
		
		for(int i=0;i<len;i++){
			decimal[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if((Integer.bitCount(decimal[i]))<(Integer.bitCount(decimal[j]))){
					int temp=decimal[i];
					decimal[i]=decimal[j];
					decimal[j]=temp;
				}
				if((Integer.bitCount(decimal[i]))==(Integer.bitCount(decimal[j]))){
					if(decimal[i]<decimal[j]){
						int temp=decimal[i];
						decimal[i]=decimal[j];
						decimal[j]=temp;
					}
					
				}
			}
			System.out.println(decimal[i]);
		}

	}

}
