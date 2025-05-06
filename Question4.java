package task7;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader file=new FileReader("D:\\JAVA Videos\\oops.txt");
		System.out.println("File available");
		}		
		catch(FileNotFoundException e) {
			System.out.print("file not available");
			e.printStackTrace();
		}
		
	}

}
