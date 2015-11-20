
public class counting {

	public int[] sortedarray(int[] b,int k) {
		int[] a=new int[b.length];
		System.arraycopy(b, 0, a, 0, b.length);
		int j;
		int[] d= new int[a.length];
		int[] c=new int[k];
		for (int i=0;i< k;i++) {
			c[i]=0;
		}
		for (int i=0;i< a.length;i++) {
			c[a[i]]=c[a[i]]+1;
		}
		for (int i=1;i< k;i++) {
			c[i]=c[i]+c[i-1];
		}
		for (int i=a.length;i>0;i--) {
			j=i;
			j--;
			d[c[a[j]]-1]=a[j];
			c[a[j]]=c[a[j]]-1;
		}
	return d;
	}
	
	
	
	
}
