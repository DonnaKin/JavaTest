import java.util.Scanner;

class Suhang06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = {"��û","����","�̴�","����","����",
			            "���","����","�ŵ���","�븲","�Ÿ�"};
		int dist[] = {0,8,10,15,22,27,37,42,45,58};

		String start,end;
		int dist1,dist2,dist3,fare; 

		while(true) {
			dist1=dist2=-1;fare=1000;
			System.out.print("��߿�:");
			start=scan.nextLine();
			System.out.print("������:");
			end=scan.nextLine();
			for(int i=0; i<str.length; i++){
				if(start.equals(str[i])) dist1=dist[i];
				if(end.equals(str[i])) dist2=dist[i];
			}
			if(dist1==-1 || dist2==-1) break;
			dist3=Math.abs(dist1-dist2);
			if(dist3 > 8) {
				dist3 -= 8;
				fare += dist3/4*50;
				if(dist3%4 !=0) fare += 50;
			} 
			System.out.println("���:"+fare+"��\n");
		}
		System.out.println("��ݰ���� �����մϴ�.");

	}
}
