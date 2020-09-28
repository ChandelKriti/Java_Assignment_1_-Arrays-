package Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
	
		do{

			System.out.println("Enter"+"\n"+"1 for Finding missing number in array"+"\n"+"2 for finding largest 3 elements in array"+"\n"+"3 for finding common elements in 3 sorted array" 
			+"\n"+"4 for moving all zeroes at end of array" + "\n"+"5 to exit");
			
			i = scanner.nextInt();
			
		switch(i) {
		case 1: 
		{
			
			int a[]= {1,2,3,4,7,6,8};
			int n =a.length;
			MissingNumber mn =  new MissingNumber();
			int missingNumber = mn.getMissingNumber(a,n);
			System.out.println(missingNumber);
			
			break;
		}
		case 2:
		{
			int a[] = new int[10];
			System.out.println("Enter size of array <= 10");
			int n=scanner.nextInt();
			System.out.println("Enter array elements");
			for(int j=0;j<n;j++) {
				a[j]=scanner.nextInt();			
				}
			Largest3 l3 = new Largest3();
			l3.largest3(n,a);
			break;
		}
		
		case 3: 
		{
			int a1[] = {1,5,10,20,40,80};
			int a2[] = {6,7,20,80,100};
			int a3[] = {3,4,15,20,30,70,80,120};
			
			CommonElements cm = new CommonElements(a1,a2,a3);
			System.out.println("Common Elements :");
			cm.commonElement(a1,a2,a3);
			break;
		}
		
		case 4: 
		{
			System.out.println("Enter array length :");
			int n = scanner.nextInt();
			int a[] = new int[n];
			System.out.println("Enter array elements");
			for(int j=0;j<n;j++) {
				a[j]=scanner.nextInt();			
				}
			System.out.println("Array after pushing zeroes at end :");
			ZeroesAtEnd zero = new ZeroesAtEnd(a,n);
			int[]b=zero.zeroAtEnd(a,n);
			for(int k=0;k<n;k++)
			{
				System.out.println(b[k]+" ");
			}
			break;
		}
		
		
		default : 
		{
			
			break;
		}
			
		}
		
		}while(i!=5);
		scanner.close();
	}
	}

