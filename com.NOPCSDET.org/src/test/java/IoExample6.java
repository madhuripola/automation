import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IoExample6 {

	public static void main(String[] args) throws Exception {

		File file = new File("praveen.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);

		}

	}

}
