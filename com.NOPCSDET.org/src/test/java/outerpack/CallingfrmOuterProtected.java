package outerpack;

import javapractice.Protectedaccess1;

public class CallingfrmOuterProtected extends Protectedaccess1 {
	public static void main(String[] args) {
	CallingfrmOuterProtected p=new CallingfrmOuterProtected();
	
	
	System.out.println(p.a);
	System.out.println(p.str);
	p.method();
	
	
	}
	
	
	
}
