package cn.gzh.test4;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ��������!");
		System.out.println("������Ҫ�������û���������");
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String user=sc.nextLine();
		String password=sc1.nextLine();
		System.out.println("�����ɹ���");
		Bank stu = new Bank(0,user,password,0);
		int i=1;
        while(i!=0){
        	System.out.println("������Ҫ�����ҵ��1 ��Ǯ 2 ȡǮ 0 �˳�");
        	i= sc.nextInt();
        switch(i)
        {
        case 1:{System.out.println("������Ҫ���Ǯ��");
        double cash=sc.nextDouble();
        stu.SaveMoney(cash);
        }; 
        break;
        case 2:{
        System.out.println("����������");
		String m=sc1.nextLine();
		if(m.equals(password))
		{
        System.out.println("������ȷ��");
        System.out.println("������Ҫȡ��Ǯ��");
        double cash=sc.nextDouble();
        stu.GetMoney(cash);
        }
		else{
			System.out.println("���벻��ȷ�����������룡 ");				
		    }
        	
                }
        }
        }
	}

}
class Bank{
	double cash;
	String  user;
	String password;
	double sum;
	public Bank(double cash,String user,String password,double sum) {
		this.cash=cash;
		this.user=user;
		this.password=password;
		this.sum=sum;
	}
	void SaveMoney(double cash) {
		sum+=cash;
		System.out.println("������Ϊ��"+cash+"���Ϊ��"+sum+"Ԫ");
	}
	void GetMoney(double cash) {
		sum-=cash;
		System.out.println("ȡ�����Ϊ��"+cash+"���Ϊ��"+sum+"Ԫ");	
	}
}
