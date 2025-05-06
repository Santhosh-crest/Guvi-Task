package task7;
import java.util.*;
public class Question7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		int arr1[]=new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			arr1[i]=arr.get(i);
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
