package Arrays;

public class Largest3 {

	private int n;
	private int[] a;
	
	public Largest3() {
		
	}
	
	public Largest3(int n, int[] a) {
		super();
		this.n = n;
		this.a = a;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	public void largest3 (int n, int[]a) {

		int first,second,third;
		if(n<3) {
			System.out.println("Array length invalid");
		}
		first=second=third=0;
		for(int k=0;k<n;k++) {
			if(a[k]>first) {
				third = second;
				second = first;
				first = a[k];
			}
			else if(a[k]>second) {
				third = second;
				second = a[k];
			}
			else if(a[k]>third) {
				third = a[k];
			}
		}
		System.out.println("3 largest numbers are :"+first+" "+second+" "+third);
	}
	
	
}
