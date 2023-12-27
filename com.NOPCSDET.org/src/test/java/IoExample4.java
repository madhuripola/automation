import java.io.FileReader;

public class IoExample4 {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader(
				"C:\\Users\\lalitha madhuri\\Documents\\batch03\\com.NOPCSDET.org\\SDET1\\pravi.txt");
		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char) i);

		}

	}

}
