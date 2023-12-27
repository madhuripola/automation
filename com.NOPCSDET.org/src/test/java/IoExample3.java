import java.io.File;
import java.io.FileWriter;

public class IoExample3 {

	public static void main(String[] args) throws Exception {
		File folder = new File("SDET1");
		folder.mkdir();
		File file = new File(folder, "pravi.txt");
		file.createNewFile();

		FileWriter fw = new FileWriter(file,true);
		fw.write("Kriti");
		fw.write("chaitu");
		fw.write("Kajal");
		FileWriter fw1=new FileWriter("C:\\Users\\lalitha madhuri\\Documents\\prjava\\Pravi.txt",true);
		fw1.write("Madhu");
		fw1.write("sindhu");
		

		fw.flush();
		fw1.flush();
		fw.close();

	}

}
