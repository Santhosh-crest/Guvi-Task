package taskpackage;
import java.util.*;
public class Question6 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();	//5
			int result=1;
			for(int i=1;i<=a;i++){
			    result*=i;  		
			}
			System.out.println(result);
        }
}


