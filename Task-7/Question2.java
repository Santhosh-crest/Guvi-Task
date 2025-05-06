package task7;
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr1="Santhosh";
		int arr[]= {1,2,3,4,5,6};
		try {
			System.out.println(arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound exception is thrown");
			//e.printStackTrace();
			try {
				System.out.println(arr1.charAt(16));
			}
			catch (StringIndexOutOfBoundsException k) {
				System.out.println("StringIndexOutOfBound exception is thrown");	
				//k.printStackTrace();
			}
			
		}
		
	}

}
