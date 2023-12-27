package outerpack;

import javapractice.Publicaccess;

public class Callingfrmouterpublic {

	public static void main(String[] args) {

		Publicaccess p = new Publicaccess();
		System.out.println(p.a);
		System.out.println(p.str);
		p.method();
	}

}
