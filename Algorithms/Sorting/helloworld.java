
public class helloworld {


	public static void main(String[] args) {
		int n,largestno;
		n=20;
		largestno=20;
		randomno ran = new randomno(n);
		int[] a;
		a = new int[n];
		a= ran.getarray(largestno);
		System.out.println("Random Array");
		for(int i=0 ; i<a.length;i++) System.out.print(a[i]+" ");
		
		//Insertion  Sort
		insertion sort_insertion = new insertion();
		int[] b;
		b=sort_insertion.sortedarray(a);
		System.out.println("\nInsertion Sorted Array:");
		for(int i=0 ; i<b.length;i++) System.out.print(b[i]+" ");
		
		//Merge  Sort		
		merge sort_merge = new merge();
		int[] c;
		c= sort_merge.mergesort(a);
		System.out.println("\nMerge Sorted Array:");
		for(int i=0 ; i<c.length;i++) System.out.print(c[i]+" ");
		
		//Heap  Sort		
		heap sort_heap = new heap();
		int[] d;
		d = sort_heap.heapsort(a);
		System.out.println("\nHeap Sorted Array:");
		for(int i=0 ; i<d.length;i++) System.out.print(d[i]+" ");
		
		//Quick  Sort		
		quick sort_quick = new quick();
		int[] e;
		e = sort_quick.quicksort(a);
		System.out.println("\nQuick Sorted Array:");
		for(int i=0 ; i<e.length;i++) System.out.print(e[i]+" ");
		
		//Counting  Sort		
		counting sort_count = new counting();
		int[] f;
		f = sort_count.sortedarray(a,largestno);
		System.out.println("\nCounting Sorted Array:");
		for(int i=0 ; i<f.length;i++) System.out.print(f[i]+" ");
		
		//Bucket  Sort		
		bucket sort_bucket = new bucket();
		int[] g;
		g = sort_bucket.sortedarray(a,largestno);
		System.out.println("\nBucket Sorted Array:");
		for(int i=0 ; i<g.length;i++) System.out.print(g[i]+" ");
		
		
		System.out.println("\n");
		for(int i=0 ; i<a.length;i++) System.out.print(a[i]+" ");
		 
		
	}
	

}


