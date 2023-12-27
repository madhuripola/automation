import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IoExample5 {

	public static void main(String[] args) throws Exception {
		File file4 = new File("praveen.txt");
		if (!file4.exists()) {
			file4.createNewFile();

		} else {
			System.out.println("File already exists");

		}
		FileWriter fw = new FileWriter(file4);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Madhuri");
		bw.newLine();
		bw.write("SDET");
		bw.newLine();
		bw.write("15 lacs package");

		bw.flush();
	}
}
