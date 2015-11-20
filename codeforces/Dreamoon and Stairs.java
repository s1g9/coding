import java.util.Scanner;
import java.util.Arrays;
public class codeforcesquestion {
  public static void main (String args[]) {
	  Scanner scan = new Scanner(System.in); 
	  int arr[] = new int[5];
	  int total=0;
		for (int i=0;i<arr.length ;i++ ) {
	  	arr[i]=scan.nextInt();
	  	total+=arr[i];
	  	Arrays.sort(arr);
	  }	 
	  System.out.println((((total/5)*5==total) ? (total/5 - arr[0]) : -1 ));
  }
}

