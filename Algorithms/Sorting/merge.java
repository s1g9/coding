import java.util.Arrays;


public class merge {
	public static void main() {	
	}
	public int[] mergesort(int[] a) {
		if (a.length<=1) {
			return a;}
		int middle=a.length/2;
		int[] L= new int [middle]; 
		L= mergesort(Arrays.copyOfRange(a, 0, middle));
		int[] R=new int[a.length-middle];
		R= mergesort(Arrays.copyOfRange(a, middle, a.length));
		int i=0,j=0;
		int [] result=new int[a.length];
		for(int k=0; k<a.length;k++) {
			if(j==a.length-middle)
			{	
				result[k]=L[i];
				i++;
				continue;
			}
			if(i==middle)
			{
				result[k]=R[j];
				j++;	
				continue;
			}
			if(L[i]<R[j]){
			result[k]=L[i];
			i++;
			} else {
			result[k]=R[j];
			j++;}
		
	   }
	   return result;
	}
	
	
	

}
