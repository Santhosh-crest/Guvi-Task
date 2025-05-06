package task7;
import java.util.*;
public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> set=new TreeMap<Integer,String>();
		set.put(300,"Shyam");
		set.put(100,"mani");
		set.put(200,"ram");
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		for(int i=0;i<set.size();i++) {
			set1.addAll(set.values());
		}
		System.out.println(set1);
	}

}
