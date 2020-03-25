import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameSorter {

	private ArrayList<String> arrayName;
	private String INPUT_FILE = "unsorted-names-list.txt";
	
	NameSorter(){
		 arrayName = new ArrayList<String>();
	}

	public static void main(String[] args) {
		NameSorter ns = new NameSorter();
		
		ns.start();
		ns.sort();
		ns.writeToFile();
	}

	public void start(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					INPUT_FILE));
			String line = reader.readLine();
			while (line != null) {
				arrayName.add(line);
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sort(){
		Collections.sort(arrayName);
	}

	public void writeToFile(){
		try (PrintWriter out = new PrintWriter("sorted-names-list.txt")) {
				   for (int i=0; i<arrayName.size(); i++)  
    						out.println(arrayName.get(i));
			}catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
	public String getFileName(){
		return INPUT_FILE;
	}
	
	public int getSizeFile(){
		return arrayName.size();
	}
	
}