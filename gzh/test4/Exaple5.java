package cn.gzh.test4;
class Goods {
    private String goods;

	public Goods(String goods) {
		super();
		this.goods = goods;
	}

	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
}
class Market {
    private String Market;
    private Goods[] Goods;
	public Market(String market, cn.gzh.test4.Goods[] goods) {
		super();
		Market = market;
		Goods = goods;
	}
	
    public String getMarket() {
		return Market;
	}

	public void setMarket(String market) {
		Market = market;
	}

	public Goods[] getGoods() {
		return Goods;
	}

	public void setGoods(Goods[] goods) {
		Goods = goods;
	}

	public String sell(String name)
    {
    	String flag="no";
    	for(int i=0;i<3;i++)
    	{
    	   if(Goods[i].getGoods()==name)
    	   {
    		  flag="yes";
    	   }
		
    	}
    	return flag;
    }
}
class Person {
    private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
public class Exaple5 {

	public static void main(String[] args) {
		Goods[] goods = new Goods[3];
	       goods[0] = new Goods("������");
	       goods[1] = new Goods("ϴ�»�");
	       goods[2] = new Goods("�����");
	       Market ma = new Market("���ָ�",goods);
	       Person p = new Person("С��"); 
		
		  if(ma.sell("������").equals("no")) {
	       System.out.println(p.getName()+"������һ�ˣ�"+"��"+ma.getMarket()+"ʲô��û��");
	       }else
	       {
	       System.out.println(p.getName()+"��"+ma.getMarket()+"����");  
	       }
		  if(ma.sell("����").equals("no")) {
		   System.out.print(p.getName()+"������һ�ˣ�"+"��"+ma.getMarket()+"ʲô��û��");
		   }else
		   {
		   System.out.print(p.getName()+"��"+ma.getMarket()+"����");  
		   }

	}

}
