package Arrays;

public class CommonElements {

	private int a1[];
	private int a2[];
	private int a3[];
	
	public CommonElements(int[] a1, int[] a2, int[] a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	public int[] getA1() {
		return a1;
	}

	public void setA1(int[] a1) {
		this.a1 = a1;
	}

	public int[] getA2() {
		return a2;
	}

	public void setA2(int[] a2) {
		this.a2 = a2;
	}

	public int[] getA3() {
		return a3;
	}

	public void setA3(int[] a3) {
		this.a3 = a3;
	}
	
	public void commonElement(int[] a1,int[] a2, int[] a3) {
		
		int i,j,k;
		i=j=k=0;
		while(i < a1.length && j < a2.length && k < a3.length) {
			if(a1[i] == a2[j] && a2[j] == a3[k]) {
				System.out.println(a1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(a1[i] < a2[j]) {
				i++;
			}
			else if(a2[j] < a3[k]) {
				j++;
			}
			else k++;
		}
		
	}
	
}
