import java.util.Arrays;


public class heap {

	public static void max_heapify(int[] A, int i){
		//Defining left children
		int l=2*i;
		// Defining right children
		int r=2*i+1;
		int largest,temp;
		if(l<=A.length && A[l-1]>A[i-1]) largest=l;
			else largest=i;
		if(r<=A.length && A[r-1]>A[largest-1]) largest=r;
		if(largest!=i) {
			temp=A[i-1];
			A[i-1]= A[largest-1];
			A[largest-1]= temp;
			max_heapify(A, largest);
		}
	}
	
	
	
	public int[] heapsort (int[] b){
		int[] a=new int[b.length];
		int temp;
		System.arraycopy(b, 0, a, 0, b.length);
		//Building MaxHeap
		for(int i=(int) Math.floor(a.length/2);i>0;i--) max_heapify(a,i);
		//Sorting
		int[] c=new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		for(int i=0;i<a.length-1;i++) {
			temp=c[c.length-1];
			a[c.length-1]=c[0];
			c[0]=temp;
			// Arrays.copyOf Range (array, first index to be including, 1 + last index to be included)
			c=Arrays.copyOfRange(c, 0, c.length-1);
			max_heapify(c,1);
		}
		a[0]=c[0];
		return a;
	}
	
	
}

