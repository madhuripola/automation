import java.io.File;

public class IoExample2 {

	public static void main(String[] args) throws Exception {
		File folder = new File("SDET");
		folder.mkdir();
		System.out.println(folder.isDirectory());
		String str = "mahi.txt";
		File file1 = new File(folder, "sindhu.txt");

		file1.createNewFile();
		System.out.println(file1.isFile());
		File f = new File(folder, str);
		f.createNewFile();
		File path = new File("C:\\Users\\lalitha madhuri\\Documents\\prjava");
		File file2 = new File(path, "Rukku.txt");
		file2.createNewFile();
		File path1 = new File("C:\\Users\\lalitha madhuri\\Documents\\javaprograms");

		String[] alllists = path1.list();
		for (String each : alllists) {
			System.out.println(each);
		}
		File file3 = new File("C:\\Users\\lalitha madhuri\\Documents\\prjava", "Lakshmi.txt");

		file3.createNewFile();
	}

}