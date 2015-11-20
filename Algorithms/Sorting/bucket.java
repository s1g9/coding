import java.util.Arrays;


public class bucket {

	public double[] insertionsort(double[] a){
		double temp;
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				}
				else break;
			}
		}
	return a;	
	}
	
	
	public int[] sortedarray(int[] b,int k) {
		int[] d=new int[b.length];
		System.arraycopy(b, 0, d, 0, b.length);
		double[] a=new double[d.length];
		for(int i=0;i<a.length;i++) {
			a[i]=(double) d[i]/k;
		}
		double[][] c=new double[a.length][a.length];
		int[] count= new int[a.length];
		for(int i=0;i<a.length;i++) count[i]=0;
		int t;
		for(int i=0;i<a.length;i++) {
			t=(int) Math.floor(a[i]*a.length);
			c[t][count[t]]=a[i];
			count[t]= count[t]+1;
		}
		t=0;
		
		for(int i=0; i<a.length;i++){
			if(count[i]>0) {
				c[i]=insertionsort(Arrays.copyOfRange(c[i], 0, count[i]));
				for(int j=0;j<count[i];j++){
					d[t]=(int) Math.abs(c[i][j]*k);
					t++;
				}	
			}
		}
	return d;	
	}
		
}
	

