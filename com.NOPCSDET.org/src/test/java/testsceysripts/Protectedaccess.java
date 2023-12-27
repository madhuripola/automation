package testsceysripts;

public class Protectedaccess {
protected int a=20;
protected String str="pravi";
protected void method() {
	System.out.println("This is protercted");
	
}
		public static void main(String[] args){
			
			Protectedaccess p= new Protectedaccess();
			System.out.println(p.a);
			System.out.println(p.str);
			
		p.method();
	}
}
	
	
	
	

