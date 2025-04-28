package day10;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=i;j++){
	            count++;
	            System.out.print(count+" ");
	        }
	        System.out.println();
	    }
	    
	}


}
