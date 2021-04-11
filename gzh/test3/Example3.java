package cn.gzh.test3;

import java.util.Scanner;

class Rectangle{
	private double length;
	private double width;
	public Rectangle(double height, double width) {
		this.length = height;
		this.width = width;
	}
     public String info() {
    	 double s=length*width;
    	 return "�������Ϊ"+s;
     }
}
class Square extends Rectangle{
	double side;
	public Square(double length, double width, double side) {
		super(length, width);
		this.side = side;
	}

	public String info1() {
   	 double s1=side*side;
   	 return super.info()+" ���������Ϊ"+s1;
    }
}
public class Example3 {

	public static void main(String[] args) {
		System.out.print(" ��������εĳ�����");
		Scanner sc = new Scanner(System.in);
		   int a = sc.nextInt();
	       int b = sc.nextInt();
	       System.out.print(" �����������εıߣ�");
	       int n = sc.nextInt();
	       Square sq = new Square(a,b,n);
	       System.out.print(sq.info1());

	}

}
