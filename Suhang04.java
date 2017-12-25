import java.util.Scanner;

class Suhang04 {
	public static void main(String[] args) {
		int a[]= new int[32];
		int num;
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("정수값 입력 : ");
			num=scan.nextInt();
			if(num==0) break;

			for(int i=0; i<a.length; i++)
				a[i]=num>>i&1;

			for(int i=a.length-1; i>=0; i--)
				System.out.print(a[i]);
			System.out.println();
		}while(true);
	}
}