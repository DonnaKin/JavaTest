class Suhang03 {
	public static void main(String[] args) {
		int a[]={88,64,27,81,75,17,94,34,42,39};
		int b[] = new int[a.length];
		int max1,max2;

		max1=b[0];
		max2=a[0];
		for(int i=0; i<a.length; i++)
			b[i]=Math.abs(a[i]-55);

		for(int i=0; i<a.length; i++)
			if(b[i] > max1) {
				max1=b[i];
				max2=a[i];
			}
		System.out.println("55에서 가장 먼 숫자 : "+max2);
	}
}