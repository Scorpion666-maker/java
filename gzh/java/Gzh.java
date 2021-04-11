import java.util.Random;
import java.util.Scanner;

public class Gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.print("请输入班级总人数："+" ");       
	       @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	       int m = sc.nextInt();
	       chuCun(m);
           rand(m);
	}
	//存入数据
	static void chuCun(int m) 
	{      String[] arr =new String [m];
	        System.out.println("输入学生名字：");
		for(int i=0;i<arr.length;i++) {
			@SuppressWarnings("resource")
			Scanner sc2 = new Scanner(System.in);
			 arr[i] = sc2.nextLine();
		}
		System.out.print("是否展示:是按1否按0"+" ");       
	       @SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
	       int k = sc1.nextInt();
	       if(k==1) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		}
	}
	//抽号数
	static void rand(int m) 
	{
	       System.out.print("请输入抽取次数："+" ");       
	       @SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
	       int n = sc1.nextInt();
	       int sum = 0;
	       while(sum!=n) 
	       {
	       int rand = new Random().nextInt(m)+1;
	       System.out.println("抽到的号数为："+rand+"号");
	       sum++;
	       }
	}		
}
