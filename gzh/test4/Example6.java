package cn.gzh.test4;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到银行!");
		System.out.println("请输入要创建的用户名、密码");
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String user=sc.nextLine();
		String password=sc1.nextLine();
		System.out.println("开户成功！");
		Bank stu = new Bank(0,user,password,0);
		int i=1;
        while(i!=0){
        	System.out.println("请输入要办理的业务：1 存钱 2 取钱 0 退出");
        	i= sc.nextInt();
        switch(i)
        {
        case 1:{System.out.println("请输入要存的钱：");
        double cash=sc.nextDouble();
        stu.SaveMoney(cash);
        }; 
        break;
        case 2:{
        System.out.println("请输入密码");
		String m=sc1.nextLine();
		if(m.equals(password))
		{
        System.out.println("密码正确！");
        System.out.println("请输入要取的钱：");
        double cash=sc.nextDouble();
        stu.GetMoney(cash);
        }
		else{
			System.out.println("密码不正确！请重新输入！ ");				
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
		System.out.println("存入金额为："+cash+"余额为："+sum+"元");
	}
	void GetMoney(double cash) {
		sum-=cash;
		System.out.println("取出金额为："+cash+"余额为："+sum+"元");	
	}
}
