import java.util.Random;


public class randomno {
	public static int n;
	public static int[] b=new int[n];
	public randomno(int a){
		n=a;
	}

	
	public static void main() {
		
	}
	public int[] getarray(int largest){
		int[] a = new int[n];
		Random rand = new Random();
		for (int i=0;i<n;i++) {
			a[i]=rand.nextInt(largest);
		}
		return a;
	}
}
