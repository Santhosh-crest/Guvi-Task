package day10;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    for(int i=a.length()-1;i>=0;i--){
	        b+=a.charAt(i);
	    }
	     System.out.println(b);
	    if(a.equals(b)){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }
    }

}
