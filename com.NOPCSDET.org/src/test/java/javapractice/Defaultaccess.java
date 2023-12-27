package javapractice;

class Defaultaccess {

	int a = 10;
	String str = "Madhuri";

	void method() {
		Defaultaccess d = new Defaultaccess();
		System.out.println(d.a);
		System.out.println(d.str);
	}

	public static void main(String[] args) {
		Defaultaccess d = new Defaultaccess();
		System.out.println(d.a);
		System.out.println(d.str);
		d.method();
	}
}

class Callindefault {
	public static void main(String[] args) {
		Defaultaccess d = new Defaultaccess();
		System.out.println(d.a);
		System.out.println(d.str);

	}
}
