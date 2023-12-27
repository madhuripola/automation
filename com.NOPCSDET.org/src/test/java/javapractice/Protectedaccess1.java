package javapractice;

public class Protectedaccess1 {
	protected int a=10;
	protected String str= "Madhuripraveen";
	protected void method(){
		Protectedaccess1 p=new Protectedaccess1();
		System.out.println(p.a);
		
		}

}
	class Outerclass{
		public static void main(String[] args) {
		Protectedaccess1 p=new Protectedaccess1();
		System.out.println(p.str);
		p.method();
	}
	}

