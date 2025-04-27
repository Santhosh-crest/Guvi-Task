package taskpackage;
import java.util.*;
public class Question10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count =0;
		while(a>0){  //153
		    a=a/10; //153/10=15, 15/10=1
		    count++; //1,2,3
		}
		System.out.println(count+" Digit Value");
	}


}
