package taskpackage;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int Count=0;
		for (int a=2;i>a;a++) { //5<2
			if (i%a==0) {
			 Count++;
			}
		}
			if (Count==0) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("this is not prime number");
			}
	 	
		}

	}

