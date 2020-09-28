package Arrays;

public class MissingNumber {
	
	private int n;
	private int[] a;

	public MissingNumber(int n, int[] a) {
		super();
		this.n = n;
		this.a = a;
	}
	
	public MissingNumber() {
		
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

	public int getMissingNumber(int[] a, int n) {
		int k, total;
		total = (n+1) * (n+2) / 2;
		for( k=0;k<n;k++) {
			total -= a[k];
		}
		return total;
		}
	}
	

