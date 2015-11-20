
public class quick {

	public static int partition (int[] a,int p,int r){
		int x=a[r];
		int i=p-1,temp;
		for (int j=p;j<r;j++){
			if (a[j]<x){
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		i++;
		temp=a[i];
		a[i]=a[r];
		a[r]=temp;
		return i;
	}
	
	public void sortedarray(int[] a,int p,int r) {
		int q;
		if (p<r) {
			q=partition(a,p,r);
			sortedarray(a,p,q-1);
			sortedarray(a,q+1,r);
		}
		
	}
	
	public int[] quicksort(int[] b){
		int[] a=new int[b.length];
		System.arraycopy(b, 0, a, 0, b.length);
		sortedarray(a,0,a.length-1);
		return a;
	}
	
	
	
	
}
