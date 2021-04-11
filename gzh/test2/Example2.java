package cn.gzh.test2;
class Staff{
	private String name;
	private int age;
	private String sex;
	public Staff(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String info() {
		return "姓名："+this.getName()+",年龄："+this.getAge()+",性别："+this.getSex();
	}
}
class Administrator extends Staff{
	private String duty;
	private String  salary;
	public Administrator(String name, int age, String sex, String duty, String salary) {
		super(name, age, sex);
		this.duty = duty;
		this.salary = salary;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String info() {
		return super.info()+",职位："+this.getDuty()+",年薪："+this.getSalary();
	}
}
class Worker extends Staff{
	private String department;
	private double pay;
	public Worker(String name, int age, String sex, String department, double pay) {
		super(name, age, sex);
		this.department = department;
		this.pay = pay;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String info() {
		return super.info()+"，部门："+this.getDepartment()+"，月薪："+this.getPay();
	}
}
public class Example2 {

	public static void main(String[] args) {
		Administrator ad = new Administrator("张三",30,"男","经理","500000.0");
		Worker wo = new Worker("李四",25,"女","部门：",1500.0);
		System.out.println(ad.info());
		System.out.println(wo.info());

	}

}
