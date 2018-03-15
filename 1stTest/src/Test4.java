import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		new Test4().fileOpen("FileName.txt");
	}

	public void fileOpen(String fileName) {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));)
		{
			String line = null;
			while( (line = br.readLine()) != null ) {
				System.out.println(line);
			}			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
