import java.util.Random;
import java.util.Scanner;

public class Gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.print("������༶��������"+" ");       
	       @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	       int m = sc.nextInt();
	       chuCun(m);
           rand(m);
	}
	//��������
	static void chuCun(int m) 
	{      String[] arr =new String [m];
	        System.out.println("����ѧ�����֣�");
		for(int i=0;i<arr.length;i++) {
			@SuppressWarnings("resource")
			Scanner sc2 = new Scanner(System.in);
			 arr[i] = sc2.nextLine();
		}
		System.out.print("�Ƿ�չʾ:�ǰ�1��0"+" ");       
	       @SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
	       int k = sc1.nextInt();
	       if(k==1) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		}
	}
	//�����
	static void rand(int m) 
	{
	       System.out.print("�������ȡ������"+" ");       
	       @SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
	       int n = sc1.nextInt();
	       int sum = 0;
	       while(sum!=n) 
	       {
	       int rand = new Random().nextInt(m)+1;
	       System.out.println("�鵽�ĺ���Ϊ��"+rand+"��");
	       sum++;
	       }
	}		
}
