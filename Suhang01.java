class Suhang01 {
	public static void main(String[] args) {
		int j,sum=0;
		for(int i=1; i<=10; i++){
			j=11-i;
			sum += i*j;
			System.out.print("("+j+"*"+i+")");
			if(i==10) System.out.print("=");
			else System.out.print("+");
		}
		System.out.println(sum);

	}
}

		