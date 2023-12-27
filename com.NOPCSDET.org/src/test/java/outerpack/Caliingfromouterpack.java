package outerpack;

import testsceysripts.Protectedaccess;
//import testsceysripts.Defaultaccess;
//import testsceysripts.Publicaccess;


public class Caliingfromouterpack extends Protectedaccess {

	public static void main(String[] args) {
		//Defaultaccess d= new Defaultaccess();
		
		//Publicaccess p=new Publicaccess();
	//System.out.println(p.a);
	//System.out.println(p.str);
		
	//p.method();
	
		 Caliingfromouterpack p=new  Caliingfromouterpack();
		System.out.println(p.a);
		
		System.out.println(p.str);
		p.method();
		
	}

}
