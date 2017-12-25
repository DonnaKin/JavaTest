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
		avg=(int)(avg*100); // 평균의 소숫점 이하 2자리까지 구하기 위해서 avg에 100을 곱합
		avg=avg/100; // 다시 100으로 나누어 주면 소숫점 이하 2자리 까지 구해짐 
		System.out.println();
		System.out.println("합:"+sum+",평균:"+avg);
	}
}