class Suhang02 {
	public static void main(String[] args) {
		int a[] = new int[args.length];
		int i=0, sum=0, cnt=0;
		double avg;

		do {
			a[i]=Integer.parseInt(args[i]);
			if( !(a[i]%3==0 || a[i]%5==0) ){
				sum += a[i];
				System.out.print(a[i]+"\t");
				cnt++;;
			}
		}while(++i < args.length);
		avg=(double)sum/cnt;
		avg=(int)(avg*100); // ����� �Ҽ��� ���� 2�ڸ����� ���ϱ� ���ؼ� avg�� 100�� ����
		avg=avg/100; // �ٽ� 100���� ������ �ָ� �Ҽ��� ���� 2�ڸ� ���� ������ 
		System.out.println();
		System.out.println("��:"+sum+",���:"+avg);
	}
}