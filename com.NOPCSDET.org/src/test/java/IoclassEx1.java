import java.io.File;

public class IoclassEx1 {

	public static void main(String[] args)throws Exception {
		
File file=new File("Madhuri.txt");
if(!file.exists()) {
	file.createNewFile();
	
}
else {
	System.out.println("File already exists");
}
}
}