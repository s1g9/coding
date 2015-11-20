
public class insertion {

	
	public insertion(){
	}
	public static void main() {
		
	}
	public int[] sortedarray (int[] b){
		int[] a=new int[b.length];
		System.arraycopy(b, 0, a, 0, b.length);
		int temp;
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
	
}
