import java.util.Scanner;

class Suhang05 {
	public static void main(String[] args) {
		int a[]={2,3,4,4,3,1,2,1,1,2,2,3,1,2};
		int b[] = new int[4];

		for(int i=0; i<a.length; i++)
			b[a[i]-1]++;
		
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]);

		for(int j=0; j<b[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
